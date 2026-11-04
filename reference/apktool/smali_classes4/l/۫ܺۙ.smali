.class public abstract Ll/۫ܺۙ;
.super Ljava/lang/Object;
.source "196F"


# instance fields
.field public final ܰ:Ll/ܿܺۙ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ll/ܿܺۙ;

    invoke-direct {v0}, Ll/ܿܺۙ;-><init>()V

    iput-object v0, p0, Ll/۫ܺۙ;->ܰ:Ll/ܿܺۙ;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/۫ܺۙ;->ܰ:Ll/ܿܺۙ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿܺۙ;->ۙ()V

    .line 68
    :cond_0
    invoke-virtual {p0}, Ll/۫ܺۙ;->ۤ()V

    return-void
.end method

.method public final ۙ(Ll/ۡ᩻ۙ;)V
    .locals 1

    .line 72
    iget-object v0, p0, Ll/۫ܺۙ;->ܰ:Ll/ܿܺۙ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ܿܺۙ;->ۙ(Ll/ۡ᩻ۙ;)V

    :cond_0
    return-void
.end method

.method public ۤ()V
    .locals 0

    return-void
.end method

.method public final ᩷()Ljava/lang/AutoCloseable;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/۫ܺۙ;->ܰ:Ll/ܿܺۙ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿܺۙ;->᩷()Ljava/lang/AutoCloseable;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
