.class public final Ll/֡ۡۗ;
.super Ll/ܺ۟ۗ;
.source "UITQ"

# interfaces
.implements Ll/᩹ۡۗ;


# instance fields
.field public final ܿ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 23
    iput-object p1, p0, Ll/֡ۡۗ;->ܿ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۡۗ;)V
    .locals 2

    .line 16
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    iput-object v0, p0, Ll/֡ۡۗ;->ܿ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "InsnContainer"

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/֡ۡۗ;->ܿ:Ljava/util/List;

    return-object v0
.end method

.method public final synthetic ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ܶۡۗ;->ۙ(Ll/᩹ۡۗ;Ll/۬֡ۗ;Ll/ۗۘۗ;)V

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "IC"

    return-object v0
.end method
