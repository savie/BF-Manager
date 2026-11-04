.class public final synthetic Ll/ۖܳᩴ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ܿ:Landroid/view/View;

.field public final synthetic ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܳᩴ;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/ۖܳᩴ;->᩶:Ll/᩹ۖ᩸;

    iput-object p3, p0, Ll/ۖܳᩴ;->ܿ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    sget v0, Ll/ۚۚᩴ;->ۛ᩷:I

    .line 659
    iget-object v0, p0, Ll/ۖܳᩴ;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p0, Ll/ۖܳᩴ;->ܿ:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۖܳᩴ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 662
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 660
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
