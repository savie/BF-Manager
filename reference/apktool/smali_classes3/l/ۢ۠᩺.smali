.class public final synthetic Ll/ۢ۠᩺;
.super Ljava/lang/Object;
.source "17L4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ܶ᩶ۘ;

.field public final synthetic ᩶:Ll/ۤܿۘ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩶ۘ;Ll/ۤܿۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۠᩺;->ܰ:Ll/ܶ᩶ۘ;

    iput-object p2, p0, Ll/ۢ۠᩺;->᩶:Ll/ۤܿۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 163
    iget-object v0, p0, Ll/ۢ۠᩺;->ܰ:Ll/ܶ᩶ۘ;

    iget-object v0, v0, Ll/ܶ᩶ۘ;->ۢ:Ll/۟ܿۘ;

    check-cast v0, Ll/ۘܰۘ;

    iget-object v1, v0, Ll/ۘܰۘ;->ۢ:Ll/ܰᩳۘ;

    iget-object v2, p0, Ll/ۢ۠᩺;->᩶:Ll/ۤܿۘ;

    invoke-static {v2, v1}, Ll/ܰᩳۘ;->ۙ(Ljava/lang/Object;Ll/ܰᩳۘ;)Ll/ܰᩳۘ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘܰۘ;->ۢ:Ll/ܰᩳۘ;

    return-void
.end method
