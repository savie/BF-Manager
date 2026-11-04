.class public final Ll/ۚ᩻᩵;
.super Ljava/lang/Object;
.source "QIWT"

# interfaces
.implements Ll/ۘܰۗ;


# instance fields
.field public final ܰ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۚ᩻᩵;->ܰ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۚ᩻᩵;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ۙ(Ll/᩸۫᩸;)V
    .locals 2

    .line 25
    iget-object v0, p0, Ll/ۚ᩻᩵;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫᩻᩵;

    .line 26
    invoke-virtual {v1, p1}, Ll/֫᩻᩵;->ۙ(Ll/᩸۫᩸;)V

    goto :goto_0

    :cond_0
    return-void
.end method
