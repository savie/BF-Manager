.class public final Ll/᩸ܰۗ;
.super Ljava/lang/Object;
.source "LIWF"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ܰ:Ll/ܽ֫ۗ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ll/ܽ֫ۗ;

    invoke-direct {v0}, Ll/ܽ֫ۗ;-><init>()V

    iput-object v0, p0, Ll/᩸ܰۗ;->ܰ:Ll/ܽ֫ۗ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩸ܰۗ;->ܰ:Ll/ܽ֫ۗ;

    invoke-virtual {v0}, Ll/ܽ֫ۗ;->clear()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "InMemoryCodeCache: size="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸ܰۗ;->ܰ:Ll/ܽ֫ۗ;

    invoke-virtual {v1}, Ll/ܽ֫ۗ;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)Ll/᩹ۘۗ;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩸ܰۗ;->ܰ:Ll/ܽ֫ۗ;

    invoke-virtual {v0, p1}, Ll/ܽ֫ۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ۘۗ;

    if-nez p1, :cond_0

    .line 32
    sget-object p1, Ll/᩹ۘۗ;->ۙ:Ll/ᩴܰۗ;

    :cond_0
    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;Ll/᩹ۘۗ;)V
    .locals 1

    .line 19
    iget-object v0, p0, Ll/᩸ܰۗ;->ܰ:Ll/ܽ֫ۗ;

    invoke-virtual {v0, p1, p2}, Ll/ܽ֫ۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
