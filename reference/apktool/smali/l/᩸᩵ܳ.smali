.class public final synthetic Ll/᩸᩵ܳ;
.super Ljava/lang/Object;
.source "C76R"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩵ܳ;->ܰ:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/᩸᩵ܳ;->᩶:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 201
    iget-object p1, p0, Ll/᩸᩵ܳ;->ܰ:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    .line 204
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩸᩵ܳ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method
