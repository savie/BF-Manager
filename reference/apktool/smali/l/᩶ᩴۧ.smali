.class public final synthetic Ll/᩶ᩴۧ;
.super Ljava/lang/Object;
.source "8AHX"

# interfaces
.implements Ll/ᩴ֨ܳ;
.implements Ll/֡֨֫;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩶ᩴۧ;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩶ᩴۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic ۙ()V
    .locals 0

    return-void
.end method

.method public ۙ(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/᩶ᩴۧ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۡۗܳ;

    .line 6
    iget-object v1, p0, Ll/᩶ᩴۧ;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Ljava/util/ArrayList;

    .line 184
    invoke-virtual {v0}, Ll/ۡۗܳ;->ۚ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    invoke-virtual {v0}, Ll/ۡۗܳ;->ۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۙ(Ljava/lang/String;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/᩶ᩴۧ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ᩳᩴۧ;

    iget-object v1, p0, Ll/᩶ᩴۧ;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ܽ֡֫;

    invoke-static {v0, v1, p1}, Ll/ᩳᩴۧ;->ۙ(Ll/ᩳᩴۧ;Ll/ܽ֡֫;Ljava/lang/String;)V

    return-void
.end method
