.class public final synthetic Ll/ۢܺ۫;
.super Ljava/lang/Object;
.source "J951"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/۠ۖۧ;

.field public final synthetic ۟:Ll/ۙܽ۫;

.field public final synthetic ܰ:Ll/֫ۖ᩸;

.field public final synthetic ܿ:Ll/۫ۛܳ;

.field public final synthetic ᩳ:Landroid/widget/CheckBox;

.field public final synthetic ᩶:Lbin/mt/plus/Main;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܺ۫;Ll/֫ۖ᩸;Lbin/mt/plus/Main;Ll/۫ۛܳ;Ll/۠ۖۧ;Ll/ۙܽ۫;Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۢܺ۫;->ܰ:Ll/֫ۖ᩸;

    iput-object p3, p0, Ll/ۢܺ۫;->᩶:Lbin/mt/plus/Main;

    iput-object p4, p0, Ll/ۢܺ۫;->ܿ:Ll/۫ۛܳ;

    iput-object p5, p0, Ll/ۢܺ۫;->֡:Ll/۠ۖۧ;

    iput-object p6, p0, Ll/ۢܺ۫;->۟:Ll/ۙܽ۫;

    iput-object p7, p0, Ll/ۢܺ۫;->ᩳ:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 80
    iget-object v8, p0, Ll/ۢܺ۫;->ܰ:Ll/֫ۖ᩸;

    invoke-virtual {v8}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object v9

    invoke-static {v9}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    invoke-virtual {v9}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f120309

    .line 83
    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 84
    invoke-virtual {v9}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 87
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 88
    new-instance v10, Ll/ۡܺ۫;

    iget-object v1, p0, Ll/ۢܺ۫;->᩶:Lbin/mt/plus/Main;

    iget-object v2, p0, Ll/ۢܺ۫;->ܿ:Ll/۫ۛܳ;

    iget-object v4, p0, Ll/ۢܺ۫;->֡:Ll/۠ۖۧ;

    iget-object v5, p0, Ll/ۢܺ۫;->۟:Ll/ۙܽ۫;

    iget-object v6, p0, Ll/ۢܺ۫;->ᩳ:Landroid/widget/CheckBox;

    move-object v0, v10

    move-object v7, p1

    invoke-direct/range {v0 .. v9}, Ll/ۡܺ۫;-><init>(Lbin/mt/plus/Main;Ll/۫ۛܳ;Ljava/lang/String;Ll/۠ۖۧ;Ll/ۙܽ۫;Landroid/widget/CheckBox;Landroid/view/View;Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)V

    .line 147
    invoke-virtual {v10}, Ll/ۖۙܺ;->۫()V

    return-void
.end method
