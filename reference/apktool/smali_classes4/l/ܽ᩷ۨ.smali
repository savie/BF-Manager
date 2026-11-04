.class public final Ll/ܽ᩷ۨ;
.super Ljava/lang/Object;
.source "VANM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ܰ:Ljava/lang/Runnable;

.field public final synthetic ᩶:Ll/ܶ᩷ۨ;


# direct methods
.method public constructor <init>(Ll/ܶ᩷ۨ;Ljava/lang/Runnable;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩷ۨ;->᩶:Ll/ܶ᩷ۨ;

    iput-object p2, p0, Ll/ܽ᩷ۨ;->ܰ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    const/4 v0, 0x0

    .line 111
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ܽ᩷ۨ;->ܰ:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 113
    sget-object v2, Ll/᩻ۢ᩵;->ܰ:Ll/᩻ۢ᩵;

    invoke-static {v1, v2}, Ll/ۡ۠᩵;->ۙ(Ljava/lang/Throwable;Ll/ۧۢ᩵;)V

    .line 115
    :goto_0
    iget-object v1, p0, Ll/ܽ᩷ۨ;->᩶:Ll/ܶ᩷ۨ;

    invoke-static {v1}, Ll/ܶ᩷ۨ;->᩷(Ll/ܶ᩷ۨ;)Ljava/lang/Runnable;

    move-result-object v2

    if-nez v2, :cond_1

    return-void

    :cond_1
    iput-object v2, p0, Ll/ܽ᩷ۨ;->ܰ:Ljava/lang/Runnable;

    add-int/lit8 v0, v0, 0x1

    const/16 v2, 0x10

    if-lt v0, v2, :cond_0

    .line 117
    invoke-static {v1}, Ll/ܶ᩷ۨ;->ۙ(Ll/ܶ᩷ۨ;)Ll/ᩳ۠᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩳ۠᩵;->᩷()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 120
    invoke-static {v1}, Ll/ܶ᩷ۨ;->ۙ(Ll/ܶ᩷ۨ;)Ll/ᩳ۠᩵;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Ll/ᩳ۠᩵;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V

    return-void
.end method
