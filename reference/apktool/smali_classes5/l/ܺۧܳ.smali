.class public final Ll/ܺۧܳ;
.super Ljava/lang/Object;
.source "A6IY"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final ֡:Ll/᩻ۧܳ;

.field public final ܰ:Ljava/util/function/Consumer;

.field public final synthetic ܿ:Ll/ۛۧܳ;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/ۛۧܳ;Ljava/util/function/Consumer;)V
    .locals 3

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۧܳ;->ܿ:Ll/ۛۧܳ;

    .line 95
    new-instance v0, Ll/᩻ۧܳ;

    invoke-direct {v0, p0}, Ll/᩻ۧܳ;-><init>(Ll/ܺۧܳ;)V

    iput-object v0, p0, Ll/ܺۧܳ;->֡:Ll/᩻ۧܳ;

    .line 99
    iput-object p2, p0, Ll/ܺۧܳ;->ܰ:Ljava/util/function/Consumer;

    .line 100
    invoke-static {p1}, Ll/ۛۧܳ;->᩷(Ll/ۛۧܳ;)Landroid/os/Handler;

    move-result-object p1

    const-wide/16 v1, 0x2710

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܺۧܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܺۧܳ;->᩶:Z

    return p0
.end method


# virtual methods
.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 93
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Ll/ܺۧܳ;->ۙ(Ljava/lang/Boolean;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/Boolean;)V
    .locals 2

    .line 104
    iget-boolean v0, p0, Ll/ܺۧܳ;->᩶:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 105
    iput-boolean v0, p0, Ll/ܺۧܳ;->᩶:Z

    .line 106
    iget-object v0, p0, Ll/ܺۧܳ;->ܿ:Ll/ۛۧܳ;

    invoke-static {v0}, Ll/ۛۧܳ;->᩷(Ll/ۛۧܳ;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ll/ܺۧܳ;->֡:Ll/᩻ۧܳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 107
    iget-object v0, p0, Ll/ܺۧܳ;->ܰ:Ljava/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
