.class public final Ll/֫ۙۤ;
.super Ljava/lang/Object;
.source "06IW"


# instance fields
.field public final ۙ:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Ll/֫ۙۤ;->ۙ:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/ᩳ۬᩷;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/֫ۙۤ;->ۙ:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 112
    invoke-interface {v0, p1, p2}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->addDocumentStartJavaScript(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    .line 111
    invoke-static {p1}, Ll/ᩳ۬᩷;->ۙ(Ljava/lang/reflect/InvocationHandler;)Ll/ᩳ۬᩷;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/֫ۙۤ;->ۙ:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->removeWebMessageListener(Ljava/lang/String;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;[Ljava/lang/String;Ll/ۤܿۛ;)V
    .locals 1

    .line 100
    new-instance v0, Ll/ۖ۬᩷;

    invoke-direct {v0, p3}, Ll/ۖ۬᩷;-><init>(Ljava/lang/Object;)V

    .line 101
    invoke-static {v0}, Ll/۠ۘۨ;->ۙ(Ll/ۖ۬᩷;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p3

    .line 100
    iget-object v0, p0, Ll/֫ۙۤ;->ۙ:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    invoke-interface {v0, p1, p2, p3}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->addWebMessageListener(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/reflect/InvocationHandler;)V

    return-void
.end method
