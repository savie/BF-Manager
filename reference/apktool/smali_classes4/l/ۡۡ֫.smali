.class public final synthetic Ll/ۡۡ֫;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:Ll/ۘۖ֫;

.field public final synthetic ᩶:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Ll/ۘۖ֫;Landroid/webkit/WebView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۡ֫;->ܰ:Ll/ۘۖ֫;

    iput-object p2, p0, Ll/ۡۡ֫;->᩶:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 4
    sget-object v0, Ll/ۘۖ֫;->ܽۤ:Ll/ۗۖ֫;

    .line 522
    new-instance v0, Ll/۠ۡ֫;

    iget-object v1, p0, Ll/ۡۡ֫;->ܰ:Ll/ۘۖ֫;

    iget-object v2, p0, Ll/ۡۡ֫;->᩶:Landroid/webkit/WebView;

    invoke-direct {v0, v1, v2, p1}, Ll/۠ۡ֫;-><init>(Ll/ۘۖ֫;Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
