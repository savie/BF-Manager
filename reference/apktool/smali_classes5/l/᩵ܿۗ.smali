.class public final Ll/᩵ܿۗ;
.super Ljava/lang/Object;
.source "MIV5"


# instance fields
.field public final ۙ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Ll/᩵ܿۗ;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 15
    :cond_0
    instance-of v0, p1, Ll/᩵ܿۗ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 18
    :cond_1
    check-cast p1, Ll/᩵ܿۗ;

    iget-object p1, p1, Ll/᩵ܿۗ;->ۙ:Ljava/lang/String;

    iget-object v0, p0, Ll/᩵ܿۗ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 23
    iget-object v0, p0, Ll/᩵ܿۗ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/᩵ܿۗ;->ۙ:Ljava/lang/String;

    return-object v0
.end method
