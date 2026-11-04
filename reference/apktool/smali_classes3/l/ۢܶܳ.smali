.class public final synthetic Ll/ۢܶܳ;
.super Ljava/lang/Object;
.source "CIS6"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic ܰ:Ll/۠ܶܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۠ܶܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܶܳ;->ܰ:Ll/۠ܶܳ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ۢܶܳ;->ܰ:Ll/۠ܶܳ;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x52

    if-ne p2, v0, :cond_1

    .line 103
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    const/4 p3, 0x1

    if-eq p2, p3, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    invoke-virtual {p1}, Ll/ܺܽ;->dismiss()V

    return p3

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
