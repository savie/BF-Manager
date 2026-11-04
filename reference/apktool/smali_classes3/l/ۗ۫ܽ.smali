.class public final Ll/ۗ۫ܽ;
.super Ll/ۘ᩻ܽ;
.source "Z3PG"


# instance fields
.field public final ܰ:Ll/ۘ᩻ܽ;

.field public ᩶:Ll/ۘ᩻ܽ;


# direct methods
.method public constructor <init>(Ll/ۛ۫ܽ;)V
    .locals 0

    .line 772
    invoke-direct {p0}, Ll/ۘ᩻ܽ;-><init>()V

    .line 773
    iget-object p1, p1, Ll/ۛ۫ܽ;->֡:Ll/ܽ۫ܽ;

    invoke-virtual {p1}, Ll/ܽ۫ܽ;->values()Ll/ۙ۫ܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ۫ܽ;->iterator()Ll/ۘ᩻ܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ۫ܽ;->ܰ:Ll/ۘ᩻ܽ;

    .line 94
    sget-object p1, Ll/ۨۚܽ;->֡:Ll/ܰ᩻ܽ;

    .line 774
    iput-object p1, p0, Ll/ۗ۫ܽ;->᩶:Ll/ۘ᩻ܽ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 778
    iget-object v0, p0, Ll/ۗ۫ܽ;->᩶:Ll/ۘ᩻ܽ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۗ۫ܽ;->ܰ:Ll/ۘ᩻ܽ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 783
    iget-object v0, p0, Ll/ۗ۫ܽ;->᩶:Ll/ۘ᩻ܽ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 784
    iget-object v0, p0, Ll/ۗ۫ܽ;->ܰ:Ll/ۘ᩻ܽ;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ۫ܽ;

    invoke-virtual {v0}, Ll/ۙ۫ܽ;->iterator()Ll/ۘ᩻ܽ;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ۫ܽ;->᩶:Ll/ۘ᩻ܽ;

    .line 786
    :cond_0
    iget-object v0, p0, Ll/ۗ۫ܽ;->᩶:Ll/ۘ᩻ܽ;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
