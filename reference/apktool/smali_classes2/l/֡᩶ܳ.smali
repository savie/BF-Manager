.class public final synthetic Ll/֡᩶ܳ;
.super Ljava/lang/Object;
.source "OAYY"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/ۧۡ᩵;

.field public final synthetic ۟:Ljava/util/ArrayList;

.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ܿ:[Ljava/lang/CharSequence;

.field public final synthetic ᩳ:Ll/֫ۖ᩸;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ll/ܽ֡֫;[Ljava/lang/CharSequence;Ll/ۧۡ᩵;Ljava/util/ArrayList;Ll/֫ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩶ܳ;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/֡᩶ܳ;->᩶:Ll/ܽ֡֫;

    iput-object p3, p0, Ll/֡᩶ܳ;->ܿ:[Ljava/lang/CharSequence;

    iput-object p4, p0, Ll/֡᩶ܳ;->֡:Ll/ۧۡ᩵;

    iput-object p5, p0, Ll/֡᩶ܳ;->۟:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/֡᩶ܳ;->ᩳ:Ll/֫ۖ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 851
    iget-object p1, p0, Ll/֡᩶ܳ;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 852
    :cond_0
    iget-object v0, p0, Ll/֡᩶ܳ;->᩶:Ll/ܽ֡֫;

    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v1, 0x7f120884

    .line 853
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    .line 856
    iget-object v1, p0, Ll/֡᩶ܳ;->֡:Ll/ۧۡ᩵;

    iget v2, v1, Ll/ۧۡ᩵;->ܰ:I

    .line 854
    new-instance v3, Ll/ᩳ᩶ܳ;

    iget-object v4, p0, Ll/֡᩶ܳ;->۟:Ljava/util/ArrayList;

    iget-object v5, p0, Ll/֡᩶ܳ;->ᩳ:Ll/֫ۖ᩸;

    invoke-direct {v3, v1, p1, v4, v5}, Ll/ᩳ᩶ܳ;-><init>(Ll/ۧۡ᩵;Ll/᩹ۖ᩸;Ljava/util/ArrayList;Ll/֫ۖ᩸;)V

    iget-object p1, p0, Ll/֡᩶ܳ;->ܿ:[Ljava/lang/CharSequence;

    invoke-virtual {v0, p1, v2, v3}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12018c

    const/4 v1, 0x0

    .line 864
    invoke-virtual {v0, p1, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 865
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method
