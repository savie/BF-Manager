.class public final Ll/᩻ۜܺ;
.super Ljava/lang/Object;
.source "TB7B"

# interfaces
.implements Ll/۠ۖܺ;


# instance fields
.field public ۙ:Z

.field public ۚ:I

.field public ۤ:Ljava/util/ArrayList;

.field public ۫:F

.field public ܳ:F

.field public ᩴ:Z

.field public ᩷:Ll/ܺۜܺ;

.field public ᩸:Z


# direct methods
.method public constructor <init>(Ll/ۘۜܺ;Ll/ۖۖܺ;)V
    .locals 2

    .line 2960
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2951
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩻ۜܺ;->ۤ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 2953
    iput-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    const/4 v0, 0x0

    .line 2954
    iput-boolean v0, p0, Ll/᩻ۜܺ;->ᩴ:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/᩻ۜܺ;->᩸:Z

    const/4 v1, -0x1

    .line 2955
    iput v1, p0, Ll/᩻ۜܺ;->ۚ:I

    if-nez p2, :cond_0

    goto :goto_0

    .line 2965
    :cond_0
    invoke-virtual {p2, p0}, Ll/ۖۖܺ;->ۙ(Ll/۠ۖܺ;)V

    .line 2967
    iget-boolean p2, p0, Ll/᩻ۜܺ;->ۙ:Z

    if-eqz p2, :cond_1

    .line 2970
    iget-object p2, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    iget v1, p0, Ll/᩻ۜܺ;->ۚ:I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۜܺ;

    invoke-virtual {p2, v1}, Ll/ܺۜܺ;->ۙ(Ll/ܺۜܺ;)V

    .line 2972
    iget p2, p0, Ll/᩻ۜܺ;->ۚ:I

    iget-object v1, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {p1, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2973
    iput-boolean v0, p0, Ll/᩻ۜܺ;->ۙ:Z

    .line 2976
    :cond_1
    iget-object p2, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    if-eqz p2, :cond_2

    .line 2977
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 3050
    iget-object v0, p0, Ll/᩻ۜܺ;->ۤ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3051
    iget v0, p0, Ll/᩻ۜܺ;->ܳ:F

    iget v1, p0, Ll/᩻ۜܺ;->۫:F

    invoke-virtual {p0, v0, v1}, Ll/᩻ۜܺ;->᩷(FF)V

    const/4 v0, 0x1

    .line 3056
    iput-boolean v0, p0, Ll/᩻ۜܺ;->ۙ:Z

    return-void
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    .line 2983
    iget-object v0, p0, Ll/᩻ۜܺ;->ۤ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(FF)V
    .locals 3

    .line 2989
    iget-boolean v0, p0, Ll/᩻ۜܺ;->ۙ:Z

    iget-object v1, p0, Ll/᩻ۜܺ;->ۤ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2992
    iget-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    iget v2, p0, Ll/᩻ۜܺ;->ۚ:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۜܺ;

    invoke-virtual {v0, v2}, Ll/ܺۜܺ;->ۙ(Ll/ܺۜܺ;)V

    .line 2994
    iget v0, p0, Ll/᩻ۜܺ;->ۚ:I

    iget-object v2, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {v1, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 2995
    iput-boolean v0, p0, Ll/᩻ۜܺ;->ۙ:Z

    .line 2997
    :cond_0
    iget-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    if-eqz v0, :cond_1

    .line 2998
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3000
    :cond_1
    iput p1, p0, Ll/᩻ۜܺ;->ܳ:F

    .line 3001
    iput p2, p0, Ll/᩻ۜܺ;->۫:F

    .line 3002
    new-instance v0, Ll/ܺۜܺ;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v2, v2}, Ll/ܺۜܺ;-><init>(FFFF)V

    iput-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    .line 3003
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Ll/᩻ۜܺ;->ۚ:I

    return-void
.end method

.method public final ۙ(FFFF)V
    .locals 2

    .line 3030
    iget-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {v0, p1, p2}, Ll/ܺۜܺ;->ۙ(FF)V

    .line 3031
    iget-object v0, p0, Ll/᩻ۜܺ;->ۤ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3032
    new-instance v0, Ll/ܺۜܺ;

    sub-float p1, p3, p1

    sub-float p2, p4, p2

    invoke-direct {v0, p3, p4, p1, p2}, Ll/ܺۜܺ;-><init>(FFFF)V

    iput-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    const/4 p1, 0x0

    .line 3033
    iput-boolean p1, p0, Ll/᩻ۜܺ;->ۙ:Z

    return-void
.end method

.method public final ۙ(FFFFFF)V
    .locals 2

    .line 3018
    iget-boolean v0, p0, Ll/᩻ۜܺ;->᩸:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩻ۜܺ;->ᩴ:Z

    if-eqz v0, :cond_1

    .line 3019
    :cond_0
    iget-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {v0, p1, p2}, Ll/ܺۜܺ;->ۙ(FF)V

    .line 3020
    iget-object p1, p0, Ll/᩻ۜܺ;->ۤ:Ljava/util/ArrayList;

    iget-object p2, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3021
    iput-boolean v1, p0, Ll/᩻ۜܺ;->ᩴ:Z

    .line 3023
    :cond_1
    new-instance p1, Ll/ܺۜܺ;

    sub-float p2, p5, p3

    sub-float p3, p6, p4

    invoke-direct {p1, p5, p6, p2, p3}, Ll/ܺۜܺ;-><init>(FFFF)V

    iput-object p1, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    .line 3024
    iput-boolean v1, p0, Ll/᩻ۜܺ;->ۙ:Z

    return-void
.end method

.method public final ۙ(FFFZZFF)V
    .locals 13

    move-object v10, p0

    const/4 v11, 0x1

    .line 3040
    iput-boolean v11, v10, Ll/᩻ۜܺ;->ᩴ:Z

    const/4 v12, 0x0

    .line 3041
    iput-boolean v12, v10, Ll/᩻ۜܺ;->᩸:Z

    .line 3042
    iget-object v0, v10, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    iget v1, v0, Ll/ܺۜܺ;->᩸:F

    iget v2, v0, Ll/ܺۜܺ;->ᩴ:F

    move v0, v1

    move v1, v2

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Ll/ۘۜܺ;->ۙ(FFFFFZZFFLl/۠ۖܺ;)V

    .line 3043
    iput-boolean v11, v10, Ll/᩻ۜܺ;->᩸:Z

    .line 3044
    iput-boolean v12, v10, Ll/᩻ۜܺ;->ۙ:Z

    return-void
.end method

.method public final ᩷(FF)V
    .locals 3

    .line 3009
    iget-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {v0, p1, p2}, Ll/ܺۜܺ;->ۙ(FF)V

    .line 3010
    iget-object v0, p0, Ll/᩻ۜܺ;->ۤ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3011
    new-instance v0, Ll/ܺۜܺ;

    iget-object v1, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    iget v2, v1, Ll/ܺۜܺ;->᩸:F

    sub-float v2, p1, v2

    iget v1, v1, Ll/ܺۜܺ;->ᩴ:F

    sub-float v1, p2, v1

    invoke-direct {v0, p1, p2, v2, v1}, Ll/ܺۜܺ;-><init>(FFFF)V

    iput-object v0, p0, Ll/᩻ۜܺ;->᩷:Ll/ܺۜܺ;

    const/4 p1, 0x0

    .line 3012
    iput-boolean p1, p0, Ll/᩻ۜܺ;->ۙ:Z

    return-void
.end method
