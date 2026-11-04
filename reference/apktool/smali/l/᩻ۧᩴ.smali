.class public final Ll/᩻ۧᩴ;
.super Ljava/lang/Object;
.source "A4TV"

# interfaces
.implements Ll/ۖۧᩴ;


# instance fields
.field public final ۙ:Ll/ۘܶۤ;

.field public final ۤ:Ll/ۧ᩻ᩴ;

.field public final ᩷:Ll/ܿܶۤ;


# direct methods
.method public constructor <init>(Ll/ܿܶۤ;Ll/ۧ᩻ᩴ;)V
    .locals 1

    .line 511
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 512
    iput-object p1, p0, Ll/᩻ۧᩴ;->᩷:Ll/ܿܶۤ;

    const-string v0, ""

    .line 513
    invoke-virtual {p1, v0}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۧᩴ;->ۙ:Ll/ۘܶۤ;

    .line 514
    iput-object p2, p0, Ll/᩻ۧᩴ;->ۤ:Ll/ۧ᩻ᩴ;

    return-void
.end method


# virtual methods
.method public final ۙ(IILjava/lang/CharSequence;)Ll/ۧ᩻ᩴ;
    .locals 2

    const-string v0, ""

    .line 520
    iget-object v1, p0, Ll/᩻ۧᩴ;->ۙ:Ll/ۘܶۤ;

    :try_start_0
    invoke-virtual {v1, p3}, Ll/ۘܶۤ;->reset(Ljava/lang/CharSequence;)V

    .line 521
    invoke-virtual {v1, p1, p2}, Ll/ۘܶۤ;->region(II)V

    .line 522
    invoke-virtual {v1}, Ll/ۘܶۤ;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 523
    iget-object p1, p0, Ll/᩻ۧᩴ;->ۤ:Ll/ۧ᩻ᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 528
    invoke-virtual {v1, v0}, Ll/ۘܶۤ;->reset(Ljava/lang/CharSequence;)V

    return-object p1

    :cond_0
    invoke-virtual {v1, v0}, Ll/ۘܶۤ;->reset(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v1, v0}, Ll/ۘܶۤ;->reset(Ljava/lang/CharSequence;)V

    .line 529
    throw p1
.end method
