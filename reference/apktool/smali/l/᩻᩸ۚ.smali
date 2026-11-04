.class public final Ll/᩻᩸ۚ;
.super Ll/᩶۫ܺ;
.source "Y6Y9"


# instance fields
.field public final synthetic ܰ:Ll/᩺ۤۚ;

.field public final synthetic ܿ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ll/֫ۖ᩸;


# direct methods
.method public constructor <init>(Ll/֫ۖ᩸;Ll/᩺ۤۚ;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 364
    iput-object p1, p0, Ll/᩻᩸ۚ;->᩶:Ll/֫ۖ᩸;

    iput-object p2, p0, Ll/᩻᩸ۚ;->ܰ:Ll/᩺ۤۚ;

    iput-object p3, p0, Ll/᩻᩸ۚ;->ܿ:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 367
    iget-object p1, p0, Ll/᩻᩸ۚ;->᩶:Ll/֫ۖ᩸;

    iget-object v0, p0, Ll/᩻᩸ۚ;->ܰ:Ll/᩺ۤۚ;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 368
    invoke-virtual {v0}, Ll/᩺ۤۚ;->run()V

    .line 369
    iget-object v0, p0, Ll/᩻᩸ۚ;->ܿ:Ll/᩹ۖ᩸;

    .line 745
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳۚۤ;->᩷(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const v2, 0x7f120a1a

    .line 747
    invoke-static {v2}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 749
    invoke-virtual {p1, v2}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 750
    invoke-virtual {p1, v1}, Ll/֫ۖ᩸;->᩷(Z)V

    :goto_0
    if-eqz v0, :cond_1

    .line 370
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Ll/֡ܳۚ;->᩸()I

    move-result v2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {p1, v1}, Ll/֫ۖ᩸;->ۙ(Z)V

    return-void
.end method
