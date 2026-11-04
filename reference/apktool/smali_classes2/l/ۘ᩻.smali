.class public final Ll/ۘ᩻;
.super Ljava/lang/Object;
.source "N5WL"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ܿ᩻;


# direct methods
.method public constructor <init>(Ll/ܿ᩻;)V
    .locals 0

    .line 961
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩻;->ܰ:Ll/ܿ᩻;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .line 964
    iget-object p1, p0, Ll/ۘ᩻;->ܰ:Ll/ܿ᩻;

    iget-object p4, p1, Ll/ܿ᩻;->ܰۙ:Ll/ۢ᩻;

    invoke-virtual {p4, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 965
    iget-object p4, p1, Ll/ܿ᩻;->ܰۙ:Ll/ۢ᩻;

    invoke-virtual {p4}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p4

    if-eqz p4, :cond_0

    .line 966
    iget-object p4, p1, Ll/ܿ᩻;->ܰۙ:Ll/ۢ᩻;

    iget-object p5, p1, Ll/ܿ᩻;->ۨۙ:Landroid/widget/ListAdapter;

    .line 967
    invoke-interface {p5, p3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 969
    :cond_0
    invoke-virtual {p1}, Ll/ܺܽ;->dismiss()V

    return-void
.end method
