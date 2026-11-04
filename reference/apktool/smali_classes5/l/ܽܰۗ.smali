.class public final Ll/ܽܰۗ;
.super Ljava/lang/Object;
.source "56F5"

# interfaces
.implements Ll/ۧܰۗ;


# instance fields
.field public final ܰ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p1, p0, Ll/ܽܰۗ;->ܰ:I

    return-void
.end method

.method public static ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_1

    .line 15
    :cond_0
    invoke-interface {p0}, Ll/ۗۘۗ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getOffset()I

    move-result p1

    if-gez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    .line 35
    :cond_1
    new-instance v0, Ll/ܽܰۗ;

    invoke-direct {v0, p1}, Ll/ܽܰۗ;-><init>(I)V

    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    .line 18
    invoke-interface {p0, p1}, Ll/ۗۘۗ;->ۙ(Ll/ܽܰۗ;)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "offset="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܽܰۗ;->ܰ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ll/֫ܰۗ;
    .locals 1

    .line 50
    sget-object v0, Ll/֫ܰۗ;->ۢ:Ll/֫ܰۗ;

    return-object v0
.end method
