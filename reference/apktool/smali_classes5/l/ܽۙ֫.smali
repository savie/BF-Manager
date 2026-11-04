.class public final synthetic Ll/ܽۙ֫;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/ܶ᩻ۙ;


# instance fields
.field public final synthetic ܰ:Ll/ۗ᩶᩻;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۗ᩶᩻;Ll/ܽ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۙ֫;->ܰ:Ll/ۗ᩶᩻;

    iput-object p2, p0, Ll/ܽۙ֫;->᩶:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 259
    instance-of v0, p1, Ll/֡۬ۚ;

    if-eqz v0, :cond_0

    const v0, 0x7f12090c

    .line 260
    iget-object v1, p0, Ll/ܽۙ֫;->᩶:Ll/ܽ֡֫;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 259
    :goto_0
    iget-object v1, p0, Ll/ܽۙ֫;->ܰ:Ll/ۗ᩶᩻;

    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 261
    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq v0, p1, :cond_1

    .line 262
    invoke-virtual {v1, p1}, Ll/ۗ᩶᩻;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 264
    :cond_1
    invoke-virtual {v1}, Ll/ۗ᩶᩻;->ۤ()V

    return-void
.end method
