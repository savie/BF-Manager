.class public final Ll/֡ۧۤ;
.super Ljava/lang/Object;
.source "C611"

# interfaces
.implements Ll/᩸ۧۤ;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֡ۧۤ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 64
    invoke-static {}, Ll/᩸ܶ;->ۙ()Ll/᩸ܶ;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ll/᩸ܶ;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/view/View;)V
    .locals 4

    const v0, 0x7f0a0464

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Rect;

    .line 19
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static ۙ(Landroid/view/View;IIII)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    :cond_0
    if-ne p2, v0, :cond_1

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    :cond_1
    if-ne p3, v0, :cond_2

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    :cond_2
    if-ne p4, v0, :cond_3

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    .line 54
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static ᩷(Landroid/view/View;)V
    .locals 5

    .line 13
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    const v1, 0x7f0a0464

    .line 14
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/֡ۧۤ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "dex-input: Dex Input - \'Load DEX files\'"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(Ljava/nio/ByteBuffer;Z)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۙ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public ۙ(Ljava/nio/ByteBuffer;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public ۙ(Ll/ᩴܺۤ;)V
    .locals 2

    .line 13
    new-instance v0, Ll/ܰ֫ۤ;

    invoke-direct {v0}, Ll/ܰ֫ۤ;-><init>()V

    .line 14
    invoke-virtual {p1}, Ll/ᩴܺۤ;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰ֫ۤ;

    invoke-virtual {v1}, Ll/ܰ֫ۤ;->ܶ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܰ֫ۤ;->ۙ(Z)V

    .line 15
    invoke-virtual {p1, v0}, Ll/ᩴܺۤ;->ۙ(Ll/ܰ֫ۤ;)V

    return-void
.end method
