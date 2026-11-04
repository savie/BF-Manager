.class public final Ll/ܽۘܳ;
.super Ll/᩶۫ܺ;
.source "47JB"


# instance fields
.field public final synthetic ܰ:Ll/֫ۖ᩸;

.field public final synthetic ᩶:Ll/֫ۖ᩸;


# direct methods
.method public constructor <init>(Ll/֫ۖ᩸;Ll/֫ۖ᩸;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 289
    iput-object p1, p0, Ll/ܽۘܳ;->᩶:Ll/֫ۖ᩸;

    iput-object p2, p0, Ll/ܽۘܳ;->ܰ:Ll/֫ۖ᩸;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 292
    iget-object p1, p0, Ll/ܽۘܳ;->᩶:Ll/֫ۖ᩸;

    invoke-virtual {p1}, Ll/֫ۖ᩸;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 293
    invoke-virtual {p1, v0}, Ll/֫ۖ᩸;->᩷(Z)V

    .line 294
    iget-object p1, p0, Ll/ܽۘܳ;->ܰ:Ll/֫ۖ᩸;

    const/4 v1, -0x1

    .line 27
    invoke-static {p1, v1, v0, v1, v1}, Ll/֡ۧۤ;->ۙ(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method
