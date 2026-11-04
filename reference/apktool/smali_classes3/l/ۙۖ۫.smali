.class public final synthetic Ll/ۙۖ۫;
.super Ljava/lang/Object;
.source "V8F2"

# interfaces
.implements Ll/֫֫᩷;
.implements Ll/ᩴ֨ܳ;
.implements Ll/ۘܳ᩵;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۙۖ۫;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۙۖ۫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۙ()Ll/֫֫᩷;
    .locals 0

    return-object p0
.end method

.method public ۙ(Ll/ۗܶ᩷;)Ll/֫֫᩷;
    .locals 0

    return-object p0
.end method

.method public ۙ(Z)Ll/֫֫᩷;
    .locals 0

    return-object p0
.end method

.method public ۙ(Ll/ۙۚ᩵;)Ll/ۙۚ᩵;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۙۖ۫;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ۜ۫᩵;

    iget-object v1, p0, Ll/ۙۖ۫;->᩶:Ljava/lang/Object;

    check-cast v1, Ll/ܿ֨ۗ;

    invoke-static {v0, v1, p1}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܿ֨ۗ;Ll/ۙۚ᩵;)V

    return-object p1
.end method

.method public ۙ(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۙۖ۫;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 6
    iget-object v1, p0, Ll/ۙۖ۫;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Ljava/lang/String;

    .line 97
    invoke-static {p1, v0}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 98
    invoke-static {p2, v1}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    const/4 p1, 0x4

    .line 99
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public ۙ(Landroid/net/Uri;Ljava/util/Map;)[Ll/᩸֫᩷;
    .locals 0

    .line 102
    iget-object p1, p0, Ll/ۙۖ۫;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/ۨۙ᩷;

    iget-object p2, p0, Ll/ۙۖ۫;->᩶:Ljava/lang/Object;

    check-cast p2, Ll/ܳ᩹ۙ;

    invoke-static {p1, p2}, Ll/ۨۙ᩷;->ۙ(Ll/ۨۙ᩷;Ll/ܳ᩹ۙ;)[Ll/᩸֫᩷;

    move-result-object p1

    return-object p1
.end method
