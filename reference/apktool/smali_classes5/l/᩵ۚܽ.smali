.class public final Ll/᩵ۚܽ;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ܰ:I

.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(ILjava/util/Iterator;)V
    .locals 0

    .line 956
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/᩵ۚܽ;->ܿ:I

    iput-object p2, p0, Ll/᩵ۚܽ;->᩶:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 961
    iget v0, p0, Ll/᩵ۚܽ;->ܰ:I

    iget v1, p0, Ll/᩵ۚܽ;->ܿ:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Ll/᩵ۚܽ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 967
    invoke-virtual {p0}, Ll/᩵ۚܽ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 970
    iget v0, p0, Ll/᩵ۚܽ;->ܰ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩵ۚܽ;->ܰ:I

    .line 971
    iget-object v0, p0, Ll/᩵ۚܽ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 968
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 976
    iget-object v0, p0, Ll/᩵ۚܽ;->᩶:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
