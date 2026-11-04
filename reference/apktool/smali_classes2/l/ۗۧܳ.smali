.class public final synthetic Ll/ۗۧܳ;
.super Ljava/lang/Object;
.source "A6IY"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic ۙ:Ll/᩵ۧܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩵ۧܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۧܳ;->ۙ:Ll/᩵ۧܳ;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 146
    iget-object v0, p0, Ll/ۗۧܳ;->ۙ:Ll/᩵ۧܳ;

    iget-object v0, v0, Ll/᩵ۧܳ;->ۙ:Ll/ۨۧܳ;

    invoke-static {v0}, Ll/ۨۧܳ;->᩸(Ll/ۨۧܳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const-string v1, "true"

    .line 147
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 148
    invoke-static {v0}, Ll/ۨۧܳ;->ۚ(Ll/ۨۧܳ;)V

    return-void

    .line 152
    :cond_1
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object p1

    invoke-static {v0}, Ll/ۨۧܳ;->ᩴ(Ll/ۨۧܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/webkit/WebStorage;->deleteOrigin(Ljava/lang/String;)V

    .line 153
    invoke-static {v0}, Ll/ۨۧܳ;->۫(Ll/ۨۧܳ;)V

    return-void
.end method
