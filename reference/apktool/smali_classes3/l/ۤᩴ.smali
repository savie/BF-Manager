.class public final Ll/ۤᩴ;
.super Ljava/lang/Object;
.source "I67T"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ۗᩴ;


# direct methods
.method public constructor <init>(Ll/ۗᩴ;)V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤᩴ;->ܰ:Ll/ۗᩴ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 130
    iget-object v0, p0, Ll/ۤᩴ;->ܰ:Ll/ۗᩴ;

    iget-object v1, v0, Ll/ۗᩴ;->ܽ:Landroid/widget/Button;

    if-ne p1, v1, :cond_0

    iget-object v1, v0, Ll/ۗᩴ;->᩹:Landroid/os/Message;

    if-eqz v1, :cond_0

    .line 131
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_0

    .line 132
    :cond_0
    iget-object v1, v0, Ll/ۗᩴ;->ᩴ:Landroid/widget/Button;

    if-ne p1, v1, :cond_1

    iget-object v1, v0, Ll/ۗᩴ;->۫:Landroid/os/Message;

    if-eqz v1, :cond_1

    .line 133
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_0

    .line 134
    :cond_1
    iget-object v1, v0, Ll/ۗᩴ;->֫:Landroid/widget/Button;

    if-ne p1, v1, :cond_2

    iget-object p1, v0, Ll/ۗᩴ;->᩻:Landroid/os/Message;

    if-eqz p1, :cond_2

    .line 135
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 141
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 145
    :cond_3
    iget-object p1, v0, Ll/ۗᩴ;->ۘ:Landroid/os/Handler;

    const/4 v1, 0x1

    iget-object v0, v0, Ll/ۗᩴ;->᩺:Ll/ۨᩴ;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 146
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
