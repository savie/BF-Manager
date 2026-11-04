.class public final Ll/ۘܿۗ;
.super Ljava/lang/Object;
.source "K6ER"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ܰ:Ll/᩹ۚ᩵;

.field public ᩶:I


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 31
    iput v0, p0, Ll/ۘܿۗ;->᩶:I

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Ll/ۘܿۗ;->ܰ:Ll/᩹ۚ᩵;

    return-void
.end method

.method public final ۙ(Ll/֫ۖۗ;)Ll/᩺ܿۗ;
    .locals 1

    .line 20
    iget v0, p0, Ll/ۘܿۗ;->᩶:I

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/ۘܿۗ;->ܰ:Ll/᩹ۚ᩵;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ll/֫ۖۗ;Ll/᩹ۚ᩵;)V
    .locals 0

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iput p1, p0, Ll/ۘܿۗ;->᩶:I

    .line 26
    iput-object p2, p0, Ll/ۘܿۗ;->ܰ:Ll/᩹ۚ᩵;

    return-void
.end method
