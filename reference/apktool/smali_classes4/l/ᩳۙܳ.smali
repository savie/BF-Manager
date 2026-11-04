.class public final Ll/ᩳۙܳ;
.super Ljava/lang/Object;
.source "FIQP"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ܰ:I

.field public final synthetic ᩶:Ll/ۢۙܳ;


# direct methods
.method public constructor <init>(Ll/ۢۙܳ;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۙܳ;->᩶:Ll/ۢۙܳ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 89
    iget v0, p0, Ll/ᩳۙܳ;->ܰ:I

    iget-object v1, p0, Ll/ᩳۙܳ;->᩶:Ll/ۢۙܳ;

    iget v1, v1, Ll/ۢۙܳ;->ܰ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 91
    invoke-virtual {p0}, Ll/ᩳۙܳ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget v0, p0, Ll/ᩳۙܳ;->ܰ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ᩳۙܳ;->ܰ:I

    .line 85
    iget-object v1, p0, Ll/ᩳۙܳ;->᩶:Ll/ۢۙܳ;

    iget-object v1, v1, Ll/ۢۙܳ;->᩶:Ll/۬ۙܳ;

    iget-object v1, v1, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const/4 v2, 0x0

    .line 197
    invoke-virtual {v1, v0, v2}, Ll/ۙ۬ᩴ;->ۙ(IZ)I

    move-result v0

    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 91
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
