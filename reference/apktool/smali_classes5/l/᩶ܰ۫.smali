.class public final synthetic Ll/᩶ܰ۫;
.super Ljava/lang/Object;
.source "V89B"

# interfaces
.implements Ll/֨֨;


# instance fields
.field public final synthetic ֫:Ll/᩹ۖ᩸;

.field public final synthetic ۙ:Ll/֨ܶ;

.field public final synthetic ۚ:Ll/᩹ۖ᩸;

.field public final synthetic ۤ:Ll/᩹ۖ᩸;

.field public final synthetic ۧ:Ll/᩹ۖ᩸;

.field public final synthetic ۫:Ll/ܽ֡֫;

.field public final synthetic ܳ:Ll/֫ۖ᩸;

.field public final synthetic ᩴ:Ll/֫ۖ᩸;

.field public final synthetic ᩷:Landroid/widget/AutoCompleteTextView;

.field public final synthetic ᩸:Ll/֫ۖ᩸;

.field public final synthetic ᩻:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/֨ܶ;Landroid/widget/AutoCompleteTextView;Ll/֫ۖ᩸;Ll/֫ۖ᩸;Ll/֫ۖ᩸;Ll/ܽ֡֫;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܰ۫;->ۙ:Ll/֨ܶ;

    iput-object p2, p0, Ll/᩶ܰ۫;->᩷:Landroid/widget/AutoCompleteTextView;

    iput-object p3, p0, Ll/᩶ܰ۫;->᩸:Ll/֫ۖ᩸;

    iput-object p4, p0, Ll/᩶ܰ۫;->ᩴ:Ll/֫ۖ᩸;

    iput-object p5, p0, Ll/᩶ܰ۫;->ܳ:Ll/֫ۖ᩸;

    iput-object p6, p0, Ll/᩶ܰ۫;->۫:Ll/ܽ֡֫;

    iput-object p7, p0, Ll/᩶ܰ۫;->ۚ:Ll/᩹ۖ᩸;

    iput-object p8, p0, Ll/᩶ܰ۫;->֫:Ll/᩹ۖ᩸;

    iput-object p9, p0, Ll/᩶ܰ۫;->ۧ:Ll/᩹ۖ᩸;

    iput-object p10, p0, Ll/᩶ܰ۫;->᩻:Ll/᩹ۖ᩸;

    iput-object p11, p0, Ll/᩶ܰ۫;->ۤ:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 9

    .line 3
    move-object v1, p1

    check-cast v1, Ll/᩺ܰ۫;

    .line 230
    invoke-virtual {v1}, Ll/᩺ܰ۫;->᩸()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    iget-object v2, p0, Ll/᩶ܰ۫;->ۙ:Ll/֨ܶ;

    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 231
    iget-object p1, p0, Ll/᩶ܰ۫;->᩷:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 232
    invoke-virtual {v1}, Ll/᩺ܰ۫;->ۙ()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Ll/᩶ܰ۫;->᩸:Ll/֫ۖ᩸;

    invoke-virtual {v2, p1}, Ll/֫ۖ᩸;->ۙ(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v1}, Ll/᩺ܰ۫;->᩷()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Ll/᩶ܰ۫;->ᩴ:Ll/֫ۖ᩸;

    invoke-virtual {v2, p1}, Ll/֫ۖ᩸;->ۙ(Ljava/lang/String;)V

    .line 234
    invoke-virtual {v1}, Ll/᩺ܰ۫;->ܳ()Z

    move-result p1

    iget-object v8, p0, Ll/᩶ܰ۫;->ܳ:Ll/֫ۖ᩸;

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    .line 235
    invoke-virtual {v8, p1}, Ll/֫ۖ᩸;->᩷(I)V

    const p1, 0x7f080254

    .line 236
    invoke-virtual {v8, p1}, Ll/֫ۖ᩸;->ۙ(I)V

    .line 237
    new-instance p1, Ll/ۢܰ۫;

    iget-object v2, p0, Ll/᩶ܰ۫;->۫:Ll/ܽ֡֫;

    iget-object v3, p0, Ll/᩶ܰ۫;->ۚ:Ll/᩹ۖ᩸;

    iget-object v4, p0, Ll/᩶ܰ۫;->֫:Ll/᩹ۖ᩸;

    iget-object v5, p0, Ll/᩶ܰ۫;->ۧ:Ll/᩹ۖ᩸;

    iget-object v6, p0, Ll/᩶ܰ۫;->᩻:Ll/᩹ۖ᩸;

    iget-object v7, p0, Ll/᩶ܰ۫;->ۤ:Ll/᩹ۖ᩸;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Ll/ۢܰ۫;-><init>(Ll/᩺ܰ۫;Ll/ܽ֡֫;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    invoke-virtual {v8, p1}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View$OnClickListener;)V

    return-void

    .line 239
    :cond_1
    invoke-virtual {v8, v0}, Ll/֫ۖ᩸;->᩷(I)V

    return-void
.end method
