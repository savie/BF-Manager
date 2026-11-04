.class public final Ll/ܳᩳۗ;
.super Ljava/lang/Object;
.source "WITU"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ܰ:Ljava/lang/Throwable;

.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Ll/ܳᩳۗ;->ܰ:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 9
    check-cast p1, Ll/ܳᩳۗ;

    .line 29
    iget-object v0, p0, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    .line 20
    iget-object p1, p1, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 37
    const-class v0, Ll/ܳᩳۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 40
    :cond_1
    check-cast p1, Ll/ܳᩳۗ;

    .line 41
    iget-object v0, p0, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    iget-object p1, p1, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 51
    iget-object v0, p0, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    iget-object v1, p0, Ll/ܳᩳۗ;->ܰ:Ljava/lang/Throwable;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/lang/Throwable;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ܳᩳۗ;->ܰ:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ܳᩳۗ;->᩶:Ljava/lang/String;

    return-object v0
.end method
