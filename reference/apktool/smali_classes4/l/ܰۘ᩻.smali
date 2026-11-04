.class public final synthetic Ll/ܰۘ᩻;
.super Ljava/lang/Object;
.source "98W2"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ܿۘ᩻;

.field public final synthetic ܿ:Landroid/widget/PopupWindow;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܿۘ᩻;Ll/ܽ֡֫;Landroid/widget/PopupWindow;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۘ᩻;->ܰ:Ll/ܿۘ᩻;

    iput-object p2, p0, Ll/ܰۘ᩻;->᩶:Ll/ܽ֡֫;

    iput-object p3, p0, Ll/ܰۘ᩻;->ܿ:Landroid/widget/PopupWindow;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ܰۘ᩻;->᩶:Ll/ܽ֡֫;

    iget-object v1, p0, Ll/ܰۘ᩻;->ܿ:Landroid/widget/PopupWindow;

    iget-object v2, p0, Ll/ܰۘ᩻;->ܰ:Ll/ܿۘ᩻;

    invoke-static {v2, v0, v1, p1}, Ll/ܿۘ᩻;->ۙ(Ll/ܿۘ᩻;Ll/ܽ֡֫;Landroid/widget/PopupWindow;Landroid/view/View;)V

    return-void
.end method
