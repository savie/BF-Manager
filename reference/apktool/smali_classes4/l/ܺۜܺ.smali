.class public final Ll/ܺۜܺ;
.super Ljava/lang/Object;
.source "TB7B"


# instance fields
.field public ۙ:F

.field public ۤ:Z

.field public ᩴ:F

.field public ᩷:F

.field public ᩸:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 3

    .line 2888
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2884
    iput v0, p0, Ll/ܺۜܺ;->ۙ:F

    iput v0, p0, Ll/ܺۜܺ;->᩷:F

    const/4 v0, 0x0

    .line 2885
    iput-boolean v0, p0, Ll/ܺۜܺ;->ۤ:Z

    .line 2889
    iput p1, p0, Ll/ܺۜܺ;->᩸:F

    .line 2890
    iput p2, p0, Ll/ܺۜܺ;->ᩴ:F

    mul-float p1, p3, p3

    mul-float p2, p4, p4

    add-float/2addr p2, p1

    float-to-double p1, p2

    .line 2892
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmpl-double v2, p1, v0

    if-eqz v2, :cond_0

    float-to-double v0, p3

    div-double/2addr v0, p1

    double-to-float p3, v0

    .line 2894
    iput p3, p0, Ll/ܺۜܺ;->ۙ:F

    float-to-double p3, p4

    div-double/2addr p3, p1

    double-to-float p1, p3

    .line 2895
    iput p1, p0, Ll/ܺۜܺ;->᩷:F

    :cond_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 2941
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܺۜܺ;->᩸:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܺۜܺ;->ᩴ:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܺۜܺ;->ۙ:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܺۜܺ;->᩷:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(FF)V
    .locals 5

    .line 2904
    iget v0, p0, Ll/ܺۜܺ;->᩸:F

    sub-float/2addr p1, v0

    .line 2905
    iget v0, p0, Ll/ܺۜܺ;->ᩴ:F

    sub-float/2addr p2, v0

    mul-float v0, p1, p1

    mul-float v1, p2, p2

    add-float/2addr v1, v0

    float-to-double v0, v1

    .line 2906
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-eqz v4, :cond_0

    float-to-double v2, p1

    div-double/2addr v2, v0

    double-to-float p1, v2

    float-to-double v2, p2

    div-double/2addr v2, v0

    double-to-float p2, v2

    .line 2912
    :cond_0
    iget v0, p0, Ll/ܺۜܺ;->ۙ:F

    neg-float v1, v0

    cmpl-float v1, p1, v1

    if-nez v1, :cond_1

    iget v1, p0, Ll/ܺۜܺ;->᩷:F

    neg-float v1, v1

    cmpl-float v1, p2, v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    .line 2913
    iput-boolean v0, p0, Ll/ܺۜܺ;->ۤ:Z

    neg-float p2, p2

    .line 2915
    iput p2, p0, Ll/ܺۜܺ;->ۙ:F

    .line 2916
    iput p1, p0, Ll/ܺۜܺ;->᩷:F

    return-void

    :cond_1
    add-float/2addr v0, p1

    .line 2918
    iput v0, p0, Ll/ܺۜܺ;->ۙ:F

    .line 2919
    iget p1, p0, Ll/ܺۜܺ;->᩷:F

    add-float/2addr p1, p2

    iput p1, p0, Ll/ܺۜܺ;->᩷:F

    return-void
.end method

.method public final ۙ(Ll/ܺۜܺ;)V
    .locals 4

    .line 2926
    iget v0, p1, Ll/ܺۜܺ;->ۙ:F

    iget v1, p0, Ll/ܺۜܺ;->ۙ:F

    neg-float v2, v1

    cmpl-float v2, v0, v2

    if-nez v2, :cond_0

    iget v2, p1, Ll/ܺۜܺ;->᩷:F

    iget v3, p0, Ll/ܺۜܺ;->᩷:F

    neg-float v3, v3

    cmpl-float v3, v2, v3

    if-nez v3, :cond_0

    const/4 v0, 0x1

    .line 2927
    iput-boolean v0, p0, Ll/ܺۜܺ;->ۤ:Z

    neg-float v0, v2

    .line 2929
    iput v0, p0, Ll/ܺۜܺ;->ۙ:F

    .line 2930
    iget p1, p1, Ll/ܺۜܺ;->ۙ:F

    iput p1, p0, Ll/ܺۜܺ;->᩷:F

    return-void

    :cond_0
    add-float/2addr v1, v0

    .line 2932
    iput v1, p0, Ll/ܺۜܺ;->ۙ:F

    .line 2933
    iget v0, p0, Ll/ܺۜܺ;->᩷:F

    iget p1, p1, Ll/ܺۜܺ;->᩷:F

    add-float/2addr v0, p1

    iput v0, p0, Ll/ܺۜܺ;->᩷:F

    return-void
.end method
