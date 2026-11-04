.class public final synthetic Ll/᩸ᩳ;
.super Ljava/lang/Object;
.source "G55Z"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۤ֨ܳ;
.implements Ll/᩸ۛܽ;


# direct methods
.method public static ۙ(DDDD)D
    .locals 0

    mul-double p0, p0, p2

    add-double/2addr p0, p4

    div-double/2addr p0, p6

    return-wide p0
.end method

.method public static bridge synthetic ۙ(Landroid/graphics/Insets;)I
    .locals 0

    .line 0
    iget p0, p0, Landroid/graphics/Insets;->right:I

    return p0
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 150
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public construct()Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 429
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
