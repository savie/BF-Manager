.class public final synthetic Ll/۬᩷ᩴ;
.super Ljava/lang/Object;
.source "SIRR"

# interfaces
.implements Landroid/text/InputFilter;


# virtual methods
.method public final filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 4

    .line 23
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p1

    int-to-long v0, p1

    sub-int p1, p6, p5

    int-to-long v2, p1

    sub-long/2addr v0, v2

    int-to-long v2, p3

    add-long/2addr v0, v2

    int-to-long p1, p2

    sub-long/2addr v0, p1

    const-wide/32 p1, 0xc350

    cmp-long p3, v0, p1

    if-gtz p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 24
    :cond_0
    invoke-interface {p4, p5, p6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
