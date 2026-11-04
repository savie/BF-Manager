.class public final synthetic Ll/ܺۘ᩸;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ܰ:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/Button;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۘ᩸;->ܰ:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const p1, 0x7f12031d

    goto :goto_0

    :cond_0
    const p1, 0x7f1202c6

    .line 2251
    :goto_0
    iget-object p2, p0, Ll/ܺۘ᩸;->ܰ:Landroid/widget/Button;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
