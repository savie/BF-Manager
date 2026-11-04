.class public final Ll/ܳۖ֫;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Ll/ܺ֫ܳ;


# instance fields
.field public final synthetic ۙ:Ll/ۘۖ֫;


# direct methods
.method public constructor <init>(Ll/ۘۖ֫;)V
    .locals 0

    .line 475
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۖ֫;->ۙ:Ll/ۘۖ֫;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;
    .locals 2

    .line 480
    iget-object v0, p0, Ll/ܳۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {v0}, Ll/ۘۖ֫;->᩵(Ll/ۘۖ֫;)Ll/֨֫ܳ;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Ll/֨֫ܳ;->ۙ(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Landroid/net/Uri;)Z
    .locals 2

    .line 477
    iget-object v0, p0, Ll/ܳۖ֫;->ۙ:Ll/ۘۖ֫;

    invoke-static {v0}, Ll/ۘۖ֫;->᩹(Ll/ۘۖ֫;)Ll/ۗۖ֫;

    move-result-object v1

    iget-boolean v1, v1, Ll/ۗۖ֫;->ۙ:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۘۖ֫;->ۛ(Ll/ۘۖ֫;)Ll/᩺ۖ֫;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۖ֫;->ᩴ(Ll/᩺ۖ֫;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܿ֫ܳ;->ۙ(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
