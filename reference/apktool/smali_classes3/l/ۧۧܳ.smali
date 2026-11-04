.class public final synthetic Ll/ۧۧܳ;
.super Ljava/lang/Object;
.source "A6IY"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۛۧܳ;

.field public final synthetic ᩶:Ll/ܺۧܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۧܳ;Ll/ܺۧܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۧܳ;->ܰ:Ll/ۛۧܳ;

    iput-object p2, p0, Ll/ۧۧܳ;->᩶:Ll/ܺۧܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 54
    iget-object v0, p0, Ll/ۧۧܳ;->᩶:Ll/ܺۧܳ;

    invoke-static {v0}, Ll/ܺۧܳ;->ۙ(Ll/ܺۧܳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 55
    :cond_0
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object v1

    new-instance v2, Ll/ۚۧܳ;

    iget-object v3, p0, Ll/ۧۧܳ;->ܰ:Ll/ۛۧܳ;

    invoke-direct {v2, v3, v0}, Ll/ۚۧܳ;-><init>(Ll/ۛۧܳ;Ll/ܺۧܳ;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebStorage;->getOrigins(Landroid/webkit/ValueCallback;)V

    return-void
.end method
