.class public final Ll/ܺ᩻ܽ;
.super Ll/۟ܳܽ;
.source "O5F3"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public final ܰ:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 125
    invoke-static {p0, p1}, Ll/ۨۧܽ;->ۙ(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 120
    invoke-static {p0}, Ll/ۨۧܽ;->ۙ(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public final ᩴ()Ljava/lang/Object;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ܺ᩻ܽ;->ܰ:Ljava/util/Collection;

    return-object v0
.end method
