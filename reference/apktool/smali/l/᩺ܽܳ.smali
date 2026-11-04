.class public final Ll/᩺ܽܳ;
.super Ljava/lang/Object;
.source "76ID"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ۙ:Ll/᩶ܽܳ;

.field public final synthetic ۤ:Landroid/widget/TextView;

.field public final synthetic ᩷:Ll/ܽܺܳ;


# direct methods
.method public constructor <init>(Ll/᩶ܽܳ;Landroid/widget/TextView;Ll/ܽܺܳ;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ܽܳ;->ۙ:Ll/᩶ܽܳ;

    iput-object p2, p0, Ll/᩺ܽܳ;->ۤ:Landroid/widget/TextView;

    iput-object p3, p0, Ll/᩺ܽܳ;->᩷:Ll/ܽܺܳ;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .line 115
    iget-object v0, p0, Ll/᩺ܽܳ;->ۙ:Ll/᩶ܽܳ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const v1, 0x7f120564

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ܽܳ;->ۤ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_0

    .line 117
    iget-object p1, p0, Ll/᩺ܽܳ;->᩷:Ll/ܽܺܳ;

    invoke-virtual {p1, p2}, Ll/ܽܺܳ;->ۙ(I)V

    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
