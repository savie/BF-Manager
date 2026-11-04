.class public abstract Ll/۠ۢᩴ;
.super Ljava/lang/Object;
.source "S5F9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final ֡:Landroid/widget/FrameLayout;

.field public final ֨:Landroid/widget/TextView;

.field public ۖ:Landroid/view/View$OnLongClickListener;

.field public ۟:Z

.field public final ۠:Landroid/widget/TextView;

.field public ۡ:Landroid/view/View$OnClickListener;

.field public final ۢ:Landroid/widget/TextView;

.field public final ܰ:Ll/ܽ֡֫;

.field public final ܿ:Ll/᩹ۖ᩸;

.field public final ᩳ:Ll/֫ۖ᩸;

.field public final ᩶:Ll/۠ۖۧ;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;I)V
    .locals 4

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 219
    iput-boolean v0, p0, Ll/۠ۢᩴ;->۟:Z

    .line 43
    iput-object p1, p0, Ll/۠ۢᩴ;->ܰ:Ll/ܽ֡֫;

    const v1, 0x7f0d00a0

    .line 44
    invoke-virtual {p1, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0681

    .line 45
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۠ۢᩴ;->۠:Landroid/widget/TextView;

    const v2, 0x7f0a02ba

    .line 46
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/֫ۖ᩸;

    iput-object v2, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    const v2, 0x7f0a03f4

    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۠ۢᩴ;->ۢ:Landroid/widget/TextView;

    const v2, 0x7f0a03f7

    .line 48
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۠ۢᩴ;->֨:Landroid/widget/TextView;

    const v2, 0x7f0a0186

    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹ۖ᩸;

    iput-object v2, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    const v3, 0x7f0a0116

    .line 50
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    iput-object v3, p0, Ll/۠ۢᩴ;->֡:Landroid/widget/FrameLayout;

    .line 52
    sget v3, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v3, Ll/ۖۖۧ;

    invoke-direct {v3, p1}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 53
    invoke-virtual {v3, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    .line 54
    invoke-virtual {v3, v0}, Ll/ۖۖۧ;->ۙ(Z)V

    const p1, 0x7f1208c9

    const/4 v0, 0x0

    .line 55
    invoke-virtual {v3, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120161

    invoke-virtual {v3, p1, p0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    .line 57
    invoke-virtual {v3, p2, p0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 58
    :cond_0
    invoke-virtual {v3}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۢᩴ;->᩶:Ll/۠ۖۧ;

    .line 59
    new-instance p2, Ll/֨ۢᩴ;

    invoke-direct {p2, p0}, Ll/֨ۢᩴ;-><init>(Ll/۠ۢᩴ;)V

    invoke-virtual {p1, p2}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 69
    invoke-virtual {p1, p0}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 70
    new-instance p1, Ll/ۡۢᩴ;

    invoke-direct {p1, p0}, Ll/ۡۢᩴ;-><init>(Ll/۠ۢᩴ;)V

    invoke-virtual {v2, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public static ۙ(Ll/۠ۢᩴ;ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 71
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩹ۖ᩸;->ۘۙ()I

    move-result v1

    const v2, 0x2000f

    and-int/2addr v1, v2

    const v2, 0x20001

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x42

    if-eq p1, v1, :cond_1

    const/16 v1, 0xa0

    if-ne p1, v1, :cond_2

    .line 73
    :cond_1
    invoke-virtual {v0}, Ll/᩹ۖ᩸;->᩺ۙ()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_3

    const/4 v0, 0x6

    if-eq p1, v0, :cond_3

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0

    .line 78
    :cond_3
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_4

    .line 79
    invoke-virtual {p0}, Ll/۠ۢᩴ;->ܶ()V

    :cond_4
    return p2
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    const/4 p1, -0x2

    if-ne p2, p1, :cond_0

    .line 106
    invoke-virtual {p0}, Ll/۠ۢᩴ;->ܺ()V

    return-void

    .line 108
    :cond_0
    invoke-virtual {p0}, Ll/۠ۢᩴ;->ܽ()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 417
    invoke-virtual {p0}, Ll/۠ۢᩴ;->ܶ()V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 305
    iget-object v0, p0, Ll/۠ۢᩴ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final ۗ()V
    .locals 2

    .line 285
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->᩹(I)V

    return-void
.end method

.method public final ۘ()V
    .locals 2

    .line 300
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    const/16 v1, 0xd

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۤ(F)V

    return-void
.end method

.method public final ۙ()V
    .locals 1

    .line 367
    new-instance v0, Ll/ۖۢᩴ;

    invoke-direct {v0, p0}, Ll/ۖۢᩴ;-><init>(Ll/۠ۢᩴ;)V

    invoke-virtual {p0, v0}, Ll/۠ۢᩴ;->ۙ(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final ۙ(I)V
    .locals 2

    .line 154
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 155
    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 156
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final ۙ(II)V
    .locals 1

    .line 280
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1, p2}, Ll/᩹ۖ᩸;->ۧ(II)V

    return-void
.end method

.method public final ۙ(ILandroid/view/View$OnClickListener;Ll/֫֫۫;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    .line 235
    :cond_0
    iput-object p2, p0, Ll/۠ۢᩴ;->ۡ:Landroid/view/View$OnClickListener;

    .line 236
    iput-object p3, p0, Ll/۠ۢᩴ;->ۖ:Landroid/view/View$OnLongClickListener;

    .line 237
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    iget-object p3, p0, Ll/۠ۢᩴ;->᩶:Ll/۠ۖۧ;

    const/4 v0, -0x3

    invoke-virtual {p3, v0, p1, p2}, Ll/۠ۖۧ;->ۙ(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const/4 p1, 0x1

    .line 238
    iput-boolean p1, p0, Ll/۠ۢᩴ;->۟:Z

    return-void
.end method

.method public final ۙ(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 310
    iget-object v0, p0, Ll/۠ۢᩴ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final ۙ(Landroid/text/TextWatcher;)V
    .locals 1

    .line 185
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 248
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 346
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Ll/ܺܽܳ;)V
    .locals 3

    .line 394
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    const v1, 0x7f08023e

    invoke-virtual {v0, v1}, Ll/֫ۖ᩸;->ۙ(I)V

    .line 395
    iget-object v1, p0, Ll/۠ۢᩴ;->ܰ:Ll/ܽ֡֫;

    const v2, 0x7f1203fd

    invoke-virtual {v1, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֫ۖ᩸;->ۙ(Ljava/lang/CharSequence;)V

    .line 396
    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View$OnClickListener;)V

    const/4 p1, -0x1

    .line 397
    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->᩷(I)V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 1

    .line 128
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ᩴ(Z)V

    return-void
.end method

.method public final ۚ()Landroid/widget/Button;
    .locals 1

    .line 389
    iget-object v0, p0, Ll/۠ۢᩴ;->᩶:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 263
    iget-object v1, p0, Ll/۠ۢᩴ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 264
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ۛ()V
    .locals 2

    .line 315
    iget-object v0, p0, Ll/۠ۢᩴ;->ۢ:Landroid/widget/TextView;

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    return-void
.end method

.method public final ۤ()Ll/ܽ֡֫;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/۠ۢᩴ;->ܰ:Ll/ܽ֡֫;

    return-object v0
.end method

.method public final ۤ(I)V
    .locals 1

    .line 362
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->ۙ(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 1

    .line 253
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩸(Ljava/lang/String;)V

    return-void
.end method

.method public final ۤ(Z)V
    .locals 1

    .line 133
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->ۗ(I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    const/4 v0, 0x0

    .line 269
    iget-object v1, p0, Ll/۠ۢᩴ;->֨:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 270
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 342
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    invoke-virtual {v0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v0

    return v0
.end method

.method public final ۨ()V
    .locals 1

    .line 146
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    invoke-virtual {v0}, Ll/֫ۖ᩸;->ᩴ()V

    return-void
.end method

.method public final ۫()Landroid/widget/TextView;
    .locals 1

    .line 406
    iget-object v0, p0, Ll/۠ۢᩴ;->ۢ:Landroid/widget/TextView;

    return-object v0
.end method

.method public final ۫(I)V
    .locals 1

    .line 164
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->۟(I)V

    return-void
.end method

.method public final ܰ()V
    .locals 2

    const/4 v0, 0x2

    .line 138
    iget-object v1, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->ۗ(I)V

    return-void
.end method

.method public final ܳ()Landroid/widget/FrameLayout;
    .locals 1

    .line 402
    iget-object v0, p0, Ll/۠ۢᩴ;->֡:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final ܳ(I)V
    .locals 2

    .line 295
    new-instance v0, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x1

    new-array p1, p1, [Landroid/text/InputFilter;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 2

    .line 258
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    const/4 v1, 0x1

    .line 2119
    invoke-virtual {v0, p1, v1}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public abstract ܶ()V
.end method

.method public ܺ()V
    .locals 0

    return-void
.end method

.method public final ܺ(I)V
    .locals 1

    .line 332
    iget-object v0, p0, Ll/۠ۢᩴ;->۠:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method

.method public final ᩴ()Ll/ᩳ۬᩸;
    .locals 1

    .line 198
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ(I)V
    .locals 1

    .line 175
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->ܿ(I)V

    return-void
.end method

.method public final ᩴ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 326
    iget-object v1, p0, Ll/۠ۢᩴ;->֨:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 327
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩵()V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/۠ۢᩴ;->᩶:Ll/۠ۖۧ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/۠ۖۧ;->ۙ(Z)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 190
    iget-object v0, p0, Ll/۠ۢᩴ;->᩶:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public final ᩷(I)V
    .locals 1

    .line 351
    iget-object v0, p0, Ll/۠ۢᩴ;->ܰ:Ll/ܽ֡֫;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 346
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩷(Ljava/lang/CharSequence;)V
    .locals 1

    .line 337
    iget-object v0, p0, Ll/۠ۢᩴ;->۠:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 1

    .line 356
    iget-object v0, p0, Ll/۠ۢᩴ;->ᩳ:Ll/֫ۖ᩸;

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->ۤ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩷(Z)V
    .locals 3

    .line 206
    iget-object v0, p0, Ll/۠ۢᩴ;->᩶:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ۚ()V

    .line 207
    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    iget-boolean v1, p0, Ll/۠ۢᩴ;->۟:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/۠ۢᩴ;->ۡ:Landroid/view/View$OnClickListener;

    if-eqz v1, :cond_0

    .line 209
    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v1

    iget-object v2, p0, Ll/۠ۢᩴ;->ۡ:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    :cond_0
    iget-boolean v1, p0, Ll/۠ۢᩴ;->۟:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/۠ۢᩴ;->ۖ:Landroid/view/View$OnLongClickListener;

    if-eqz v1, :cond_1

    .line 211
    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Ll/۠ۢᩴ;->ۖ:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_1
    if-eqz p1, :cond_2

    .line 213
    iget-object p1, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    :cond_2
    return-void
.end method

.method public final ᩸()Ll/۠ۖۧ;
    .locals 1

    .line 410
    iget-object v0, p0, Ll/۠ۢᩴ;->᩶:Ll/۠ۖۧ;

    return-object v0
.end method

.method public final ᩸(I)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩶(I)V

    return-void
.end method

.method public final ᩸(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 320
    iget-object v1, p0, Ll/۠ۢᩴ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 321
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩹()V
    .locals 1

    .line 290
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩹ۖ᩸;->֡᩸()V

    return-void
.end method

.method public final ᩺()V
    .locals 2

    const/16 v0, 0x8

    .line 170
    iget-object v1, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->ᩳ(I)V

    return-void
.end method

.method public final ᩻()V
    .locals 2

    .line 120
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    const v1, 0x20001

    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->ܿ(I)V

    return-void
.end method

.method public final ᩻(I)V
    .locals 1

    .line 275
    iget-object v0, p0, Ll/۠ۢᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩹(I)V

    return-void
.end method
