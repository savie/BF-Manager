.class public abstract Ll/ۢ֨ܳ;
.super Ljava/lang/Object;
.source "O60D"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ֡:Landroid/view/View;

.field public final ֨:Ll/֨ܶ;

.field public final ۟:Ll/᩹ۖ᩸;

.field public final ۢ:Landroid/widget/Spinner;

.field public final ܰ:Ll/۠ۖۧ;

.field public final ܿ:Landroid/view/View;

.field public final ᩳ:Landroid/widget/Spinner;

.field public final ᩶:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/۠ۨܳ;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 7

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d0116

    .line 46
    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0681

    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f120769

    .line 48
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    const v2, 0x7f0a0186

    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹ۖ᩸;

    .line 50
    invoke-virtual {v2, p2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const/4 p2, 0x1

    .line 59
    invoke-virtual {v2, p2}, Ll/᩺ۜ᩸;->᩻(Z)V

    const v2, 0x7f0a0254

    .line 61
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ۢ֨ܳ;->᩶:Landroid/view/View;

    const v2, 0x7f0a018b

    .line 62
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹ۖ᩸;

    iput-object v2, p0, Ll/ۢ֨ܳ;->۟:Ll/᩹ۖ᩸;

    const v2, 0x7f0a05a2

    .line 63
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    iput-object v2, p0, Ll/ۢ֨ܳ;->ᩳ:Landroid/widget/Spinner;

    const v3, 0x7f0a05a4

    .line 64
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    iput-object v3, p0, Ll/ۢ֨ܳ;->ۢ:Landroid/widget/Spinner;

    const v4, 0x7f0a04fb

    .line 65
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p0, Ll/ۢ֨ܳ;->֡:Landroid/view/View;

    const v4, 0x7f0a02f5

    .line 66
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, p0, Ll/ۢ֨ܳ;->ܿ:Landroid/view/View;

    .line 67
    invoke-virtual {v0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f030028

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    .line 68
    invoke-virtual {v0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f030027

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    .line 69
    new-instance v6, Ll/ۗ֡᩻;

    invoke-direct {v6, v0, v4}, Ll/ۗ֡᩻;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 70
    new-instance v6, Ll/ۗ֡᩻;

    invoke-direct {v6, v0, v5}, Ll/ۗ֡᩻;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    if-eqz p3, :cond_0

    const-string v3, "zacl"

    goto :goto_0

    :cond_0
    const-string v3, "zcl"

    .line 74
    :goto_0
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    if-eqz p3, :cond_1

    const/4 v6, 0x6

    goto :goto_1

    :cond_1
    const/4 v6, 0x3

    :goto_1
    invoke-interface {v5, v3, v6}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v5

    array-length v4, v4

    sub-int/2addr v4, p2

    .line 139
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v4, 0x0

    invoke-static {v4, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 74
    invoke-virtual {v2, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    const p2, 0x7f0a05c5

    .line 77
    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/֨ܶ;

    iput-object p2, p0, Ll/ۢ֨ܳ;->֨:Ll/֨ܶ;

    .line 79
    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p2

    .line 80
    invoke-virtual {p2, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    .line 81
    invoke-virtual {p2, v4}, Ll/ۖۖۧ;->ۙ(Z)V

    const v0, 0x7f1208c9

    .line 82
    invoke-virtual {p2, v0, p0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    .line 83
    invoke-virtual {p2, v0, p0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    if-eqz p3, :cond_2

    const v0, 0x7f120107

    const/4 v1, 0x0

    .line 88
    invoke-virtual {p2, v0, v1}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 90
    :cond_2
    invoke-virtual {p2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p2

    iput-object p2, p0, Ll/ۢ֨ܳ;->ܰ:Ll/۠ۖۧ;

    .line 91
    new-instance v0, Ll/۟֨ܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, v3}, Ll/۟֨ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 103
    new-instance v0, Ll/ᩳ֨ܳ;

    invoke-direct {v0, p0}, Ll/ᩳ֨ܳ;-><init>(Ll/ۢ֨ܳ;)V

    invoke-virtual {p2, v0}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnKeyListener;)V

    if-eqz p3, :cond_3

    .line 113
    invoke-static {p1, p2, p4}, Ll/֨ۙ۫;->ۙ(Ll/۠ۨܳ;Ll/۠ۖۧ;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public static ۙ(ILl/᩻ܽܺ;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    packed-switch p0, :pswitch_data_0

    return v2

    .line 205
    :pswitch_0
    invoke-virtual {p1, v1}, Ll/᩻ܽܺ;->ۙ(I)V

    .line 206
    invoke-virtual {p1}, Ll/᩻ܽܺ;->ۤ()V

    return v0

    :pswitch_1
    const/16 p0, 0xa

    .line 202
    invoke-virtual {p1, p0}, Ll/᩻ܽܺ;->ۙ(I)V

    return v2

    :pswitch_2
    const/16 p0, 0x9

    .line 199
    invoke-virtual {p1, p0}, Ll/᩻ܽܺ;->ۙ(I)V

    return v2

    .line 196
    :pswitch_3
    invoke-virtual {p1, v1}, Ll/᩻ܽܺ;->ۙ(I)V

    return v2

    :pswitch_4
    const/4 p0, 0x3

    .line 193
    invoke-virtual {p1, p0}, Ll/᩻ܽܺ;->ۙ(I)V

    return v2

    .line 190
    :pswitch_5
    invoke-virtual {p1, v0}, Ll/᩻ܽܺ;->ۙ(I)V

    return v2

    .line 187
    :pswitch_6
    invoke-virtual {p1, v2}, Ll/᩻ܽܺ;->᩷(I)V

    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final ۙ()I
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۢ֨ܳ;->ᩳ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method

.method public final ۙ(I)V
    .locals 3

    .line 130
    invoke-static {}, Ll/᩶᩷ۧ;->ۗ()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f110001

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۢ֨ܳ;->֨:Ll/֨ܶ;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "dzds"

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {v0, p1}, Ll/֨ܶ;->setChecked(Z)V

    .line 132
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۢ֨ܳ;->֡:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Ll/ۢ֨ܳ;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۤ()I
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ۢ֨ܳ;->ۢ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ۢ֨ܳ;->֨:Ll/֨ܶ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/ۢ֨ܳ;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()V
    .locals 2

    .line 163
    iget-object v0, p0, Ll/ۢ֨ܳ;->ܿ:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Ll/ۢ֨ܳ;->ۢ:Landroid/widget/Spinner;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 165
    iget-object v0, p0, Ll/ۢ֨ܳ;->᩶:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method
