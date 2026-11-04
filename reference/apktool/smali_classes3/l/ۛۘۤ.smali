.class public final synthetic Ll/ۛۘۤ;
.super Ljava/lang/Object;
.source "MB7O"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Landroid/view/View;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۛۘۤ;->ܰ:I

    iput-object p1, p0, Ll/ۛۘۤ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۛۘۤ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۛۘۤ;->֡:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 2
    iget p1, p0, Ll/ۛۘۤ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۛۘۤ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Lbin/mt/plus/Main;

    .line 11
    iget-object v0, p0, Ll/ۛۘۤ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 15
    iget-object v1, p0, Ll/ۛۘۤ;->֡:Landroid/view/View;

    .line 17
    check-cast v1, Landroid/widget/TextView;

    .line 70
    new-instance v2, Ll/ۢۗۧ;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v1, v0}, Ll/ۢۗۧ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0, v2}, Ll/ۚۤ۫;->ۙ(Ll/ܽ֡֫;Ljava/util/ArrayList;Ll/ۢۗۧ;)V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۛۘۤ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ۡۚ᩸;

    iget-object v0, p0, Ll/ۛۘۤ;->ܿ:Ljava/lang/Object;

    check-cast v0, Ll/᩹ۖ᩸;

    iget-object v1, p0, Ll/ۛۘۤ;->֡:Landroid/view/View;

    check-cast v1, Ll/᩹ۖ᩸;

    .line 262
    invoke-virtual {p1}, Ll/ۡۚ᩸;->ۤ()V

    .line 263
    iget-object v2, p1, Ll/ۡۚ᩸;->ᩴ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۡۚ᩸;->ܳ:Ljava/lang/String;

    invoke-static {v2, p1, v0, v1}, Ll/ۖۚ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
