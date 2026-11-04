.class public final synthetic Ll/ۡ᩵᩸;
.super Ljava/lang/Object;
.source "PAPA"

# interfaces
.implements Ll/ܺ֨᩸;


# instance fields
.field public final synthetic ܰ:Landroid/widget/ProgressBar;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ProgressBar;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩵᩸;->ܰ:Landroid/widget/ProgressBar;

    return-void
.end method


# virtual methods
.method public final ۙ(Z)V
    .locals 1

    .line 2
    sget v0, Ll/᩷ۨ᩸;->ܶ᩷:I

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 110
    :goto_0
    iget-object v0, p0, Ll/ۡ᩵᩸;->ܰ:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
