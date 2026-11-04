.class public final synthetic Ll/ۜۢܳ;
.super Ljava/lang/Object;
.source "98EM"

# interfaces
.implements Ll/ۤ֨ܳ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/String;

.field public final synthetic ᩶:Landroid/view/View$OnLongClickListener;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۢܳ;->ܰ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۜۢܳ;->᩶:Landroid/view/View$OnLongClickListener;

    return-void
.end method


# virtual methods
.method public final accept(Landroid/widget/TextView;)V
    .locals 1

    .line 460
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/4 v0, 0x5

    .line 461
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 462
    iget-object v0, p0, Ll/ۜۢܳ;->ܰ:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 463
    iget-object v0, p0, Ll/ۜۢܳ;->᩶:Landroid/view/View$OnLongClickListener;

    if-eqz v0, :cond_0

    .line 464
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method
