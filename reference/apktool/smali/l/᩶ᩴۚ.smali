.class public final Ll/᩶ᩴۚ;
.super Landroid/content/BroadcastReceiver;
.source "26HN"


# instance fields
.field public final synthetic ۙ:Ll/ۡᩴۚ;


# direct methods
.method public constructor <init>(Ll/ۡᩴۚ;)V
    .locals 0

    .line 58
    iput-object p1, p0, Ll/᩶ᩴۚ;->ۙ:Ll/ۡᩴۚ;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 61
    iget-object p1, p0, Ll/᩶ᩴۚ;->ۙ:Ll/ۡᩴۚ;

    invoke-static {p1}, Ll/ۡᩴۚ;->֫(Ll/ۡᩴۚ;)V

    .line 62
    invoke-static {p1}, Ll/ۡᩴۚ;->ۧ(Ll/ۡᩴۚ;)V

    const-string p1, "bin.mt.mcp.ACTION_FAILED_TO_START"

    .line 63
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "error"

    .line 64
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    :cond_0
    return-void
.end method
