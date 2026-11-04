.class public final synthetic Ll/ᩴ᩸ۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩻֫ܺ;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/᩻֫ܺ;Ll/ܽ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩸ۚ;->ܰ:Ll/᩻֫ܺ;

    iput-object p2, p0, Ll/ᩴ᩸ۚ;->᩶:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 172
    iget-object p1, p0, Ll/ᩴ᩸ۚ;->ܰ:Ll/᩻֫ܺ;

    invoke-virtual {p1}, Ll/᩻֫ܺ;->ۙ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 173
    invoke-static {}, Ll/۫ۤܺ;->ܽ()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    .line 91
    iget-object v1, p0, Ll/ᩴ᩸ۚ;->᩶:Ll/ܽ֡֫;

    invoke-static {v1, p1, v0}, Ll/᩶֡֫;->ۙ(Landroid/content/Context;Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
