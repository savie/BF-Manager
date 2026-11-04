.class public final synthetic Ll/۫ۧܳ;
.super Ljava/lang/Object;
.source "A6IY"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic ۙ:Ll/ۛۧܳ;

.field public final synthetic ᩷:Ll/ܺۧܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۧܳ;Ll/ܺۧܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۧܳ;->ۙ:Ll/ۛۧܳ;

    iput-object p2, p0, Ll/۫ۧܳ;->᩷:Ll/ܺۧܳ;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    iget-object p1, p0, Ll/۫ۧܳ;->᩷:Ll/ܺۧܳ;

    invoke-static {p1}, Ll/ܺۧܳ;->ۙ(Ll/ܺۧܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 55
    :cond_0
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object v0

    new-instance v1, Ll/ۚۧܳ;

    iget-object v2, p0, Ll/۫ۧܳ;->ۙ:Ll/ۛۧܳ;

    invoke-direct {v1, v2, p1}, Ll/ۚۧܳ;-><init>(Ll/ۛۧܳ;Ll/ܺۧܳ;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebStorage;->getOrigins(Landroid/webkit/ValueCallback;)V

    return-void
.end method
