.class public final synthetic Ll/۬ܺ۫;
.super Ljava/lang/Object;
.source "Y96B"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/ۙܽ۫;

.field public final synthetic ۟:Landroid/widget/CheckBox;

.field public final synthetic ܰ:Ll/֫ۖ᩸;

.field public final synthetic ܿ:Ll/۠ۖۧ;

.field public final synthetic ᩳ:Ll/۫ۛܳ;

.field public final synthetic ᩶:Ll/֫ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/֫ۖ᩸;Ll/֫ۖ᩸;Ll/۠ۖۧ;Ll/ۙܽ۫;Landroid/widget/CheckBox;Ll/۫ۛܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܺ۫;->ܰ:Ll/֫ۖ᩸;

    iput-object p2, p0, Ll/۬ܺ۫;->᩶:Ll/֫ۖ᩸;

    iput-object p3, p0, Ll/۬ܺ۫;->ܿ:Ll/۠ۖۧ;

    iput-object p4, p0, Ll/۬ܺ۫;->֡:Ll/ۙܽ۫;

    iput-object p5, p0, Ll/۬ܺ۫;->۟:Landroid/widget/CheckBox;

    iput-object p6, p0, Ll/۬ܺ۫;->ᩳ:Ll/۫ۛܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 82
    iget-object p1, p0, Ll/۬ܺ۫;->ܰ:Ll/֫ۖ᩸;

    invoke-virtual {p1}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    iget-object v1, p0, Ll/۬ܺ۫;->᩶:Ll/֫ۖ᩸;

    invoke-virtual {v1}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object v2

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 85
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    const v1, 0x7f120309

    .line 86
    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 87
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 90
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 91
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const p1, 0x7f120caf

    .line 92
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 93
    invoke-virtual {v2}, Ll/᩹ۖ᩸;->֡᩸()V

    .line 94
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 97
    :cond_2
    iget-object v0, p0, Ll/۬ܺ۫;->ܿ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 98
    iget-object v0, p0, Ll/۬ܺ۫;->֡:Ll/ۙܽ۫;

    iget-boolean v1, v0, Ll/ۙܽ۫;->᩷:Z

    iget-object v2, p0, Ll/۬ܺ۫;->۟:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    if-ne v1, v4, :cond_3

    iget-boolean v1, v0, Ll/ۙܽ۫;->ۤ:Z

    if-eq v1, p1, :cond_4

    .line 99
    :cond_3
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Ll/ۙܽ۫;->᩷:Z

    .line 100
    iput-boolean p1, v0, Ll/ۙܽ۫;->ۤ:Z

    .line 101
    invoke-virtual {v0}, Ll/ۙܽ۫;->᩷()V

    .line 103
    :cond_4
    sget p1, Ll/۬ۜۧ;->ۙ:I

    .line 268
    new-instance p1, Ll/۠ۜۧ;

    const-class v0, Ll/ۤܽ۫;

    invoke-direct {p1, v0}, Ll/۠ۜۧ;-><init>(Ljava/lang/Class;)V

    .line 104
    iget-object v0, p0, Ll/۬ܺ۫;->ᩳ:Ll/۫ۛܳ;

    invoke-virtual {p1, v0}, Ll/۠ۜۧ;->ۤ(Ll/۫ۛܳ;)V

    .line 105
    invoke-virtual {v0}, Ll/۫ۛܳ;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠ۜۧ;->ۙ(Ljava/util/List;)V

    const-string v0, "password"

    .line 106
    invoke-virtual {p1, v0, v3}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "removeSource"

    .line 107
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Z)V

    .line 108
    invoke-virtual {p1}, Ll/۠ۜۧ;->ۙ()I

    return-void
.end method
