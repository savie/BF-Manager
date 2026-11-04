.class public final synthetic Ll/ۘۤۤ;
.super Ljava/lang/Object;
.source "45G7"

# interfaces
.implements Ll/ۧ۫ۤ;
.implements Ll/֫ܶ᩵;
.implements Ll/ۚۘܳ;
.implements Ll/᩺ۘ᩷;
.implements Lcom/google/android/material/animation/AnimatableView$Listener;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۘۤۤ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd()V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۘۤۤ;->ܰ:Ljava/lang/Object;

    check-cast v0, Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method public ۙ(Ll/ۘۘ᩷;)Ljava/lang/CharSequence;
    .locals 3

    .line 2
    iget-object p1, p0, Ll/ۘۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/ۤ۫ۧ;

    .line 41
    invoke-virtual {p1}, Ll/ۘۘ᩷;->ۙ()Landroid/content/Context;

    move-result-object v0

    .line 46
    invoke-virtual {p1}, Ll/ۧᩴۧ;->۫ۙ()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘۘ᩷;->֫()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0xa

    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f12057d

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 10

    .line 2
    iget-object v0, p0, Ll/ۘۤۤ;->ܰ:Ljava/lang/Object;

    .line 5
    move-object v7, v0

    check-cast v7, Ll/۠ۨܳ;

    .line 1090
    new-instance v2, Ll/᩻᩷۫;

    invoke-direct {v2, p1}, Ll/᩻᩷۫;-><init>(Ll/᩷ۨᩴ;)V

    .line 94
    invoke-virtual {v7}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v4

    const p1, 0x7f0d00ee

    .line 95
    invoke-virtual {v4, p1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p1

    .line 96
    invoke-static {v4, p1}, Ll/᩻᩷۫;->ۙ(Lbin/mt/plus/Main;Landroid/view/View;)Landroid/widget/Spinner;

    move-result-object v3

    const v0, 0x7f0a05c5

    .line 97
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/֨ܶ;

    .line 98
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v5, "dfb"

    const/4 v6, 0x1

    invoke-interface {v1, v5, v6}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/֨ܶ;->setChecked(Z)V

    .line 99
    new-instance v1, Ll/ۜۙ۫;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f0a03f4

    .line 101
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0a03f6

    .line 102
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v5, 0x7f0a05c6

    .line 103
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/֨ܶ;

    const v8, 0x7f0a05c7

    .line 104
    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Ll/֨ܶ;

    .line 105
    new-instance v9, Ll/۬ۙ۫;

    invoke-direct {v9, v0, v1, v8, v3}, Ll/۬ۙ۫;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Ll/֨ܶ;Landroid/widget/Spinner;)V

    invoke-virtual {v5, v9}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 112
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "dfoh"

    const/4 v9, 0x0

    invoke-interface {v0, v1, v9}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v5, v0}, Ll/֨ܶ;->setChecked(Z)V

    .line 114
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "dfrwn"

    invoke-interface {v0, v1, v6}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v8, v0}, Ll/֨ܶ;->setChecked(Z)V

    .line 115
    new-instance v0, Ll/ۙ᩷۫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v8, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 117
    invoke-virtual {v4}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    .line 118
    invoke-virtual {v0, p1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const p1, 0x7f120161

    const/4 v1, 0x0

    .line 119
    invoke-virtual {v0, p1, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p1, Ll/᩷᩷۫;

    move-object v1, p1

    move-object v6, v8

    invoke-direct/range {v1 .. v7}, Ll/᩷᩷۫;-><init>(Ll/᩻᩷۫;Landroid/widget/Spinner;Lbin/mt/plus/Main;Ll/֨ܶ;Ll/֨ܶ;Ll/۠ۨܳ;)V

    const v1, 0x7f1208c9

    .line 120
    invoke-virtual {v0, v1, p1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 191
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public ۙ(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۘۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 379
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ᩷(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۘۤۤ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩹ܽ᩵;

    .line 6
    check-cast p1, Ljava/lang/Void;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 1181
    invoke-virtual {v0, p1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 1182
    :cond_0
    invoke-virtual {v0, p2}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method
