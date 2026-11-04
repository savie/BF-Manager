.class public final synthetic Ll/ۢۛ۫;
.super Ljava/lang/Object;
.source "TAIM"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Landroid/widget/RadioButton;

.field public final synthetic ܰ:Landroid/widget/RadioButton;

.field public final synthetic ܿ:Landroid/widget/RadioButton;

.field public final synthetic ᩶:Landroid/widget/RadioButton;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۛ۫;->ܰ:Landroid/widget/RadioButton;

    iput-object p2, p0, Ll/ۢۛ۫;->᩶:Landroid/widget/RadioButton;

    iput-object p3, p0, Ll/ۢۛ۫;->ܿ:Landroid/widget/RadioButton;

    iput-object p4, p0, Ll/ۢۛ۫;->֡:Landroid/widget/RadioButton;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 445
    iget-object v0, p0, Ll/ۢۛ۫;->ܰ:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 446
    iget-object v0, p0, Ll/ۢۛ۫;->᩶:Landroid/widget/RadioButton;

    if-ne v0, p1, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 447
    iget-object v0, p0, Ll/ۢۛ۫;->ܿ:Landroid/widget/RadioButton;

    if-ne v0, p1, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 448
    iget-object v0, p0, Ll/ۢۛ۫;->֡:Landroid/widget/RadioButton;

    if-ne v0, p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method
