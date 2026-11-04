.class public final Ll/۟۬᩷;
.super Ll/᩷ۢܺ;
.source "Q6JY"


# instance fields
.field public final ۙ:Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/۟۬᩷;->ۙ:Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 52
    sget-object v0, Ll/ᩴۙۤ;->֫:Ll/ܶ۬᩷;

    .line 53
    invoke-virtual {v0}, Ll/᩺۬᩷;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Ll/۟۬᩷;->ۙ:Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;->postMessage(Ljava/lang/String;)V

    return-void

    .line 56
    :cond_0
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method
