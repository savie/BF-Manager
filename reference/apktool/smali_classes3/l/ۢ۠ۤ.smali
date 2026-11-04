.class public final Ll/ۢ۠ۤ;
.super Ljava/lang/Object;
.source "Y184"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Landroid/text/TextWatcher;


# instance fields
.field public ֡:Ll/֫ۖ᩸;

.field public ۟:Ll/᩸ۜۤ;

.field public ܰ:Landroid/widget/CheckBox;

.field public ܿ:Landroid/widget/TextView;

.field public ᩳ:Landroid/widget/CheckBox;

.field public ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public constructor <init>(Landroid/view/View;IIIII)V
    .locals 0

    .line 601
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 602
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Ll/ۢ۠ۤ;->ܿ:Landroid/widget/TextView;

    .line 603
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/֫ۖ᩸;

    iput-object p2, p0, Ll/ۢ۠ۤ;->֡:Ll/֫ۖ᩸;

    .line 604
    invoke-virtual {p1, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ۢ۠ۤ;->᩶:Ll/᩹ۖ᩸;

    .line 605
    invoke-virtual {p1, p5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/CheckBox;

    iput-object p3, p0, Ll/ۢ۠ۤ;->ܰ:Landroid/widget/CheckBox;

    .line 606
    invoke-virtual {p1, p6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Ll/ۢ۠ۤ;->ᩳ:Landroid/widget/CheckBox;

    .line 607
    invoke-virtual {p3, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 608
    invoke-virtual {p2, p0}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 609
    invoke-virtual {p3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p4

    invoke-virtual {p0, p3, p4}, Ll/ۢ۠ۤ;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    if-eqz p1, :cond_0

    .line 400
    new-instance p3, Ll/ܽۖ᩸;

    const/4 p4, 0x0

    invoke-direct {p3, p4, p2}, Ll/ܽۖ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_0
    if-eqz p1, :cond_2

    .line 402
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "INTERNAL:Regex"

    :goto_1
    const/4 p3, 0x1

    .line 2119
    invoke-virtual {p2, p1, p3}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 680
    iget-object p1, p0, Ll/ۢ۠ۤ;->֡:Ll/֫ۖ᩸;

    invoke-virtual {p1}, Ll/֫ۖ᩸;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 681
    invoke-virtual {p1, v0}, Ll/֫ۖ᩸;->᩷(Z)V

    const/4 v0, 0x0

    .line 682
    invoke-virtual {p1, v0}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    xor-int/lit8 p1, p2, 0x1

    .line 661
    iget-object v0, p0, Ll/ۢ۠ۤ;->֡:Ll/֫ۖ᩸;

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->setEnabled(Z)V

    xor-int/lit8 p1, p2, 0x1

    .line 662
    iget-object v1, p0, Ll/ۢ۠ۤ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v1, p1}, Ll/᩹ۖ᩸;->setEnabled(Z)V

    .line 663
    iget-object p1, p0, Ll/ۢ۠ۤ;->ᩳ:Landroid/widget/CheckBox;

    xor-int/lit8 v1, p2, 0x1

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    const/high16 p1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_0

    const v1, 0x3f19999a    # 0.6f

    goto :goto_0

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 664
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    if-eqz p2, :cond_1

    const p1, 0x3f19999a    # 0.6f

    .line 665
    :cond_1
    iget-object p2, p0, Ll/ۢ۠ۤ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final ۙ()V
    .locals 2

    .line 631
    iget-object v0, p0, Ll/ۢ۠ۤ;->ܰ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    .line 635
    iget-object v0, p0, Ll/ۢ۠ۤ;->ᩳ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 627
    :try_start_0
    iget-object v0, p0, Ll/ۢ۠ۤ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 651
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const v1, 0x7f120a9b

    .line 653
    invoke-virtual {p0, v1}, Ll/ۢ۠ۤ;->ۙ(I)V

    .line 654
    throw v0

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 2

    const/4 v0, 0x1

    .line 643
    iget-object v1, p0, Ll/ۢ۠ۤ;->֡:Ll/֫ۖ᩸;

    invoke-virtual {v1, v0}, Ll/֫ۖ᩸;->᩷(Z)V

    .line 644
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 645
    iget-object p1, p0, Ll/ۢ۠ۤ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public final ۙ(Ll/᩸ۜۤ;)V
    .locals 2

    .line 614
    iput-object p1, p0, Ll/ۢ۠ۤ;->۟:Ll/᩸ۜۤ;

    .line 615
    iget-object v0, p0, Ll/ۢ۠ۤ;->᩶:Ll/᩹ۖ᩸;

    iget-object v1, p1, Ll/᩸ۜۤ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 616
    iget-object v0, p0, Ll/ۢ۠ۤ;->ܰ:Landroid/widget/CheckBox;

    iget-boolean v1, p1, Ll/᩸ۜۤ;->ۙ:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 617
    iget-object v0, p0, Ll/ۢ۠ۤ;->ᩳ:Landroid/widget/CheckBox;

    iget-boolean p1, p1, Ll/᩸ۜۤ;->ۤ:Z

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method public final ۤ()V
    .locals 2

    .line 621
    iget-object v0, p0, Ll/ۢ۠ۤ;->۟:Ll/᩸ۜۤ;

    .line 627
    iget-object v1, p0, Ll/ۢ۠ۤ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 621
    iput-object v1, v0, Ll/᩸ۜۤ;->᩸:Ljava/lang/String;

    .line 622
    iget-object v0, p0, Ll/ۢ۠ۤ;->۟:Ll/᩸ۜۤ;

    .line 631
    iget-object v1, p0, Ll/ۢ۠ۤ;->ܰ:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    .line 622
    iput-boolean v1, v0, Ll/᩸ۜۤ;->ۙ:Z

    .line 623
    iget-object v0, p0, Ll/ۢ۠ۤ;->۟:Ll/᩸ۜۤ;

    .line 635
    iget-object v1, p0, Ll/ۢ۠ۤ;->ᩳ:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    .line 623
    iput-boolean v1, v0, Ll/᩸ۜۤ;->ۤ:Z

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 639
    iget-object v0, p0, Ll/ۢ۠ۤ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
