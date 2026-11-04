.class public final Ll/ۢۘۗ;
.super Ljava/lang/Object;
.source "UIXK"


# instance fields
.field public final ۙ:Ll/ܽۡۗ;


# direct methods
.method public constructor <init>(Ll/ܽۡۗ;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ۢۘۗ;->ۙ:Ll/ܽۡۗ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    .line 92
    instance-of v0, p1, Ll/ۢۘۗ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۢۘۗ;

    iget-object p1, p1, Ll/ۢۘۗ;->ۙ:Ll/ܽۡۗ;

    iget-object v0, p0, Ll/ۢۘۗ;->ۙ:Ll/ܽۡۗ;

    invoke-virtual {v0, p1}, Ll/ܽۡۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۢۘۗ;->ۙ:Ll/ܽۡۗ;

    invoke-virtual {v0}, Ll/ܽۡۗ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۢۘۗ;->ۙ:Ll/ܽۡۗ;

    invoke-virtual {v0}, Ll/ܽۡۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
