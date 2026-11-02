.class public final Ll/ۙ֫;
.super Ljava/lang/Object;
.source "95QI"


# direct methods
.method public static ۙ(Landroid/view/View;Ll/ᩳ᩻;)Ll/ᩳ᩻;
    .locals 1

    .line 3253
    invoke-virtual {p1}, Ll/ᩳ᩻;->ۖ()Landroid/view/ContentInfo;

    move-result-object v0

    .line 3254
    invoke-virtual {p0, v0}, Landroid/view/View;->performReceiveContent(Landroid/view/ContentInfo;)Landroid/view/ContentInfo;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-ne p0, v0, :cond_1

    return-object p1

    .line 163
    :cond_1
    new-instance p1, Ll/ᩳ᩻;

    new-instance v0, Ll/᩺᩻;

    invoke-direct {v0, p0}, Ll/᩺᩻;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {p1, v0}, Ll/ᩳ᩻;-><init>(Ll/ܶ᩻;)V

    return-object p1
.end method

.method public static ۙ(Landroid/view/View;[Ljava/lang/String;Ll/ۖܳ;)V
    .locals 1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 3236
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setOnReceiveContentListener([Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V

    return-void

    .line 3238
    :cond_0
    new-instance v0, Ll/ܰ֫;

    invoke-direct {v0, p2}, Ll/ܰ֫;-><init>(Ll/ۖܳ;)V

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setOnReceiveContentListener([Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V

    return-void
.end method

.method public static ۙ(Landroid/view/View;)[Ljava/lang/String;
    .locals 0

    .line 3246
    invoke-virtual {p0}, Landroid/view/View;->getReceiveContentMimeTypes()[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
