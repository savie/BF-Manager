.class public abstract Ll/۟ۗ;
.super Ljava/lang/Object;
.source "48M7"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ܰ:Z

.field public ܿ:I

.field public ᩶:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput p1, p0, Ll/۟ۗ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 27
    iget v0, p0, Ll/۟ۗ;->᩶:I

    iget v1, p0, Ll/۟ۗ;->ܿ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 30
    invoke-virtual {p0}, Ll/۟ۗ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    iget v0, p0, Ll/۟ۗ;->᩶:I

    invoke-virtual {p0, v0}, Ll/۟ۗ;->᩷(I)Ljava/lang/Object;

    move-result-object v0

    .line 35
    iget v1, p0, Ll/۟ۗ;->᩶:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Ll/۟ۗ;->᩶:I

    .line 36
    iput-boolean v2, p0, Ll/۟ۗ;->ܰ:Z

    return-object v0

    .line 31
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 41
    iget-boolean v0, p0, Ll/۟ۗ;->ܰ:Z

    if-eqz v0, :cond_0

    .line 43
    iget v0, p0, Ll/۟ۗ;->᩶:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۟ۗ;->᩶:I

    invoke-virtual {p0, v0}, Ll/۟ۗ;->ۤ(I)V

    .line 44
    iget v0, p0, Ll/۟ۗ;->ܿ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۟ۗ;->ܿ:I

    const/4 v0, 0x0

    .line 45
    iput-boolean v0, p0, Ll/۟ۗ;->ܰ:Z

    return-void

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing an element."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ۤ(I)V
.end method

.method public abstract ᩷(I)Ljava/lang/Object;
.end method
