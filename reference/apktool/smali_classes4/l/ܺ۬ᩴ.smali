.class public final synthetic Ll/ܺ۬ᩴ;
.super Ljava/lang/Object;
.source "HIRF"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/᩹ۖ᩸;

.field public final synthetic ܰ:Ll/ۡۚ᩸;

.field public final synthetic ܿ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۡۚ᩸;Ll/ܽ֡֫;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۬ᩴ;->ܰ:Ll/ۡۚ᩸;

    iput-object p2, p0, Ll/ܺ۬ᩴ;->᩶:Ll/ܽ֡֫;

    iput-object p3, p0, Ll/ܺ۬ᩴ;->ܿ:Ll/᩹ۖ᩸;

    iput-object p4, p0, Ll/ܺ۬ᩴ;->֡:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    sget p1, Ll/᩸ۙܳ;->ۚۤ:I

    .line 90
    iget-object p1, p0, Ll/ܺ۬ᩴ;->ܰ:Ll/ۡۚ᩸;

    invoke-virtual {p1}, Ll/ۡۚ᩸;->ۙ()V

    .line 91
    new-instance p2, Landroid/content/Intent;

    const-class v0, Ll/᩸ۙܳ;

    iget-object v1, p0, Ll/ܺ۬ᩴ;->᩶:Ll/ܽ֡֫;

    invoke-direct {p2, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    iget-object v0, p1, Ll/ۡۚ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    const-string v2, "left"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    iget-object v0, p1, Ll/ۡۚ᩸;->᩷:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    const-string v2, "right"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 94
    iget-object v0, p0, Ll/ܺ۬ᩴ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "leftName"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    iget-object v0, p0, Ll/ܺ۬ᩴ;->֡:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "rightName"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "leftDisplayPath"

    .line 96
    iget-object v2, p1, Ll/ۡۚ᩸;->ᩴ:Ljava/lang/String;

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "rightDisplayPath"

    .line 97
    iget-object p1, p1, Ll/ۡۚ᩸;->ܳ:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    invoke-virtual {v1, p2}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
