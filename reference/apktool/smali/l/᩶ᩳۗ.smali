.class public final Ll/᩶ᩳۗ;
.super Ll/ܺ᩶ۗ;
.source "TISQ"


# instance fields
.field public final ܰ:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, Ljava/util/BitSet;

    invoke-virtual {p1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷ۢۗ;->᩸()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/᩶ᩳۗ;->ܰ:Ljava/util/BitSet;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;I)Z
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 38
    sget-object v0, Ll/֫۟ۗ;->۫᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    .line 41
    :cond_1
    sget-object v0, Ll/ۧ۟ۗ;->ۙۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p0

    check-cast p0, Ll/᩶ᩳۗ;

    if-nez p0, :cond_2

    :goto_0
    const/4 p0, 0x0

    return p0

    .line 59
    :cond_2
    iget-object p0, p0, Ll/᩶ᩳۗ;->ܰ:Ljava/util/BitSet;

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    return p0
.end method

.method public static ᩷(Ll/ۖۡۗ;I)V
    .locals 1

    .line 26
    sget-object v0, Ll/ۧ۟ۗ;->ۙۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/᩶ᩳۗ;

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Ll/᩶ᩳۗ;

    invoke-direct {v0, p0}, Ll/᩶ᩳۗ;-><init>(Ll/ۖۡۗ;)V

    .line 29
    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 55
    :cond_0
    iget-object p0, v0, Ll/᩶ᩳۗ;->ܰ:Ljava/util/BitSet;

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SKIP_MTH_ARGS: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩶ᩳۗ;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 15
    sget-object v0, Ll/ۧ۟ۗ;->ۙۙ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩶ᩳۗ;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    return v0
.end method

.method public final ۙ(I)Z
    .locals 1

    .line 59
    iget-object v0, p0, Ll/᩶ᩳۗ;->ܰ:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method
