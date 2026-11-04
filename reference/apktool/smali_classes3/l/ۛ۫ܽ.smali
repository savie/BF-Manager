.class public abstract Ll/ۛ۫ܽ;
.super Ll/ܶᩴܽ;
.source "Z3PG"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final transient ֡:Ll/ܽ۫ܽ;

.field public final transient ۟:I


# direct methods
.method public constructor <init>(Ll/ܽ۫ܽ;I)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    iput-object p1, p0, Ll/ۛ۫ܽ;->֡:Ll/ܽ۫ܽ;

    .line 413
    iput p2, p0, Ll/ۛ۫ܽ;->۟:I

    return-void
.end method


# virtual methods
.method public bridge synthetic ۙ()Ljava/util/Map;
    .locals 1

    .line 73
    invoke-virtual {p0}, Ll/ۛ۫ܽ;->ۙ()Ll/ܽ۫ܽ;

    move-result-object v0

    return-object v0
.end method

.method public ۙ()Ll/ܽ۫ܽ;
    .locals 1

    .line 587
    iget-object v0, p0, Ll/ۛ۫ܽ;->֡:Ll/ܽ۫ܽ;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 556
    invoke-super {p0, p1}, Ll/ۚᩴܽ;->ۙ(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ()Ljava/util/Set;
    .locals 2

    .line 577
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "unreachable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ᩷()Ljava/util/Map;
    .locals 2

    .line 592
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ᩸()Ljava/util/Collection;
    .locals 1

    .line 767
    new-instance v0, Ll/ۨ۫ܽ;

    invoke-direct {v0, p0}, Ll/ۨ۫ܽ;-><init>(Ll/ۛ۫ܽ;)V

    return-object v0
.end method
