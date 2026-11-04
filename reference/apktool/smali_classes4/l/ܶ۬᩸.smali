.class public final Ll/ܶ۬᩸;
.super Ljava/lang/Object;
.source "G4ML"


# instance fields
.field public final ۙ:I

.field public final ۤ:Ll/ᩳ۬᩸;

.field public final ܳ:I

.field public final ᩴ:Ll/ᩳ۬᩸;

.field public final ᩷:Ll/ܶ᩷ᩴ;

.field public final ᩸:I


# direct methods
.method public constructor <init>(Ll/ᩳ۬᩸;Ll/ᩳ۬᩸;ILl/ܶ᩷ᩴ;)V
    .locals 0

    .line 648
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 649
    iput-object p1, p0, Ll/ܶ۬᩸;->ᩴ:Ll/ᩳ۬᩸;

    iput-object p2, p0, Ll/ܶ۬᩸;->ۤ:Ll/ᩳ۬᩸;

    iput p3, p0, Ll/ܶ۬᩸;->ۙ:I

    iput-object p4, p0, Ll/ܶ۬᩸;->᩷:Ll/ܶ᩷ᩴ;

    const/4 p3, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 650
    :cond_0
    invoke-interface {p1}, Ll/ۡ᩶᩸;->ۛ᩷()I

    move-result p1

    :goto_0
    iput p1, p0, Ll/ܶ۬᩸;->ܳ:I

    if-nez p2, :cond_1

    goto :goto_1

    .line 651
    :cond_1
    invoke-interface {p2}, Ll/ۡ᩶᩸;->ۛ᩷()I

    move-result p3

    :goto_1
    iput p3, p0, Ll/ܶ۬᩸;->᩸:I

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ܶ۬᩸;)Z
    .locals 3

    if-eqz p1, :cond_0

    .line 656
    iget-object v0, p0, Ll/ܶ۬᩸;->ᩴ:Ll/ᩳ۬᩸;

    iget-object v1, p1, Ll/ܶ۬᩸;->ᩴ:Ll/ᩳ۬᩸;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܶ۬᩸;->ۤ:Ll/ᩳ۬᩸;

    iget-object v1, p1, Ll/ܶ۬᩸;->ۤ:Ll/ᩳ۬᩸;

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܶ۬᩸;->ܳ:I

    iget v1, p1, Ll/ܶ۬᩸;->ܳ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܶ۬᩸;->᩸:I

    iget v1, p1, Ll/ܶ۬᩸;->᩸:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܶ۬᩸;->ۙ:I

    iget v1, p1, Ll/ܶ۬᩸;->ۙ:I

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Ll/ܶ۬᩸;->᩷:Ll/ܶ᩷ᩴ;

    .line 75
    iget-object v0, p0, Ll/ܶ۬᩸;->᩷:Ll/ܶ᩷ᩴ;

    iget v1, v0, Ll/ܶ᩷ᩴ;->ۘ:I

    iget v2, p1, Ll/ܶ᩷ᩴ;->ۘ:I

    if-ne v1, v2, :cond_0

    iget v1, v0, Ll/ܶ᩷ᩴ;->᩶:F

    iget v2, p1, Ll/ܶ᩷ᩴ;->᩶:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, Ll/ܶ᩷ᩴ;->ܳ:F

    iget v2, p1, Ll/ܶ᩷ᩴ;->ܳ:F

    .line 76
    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, Ll/ܶ᩷ᩴ;->ۗ:I

    iget v2, p1, Ll/ܶ᩷ᩴ;->ۗ:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Ll/ܶ᩷ᩴ;->ܺ:Z

    iget-boolean v2, p1, Ll/ܶ᩷ᩴ;->ܺ:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Ll/ܶ᩷ᩴ;->ۧ:Z

    iget-boolean v2, p1, Ll/ܶ᩷ᩴ;->ۧ:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Ll/ܶ᩷ᩴ;->ۚ:Z

    iget-boolean v2, p1, Ll/ܶ᩷ᩴ;->ۚ:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Ll/ܶ᩷ᩴ;->ܶ:Z

    iget-boolean v2, p1, Ll/ܶ᩷ᩴ;->ܶ:Z

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, Ll/ܶ᩷ᩴ;->᩷:Z

    iget-boolean v2, p1, Ll/ܶ᩷ᩴ;->᩷:Z

    if-ne v1, v2, :cond_0

    iget v1, v0, Ll/ܶ᩷ᩴ;->ۛ:I

    iget v2, p1, Ll/ܶ᩷ᩴ;->ۛ:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Ll/ܶ᩷ᩴ;->᩵:Ljava/lang/String;

    iget-object v2, p1, Ll/ܶ᩷ᩴ;->᩵:Ljava/lang/String;

    .line 80
    invoke-static {v1, v2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ܶ᩷ᩴ;->᩸:Ljava/lang/String;

    iget-object p1, p1, Ll/ܶ᩷ᩴ;->᩸:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
