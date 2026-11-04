.class public final Ll/۟ܺ֫;
.super Landroid/app/Dialog;
.source "OIRX"


# instance fields
.field public final ֡:Ll/᩸ܺ֫;

.field public ۟:Ll/۠ۖۧ;

.field public final ܰ:Ll/ܽ֡֫;

.field public final ܿ:Landroid/view/MenuItem;

.field public ᩶:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 54
    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    if-eqz p2, :cond_4

    .line 55
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 56
    iput-object p2, p0, Ll/۟ܺ֫;->᩶:Landroid/graphics/Bitmap;

    .line 57
    iput-object p1, p0, Ll/۟ܺ֫;->ܰ:Ll/ܽ֡֫;

    const/4 p1, 0x1

    .line 58
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    const/4 p2, 0x0

    .line 59
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 61
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 62
    new-instance v1, Ll/᩸ܺ֫;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    .line 76
    invoke-direct {v1, v2, v3}, Ll/᩸ܺ֫;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 62
    iput-object v1, p0, Ll/۟ܺ֫;->֡:Ll/᩸ܺ֫;

    const v2, 0x7f0a0236

    .line 63
    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    .line 64
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    new-instance v2, Ll/ۡ۫;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f1302f7

    invoke-direct {v2, v4, v5}, Ll/ۡ۫;-><init>(Landroid/content/Context;I)V

    .line 68
    new-instance v4, Ll/ܶ᩹;

    invoke-direct {v4, v2}, Ll/ܶ᩹;-><init>(Landroid/content/Context;)V

    const v5, 0x7f0a068a

    .line 69
    invoke-virtual {v4, v5}, Landroid/view/View;->setId(I)V

    const/high16 v5, 0x66000000

    .line 70
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundColor(I)V

    const v5, -0xf0f10

    .line 71
    invoke-virtual {v4, v5}, Ll/ܶ᩹;->setTitleTextColor(I)V

    .line 72
    invoke-virtual {v4, p3}, Ll/ܶ᩹;->setTitle(Ljava/lang/CharSequence;)V

    const p3, 0x7f08003d

    .line 73
    invoke-static {v2, p3}, Ll/֡ۧۤ;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 76
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 77
    invoke-static {p3, v5}, Ll/֡ᩳ;->᩷(Landroid/graphics/drawable/Drawable;I)V

    .line 79
    :cond_0
    invoke-virtual {v4, p3}, Ll/ܶ᩹;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    const p3, 0x7f12018c

    .line 80
    invoke-virtual {v4, p3}, Ll/ܶ᩹;->setNavigationContentDescription(I)V

    .line 81
    new-instance p3, Ll/ۘܺ֫;

    invoke-direct {p3, p0}, Ll/ۘܺ֫;-><init>(Ll/۟ܺ֫;)V

    invoke-virtual {v4, p3}, Ll/ܶ᩹;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p3, 0x7f0801c3

    .line 82
    invoke-static {v2, p3}, Ll/֡ۧۤ;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 84
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 85
    invoke-static {p3, v5}, Ll/֡ᩳ;->᩷(Landroid/graphics/drawable/Drawable;I)V

    .line 87
    :cond_1
    invoke-virtual {v4}, Ll/ܶ᩹;->getMenu()Landroid/view/Menu;

    move-result-object v2

    const v5, 0x7f12078d

    invoke-interface {v2, p2, v5, p2, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    .line 88
    invoke-interface {v2, p3}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object p3

    iput-object p3, p0, Ll/۟ܺ֫;->ܿ:Landroid/view/MenuItem;

    const/4 v2, 0x2

    .line 89
    invoke-interface {p3, v2}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 90
    new-instance p3, Ll/֫ܿۧ;

    invoke-direct {p3, p0, p4}, Ll/֫ܿۧ;-><init>(Ljava/lang/Object;Ljava/io/Serializable;)V

    invoke-virtual {v4, p3}, Ll/ܶ᩹;->setOnMenuItemClickListener(Ll/᩻᩹;)V

    .line 95
    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p4, -0x2

    invoke-direct {p3, v3, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 99
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p3

    if-eqz p3, :cond_3

    const p4, 0x7f130149

    .line 101
    invoke-virtual {p3, p4}, Landroid/view/Window;->setWindowAnimations(I)V

    const p4, 0x106000d

    .line 102
    invoke-virtual {p3, p4}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 103
    invoke-virtual {p3, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 104
    invoke-static {p3, p2}, Ll/ܿ۠;->ۙ(Landroid/view/Window;Z)V

    .line 105
    invoke-virtual {p3, p2}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 106
    invoke-virtual {p3, p2}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 107
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt p4, v2, :cond_3

    .line 108
    invoke-virtual {p3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    const/16 v3, 0x1e

    if-lt p4, v3, :cond_2

    const/4 p1, 0x3

    .line 111
    :cond_2
    invoke-static {v2, p1}, Ll/ۚܽۤ;->ۙ(Landroid/view/WindowManager$LayoutParams;I)V

    .line 112
    invoke-virtual {p3, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 115
    :cond_3
    new-instance p1, Ll/ᩳ᩵ᩴ;

    invoke-direct {p1, v4}, Ll/ᩳ᩵ᩴ;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Ll/᩸۠;->ۙ(Landroid/view/View;Ll/᩸ۖ;)V

    .line 122
    new-instance p1, Ll/ܰܺ֫;

    invoke-direct {p1, p0}, Ll/ܰܺ֫;-><init>(Ll/۟ܺ֫;)V

    invoke-virtual {v1, p1}, Ll/᩸ܺ֫;->ۙ(Ll/ۜۚ֫;)V

    .line 127
    new-instance p1, Ll/᩶ܺ֫;

    invoke-direct {p1, p0}, Ll/᩶ܺ֫;-><init>(Ll/۟ܺ֫;)V

    invoke-virtual {v1, p1, p2}, Ll/᩸ܺ֫;->ۙ(Ll/۠ۚ֫;I)V

    return-void

    .line 55
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid cover bitmap"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ۙ(Ll/۟ܺ֫;)Ll/ܽ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ܺ֫;->ܰ:Ll/ܽ֡֫;

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/۟ܺ֫;Ll/۠ۖۧ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۟ܺ֫;->۟:Ll/۠ۖۧ;

    return-void
.end method

.method public static ۙ(Ll/۟ܺ֫;Ljava/lang/String;Landroid/view/MenuItem;)Z
    .locals 3

    .line 91
    iget-object v0, p0, Ll/۟ܺ֫;->ܿ:Landroid/view/MenuItem;

    const/4 v1, 0x0

    if-eq p2, v0, :cond_0

    return v1

    .line 164
    :cond_0
    iget-object p2, p0, Ll/۟ܺ֫;->᩶:Landroid/graphics/Bitmap;

    if-eqz p2, :cond_2

    .line 165
    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 166
    :cond_1
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 167
    new-instance v0, Ll/ܿܺ֫;

    invoke-direct {v0, p0, p1, p2}, Ll/ܿܺ֫;-><init>(Ll/۟ܺ֫;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 206
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic ۤ(Ll/۟ܺ֫;)Landroid/view/MenuItem;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ܺ֫;->ܿ:Landroid/view/MenuItem;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/۟ܺ֫;)Landroid/graphics/Bitmap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ܺ֫;->᩶:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static ᩸(Ll/۟ܺ֫;)Z
    .locals 1

    .line 210
    iget-object v0, p0, Ll/۟ܺ֫;->ܰ:Ll/ܽ֡֫;

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    .line 211
    invoke-virtual {v0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p0

    invoke-virtual {p0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object p0

    sget-object v0, Ll/ۖۧۙ;->ۢ:Ll/ۖۧۙ;

    invoke-virtual {p0, v0}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final dismiss()V
    .locals 2

    .line 234
    iget-object v0, p0, Ll/۟ܺ֫;->۟:Ll/۠ۖۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 235
    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 236
    iput-object v1, p0, Ll/۟ܺ֫;->۟:Ll/۠ۖۧ;

    .line 239
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 240
    iget-object v0, p0, Ll/۟ܺ֫;->֡:Ll/᩸ܺ֫;

    invoke-virtual {v0}, Ll/᩸ܺ֫;->ᩴ()V

    .line 241
    iput-object v1, p0, Ll/۟ܺ֫;->᩶:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 144
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 145
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 147
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 153
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 155
    :cond_1
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    .line 136
    new-instance v2, Ll/ᩳۜ;

    invoke-direct {v2, v0, v1}, Ll/ᩳۜ;-><init>(Landroid/view/Window;Landroid/view/View;)V

    const/4 v0, 0x0

    .line 156
    invoke-virtual {v2, v0}, Ll/ᩳۜ;->᩷(Z)V

    .line 157
    invoke-virtual {v2, v0}, Ll/ᩳۜ;->ۙ(Z)V

    const/4 v0, 0x2

    .line 158
    invoke-virtual {v2, v0}, Ll/ᩳۜ;->᩷(I)V

    const/4 v0, 0x7

    .line 159
    invoke-virtual {v2, v0}, Ll/ᩳۜ;->ۤ(I)V

    return-void
.end method
