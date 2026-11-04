.class public final Ll/᩻۟ۗ;
.super Ljava/lang/Object;
.source "1ISU"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public final ܰ:Ljava/util/List;

.field public final ᩶:Ll/ۧ۟ۗ;


# direct methods
.method public constructor <init>(Ll/ۧ۟ۗ;Ljava/util/List;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/᩻۟ۗ;->᩶:Ll/ۧ۟ۗ;

    .line 19
    iput-object p2, p0, Ll/᩻۟ۗ;->ܰ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const-string v0, ", "

    .line 38
    iget-object v1, p0, Ll/᩻۟ۗ;->ܰ:Ljava/util/List;

    invoke-static {v1, v0}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x12c

    if-le v2, v3, :cond_0

    const-string v0, "\n    "

    .line 41
    invoke-static {v1, v0}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/᩻۟ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩻۟ۗ;->᩶:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/᩻۟ۗ;->ܰ:Ljava/util/List;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
