.class public final Ll/ᩳ۬᩷;
.super Ljava/lang/Object;
.source "66IP"


# instance fields
.field public final ۙ:Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ᩳ۬᩷;->ۙ:Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    return-void
.end method

.method public static ۙ(Ljava/lang/reflect/InvocationHandler;)Ll/ᩳ۬᩷;
    .locals 1

    .line 52
    const-class v0, Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    .line 53
    invoke-static {v0, p0}, Ll/۠ۘۨ;->ۙ(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    .line 55
    new-instance v0, Ll/ᩳ۬᩷;

    invoke-direct {v0, p0}, Ll/ᩳ۬᩷;-><init>(Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;)V

    return-object v0
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ᩳ۬᩷;->ۙ:Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;->remove()V

    return-void
.end method
