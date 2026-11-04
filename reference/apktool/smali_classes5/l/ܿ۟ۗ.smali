.class public final Ll/ܿ۟ۗ;
.super Ljava/lang/Object;
.source "J6HZ"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public final ܰ:Ljava/util/EnumSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-class v0, Ll/᩶۟ۗ;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ܿ۟ۗ;->ܰ:Ljava/util/EnumSet;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩶۟ۗ;)V
    .locals 1

    .line 33
    sget-object v0, Ll/ۧ۟ۗ;->ܿ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ܿ۟ۗ;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Ll/ܿ۟ۗ;

    invoke-direct {v0}, Ll/ܿ۟ۗ;-><init>()V

    .line 36
    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 44
    :cond_0
    iget-object p0, v0, Ll/ܿ۟ۗ;->ܰ:Ljava/util/EnumSet;

    .line 38
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;Ll/᩶۟ۗ;)Z
    .locals 1

    .line 25
    sget-object v0, Ll/ۧ۟ۗ;->ܿ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p0

    check-cast p0, Ll/ܿ۟ۗ;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 44
    :cond_0
    iget-object p0, p0, Ll/ܿ۟ۗ;->ܰ:Ljava/util/EnumSet;

    .line 29
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 59
    invoke-virtual {p0}, Ll/ܿ۟ۗ;->֡()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CodeFeatures{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿ۟ۗ;->ܰ:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 10
    sget-object v0, Ll/ۧ۟ۗ;->ܿ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
