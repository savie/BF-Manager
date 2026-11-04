.class public final synthetic Ll/ۙ֨֫;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Landroid/content/ClipboardManager;

.field public final synthetic ᩶:Ll/۬֨֫;


# direct methods
.method public synthetic constructor <init>(Landroid/content/ClipboardManager;Ll/۬֨֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ֨֫;->ܰ:Landroid/content/ClipboardManager;

    iput-object p2, p0, Ll/ۙ֨֫;->᩶:Ll/۬֨֫;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 2
    sget p1, Ll/ۧۡ֫;->ۙۤ:I

    .line 1331
    iget-object p1, p0, Ll/ۙ֨֫;->ܰ:Landroid/content/ClipboardManager;

    invoke-virtual {p1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1333
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1334
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    iget-object v0, p0, Ll/ۙ֨֫;->᩶:Ll/۬֨֫;

    invoke-virtual {v0, p1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Ll/۠ۢᩴ;->ۗ()V

    :cond_2
    return-void
.end method
