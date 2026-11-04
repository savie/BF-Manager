.class public final Ll/ܿ᩵۫;
.super Ll/ۖۙܺ;
.source "B7T7"


# instance fields
.field public final synthetic ֫:Ll/֡᩵۫;

.field public ۚ:Ll/ۤ۠ᩴ;

.field public final synthetic ۧ:Z

.field public ۫:Ljava/util/concurrent/atomic/AtomicReference;

.field public ܳ:Z

.field public final synthetic ܺ:Ll/ۚۨ۫;

.field public final synthetic ܽ:Ll/ᩳۛ۫;

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(Ll/֡᩵۫;Ll/ᩳۛ۫;ZZLl/ۚۨ۫;)V
    .locals 0

    .line 56
    iput-object p1, p0, Ll/ܿ᩵۫;->֫:Ll/֡᩵۫;

    iput-object p2, p0, Ll/ܿ᩵۫;->ܽ:Ll/ᩳۛ۫;

    iput-boolean p3, p0, Ll/ܿ᩵۫;->ۧ:Z

    iput-boolean p4, p0, Ll/ܿ᩵۫;->᩻:Z

    iput-object p5, p0, Ll/ܿ᩵۫;->ܺ:Ll/ۚۨ۫;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    const/4 p1, 0x0

    .line 57
    iput-boolean p1, p0, Ll/ܿ᩵۫;->ܳ:Z

    .line 59
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ll/ܿ᩵۫;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ܿ᩵۫;->ۚ:Ll/ۤ۠ᩴ;

    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ܿ᩵۫;->ܳ:Z

    if-eqz v0, :cond_0

    const v0, 0x7f1207f0

    .line 109
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_0
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 2

    .line 115
    iget-object v0, p0, Ll/ܿ᩵۫;->֫:Ll/֡᩵۫;

    invoke-static {v0}, Ll/֡᩵۫;->ۤ(Ll/֡᩵۫;)Ll/۠ۨܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ᩴ()V
    .locals 10

    .line 72
    iget-object v0, p0, Ll/ܿ᩵۫;->֫:Ll/֡᩵۫;

    invoke-static {v0}, Ll/֡᩵۫;->ۙ(Ll/֡᩵۫;)Ll/֨᩵۫;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨᩵۫;->ۤ()I

    move-result v5

    .line 73
    invoke-static {v0}, Ll/֡᩵۫;->ۙ(Ll/֡᩵۫;)Ll/֨᩵۫;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨᩵۫;->ۙ()I

    move-result v6

    .line 74
    invoke-static {v0}, Ll/֡᩵۫;->ۙ(Ll/֡᩵۫;)Ll/֨᩵۫;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨᩵۫;->᩸()Ljava/lang/String;

    move-result-object v7

    .line 75
    invoke-static {v0}, Ll/֡᩵۫;->ۙ(Ll/֡᩵۫;)Ll/֨᩵۫;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨᩵۫;->᩷()Ljava/lang/String;

    move-result-object v8

    .line 76
    new-instance v1, Ll/֫᩵۫;

    new-instance v2, Ll/ܰ᩵۫;

    invoke-direct {v2, p0}, Ll/ܰ᩵۫;-><init>(Ll/ܿ᩵۫;)V

    iget-object v3, p0, Ll/ܿ᩵۫;->ܽ:Ll/ᩳۛ۫;

    invoke-direct {v1, v3, v2}, Ll/֫᩵۫;-><init>(Ll/ᩳۛ۫;Ll/۟֡֫;)V

    iget-boolean v2, p0, Ll/ܿ᩵۫;->ۧ:Z

    .line 77
    invoke-virtual {v1, v2}, Ll/֫᩵۫;->ۙ(Z)V

    iget-boolean v2, p0, Ll/ܿ᩵۫;->᩻:Z

    .line 78
    invoke-virtual {v1, v2}, Ll/֫᩵۫;->᩷(Z)V

    invoke-static {v0}, Ll/֡᩵۫;->᩷(Ll/֡᩵۫;)Ljava/util/List;

    move-result-object v0

    new-instance v9, Ll/᩶᩵۫;

    iget-object v4, p0, Ll/ܿ᩵۫;->ܽ:Ll/ᩳۛ۫;

    move-object v2, v9

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Ll/᩶᩵۫;-><init>(Ll/ܿ᩵۫;Ll/ᩳۛ۫;IILjava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {v1, v0, v9}, Ll/֫᩵۫;->ۙ(Ljava/util/List;Ll/۫᩵۫;)V

    .line 101
    iget-object v0, p0, Ll/ܿ᩵۫;->ۚ:Ll/ۤ۠ᩴ;

    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->۫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܿ᩵۫;->۫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 63
    new-instance v0, Ll/ۤ۠ᩴ;

    iget-object v1, p0, Ll/ܿ᩵۫;->֫:Ll/֡᩵۫;

    invoke-static {v1}, Ll/֡᩵۫;->ۤ(Ll/֡᩵۫;)Ll/۠ۨܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤ۠ᩴ;-><init>(Ll/ܽ֡֫;)V

    const v1, 0x7f120b07

    .line 64
    invoke-virtual {v0, v1}, Ll/ۤ۠ᩴ;->ۤ(I)V

    const-string v1, "..."

    .line 65
    invoke-virtual {v0, v1}, Ll/ۤ۠ᩴ;->ۙ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1}, Ll/ۤ۠ᩴ;->ۙ(Ljava/lang/Runnable;)Ll/ۤ۠ᩴ;

    .line 67
    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->᩻()Ll/ۤ۠ᩴ;

    iput-object v0, p0, Ll/ܿ᩵۫;->ۚ:Ll/ۤ۠ᩴ;

    return-void
.end method

.method public final ᩸()V
    .locals 1

    .line 120
    iget-boolean v0, p0, Ll/ܿ᩵۫;->ܳ:Z

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Ll/ܿ᩵۫;->ܺ:Ll/ۚۨ۫;

    invoke-virtual {v0}, Ll/ۚۨ۫;->run()V

    .line 123
    :cond_0
    iget-object v0, p0, Ll/ܿ᩵۫;->ۚ:Ll/ۤ۠ᩴ;

    invoke-virtual {v0}, Ll/ۤ۠ᩴ;->᩸()V

    return-void
.end method
