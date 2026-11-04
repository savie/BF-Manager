.class public final Ll/ܿۗ۫;
.super Ll/֡ۗ۫;
.source "5AG9"


# direct methods
.method public static ۙ(Ll/ܽ֡֫;Landroid/widget/TextView;Ll/֡ۗ۫;)Ll/ܿۗ۫;
    .locals 2

    .line 196
    new-instance v0, Ll/ܿۗ۫;

    const/4 v1, -0x1

    .line 201
    invoke-direct {v0, v1}, Ll/֡ۗ۫;-><init>(I)V

    .line 202
    invoke-virtual {v0, p2}, Ll/֡ۗ۫;->᩷(Ll/֡ۗ۫;)V

    .line 203
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f120c37

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " >>"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    new-instance p2, Ll/᩵ۗ۫;

    invoke-direct {p2, v0, p0}, Ll/᩵ۗ۫;-><init>(Ll/ܿۗ۫;Ll/ܽ֡֫;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 151
    invoke-virtual {p0}, Ll/֡ۗ۫;->clone()Ll/֡ۗ۫;

    move-result-object v0

    return-object v0
.end method

.method public final getIcon()Ll/᩵ܰܳ;
    .locals 1

    .line 181
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 166
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 156
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ۙ(I)Ll/ᩳۛ۫;
    .locals 0

    .line 176
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ll/ܽ֡֫;)V
    .locals 0

    .line 191
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 161
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 186
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 171
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method
