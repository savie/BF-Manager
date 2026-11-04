.class public final Ll/ۨۤܺ;
.super Ljava/lang/Object;
.source "UBKO"


# static fields
.field public static final ۗ:Landroid/graphics/Matrix;


# instance fields
.field public ֫:I

.field public ۙ:F

.field public final ۚ:Landroid/graphics/Path;

.field public ۤ:Landroid/graphics/Paint;

.field public final ۧ:Ll/᩹ۤܺ;

.field public ۫:Landroid/graphics/PathMeasure;

.field public final ܳ:Landroid/graphics/Path;

.field public ܶ:F

.field public ܺ:Landroid/graphics/Paint;

.field public final ܽ:Ll/ܰۗ;

.field public ᩴ:Ljava/lang/Boolean;

.field public ᩷:F

.field public final ᩸:Landroid/graphics/Matrix;

.field public ᩹:F

.field public ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 744
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Ll/ۨۤܺ;->ۗ:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 765
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 745
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ۨۤܺ;->᩸:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 755
    iput v0, p0, Ll/ۨۤܺ;->᩷:F

    .line 756
    iput v0, p0, Ll/ۨۤܺ;->ۙ:F

    .line 757
    iput v0, p0, Ll/ۨۤܺ;->᩹:F

    .line 758
    iput v0, p0, Ll/ۨۤܺ;->ܶ:F

    const/16 v0, 0xff

    .line 759
    iput v0, p0, Ll/ۨۤܺ;->֫:I

    const/4 v0, 0x0

    .line 760
    iput-object v0, p0, Ll/ۨۤܺ;->᩻:Ljava/lang/String;

    .line 761
    iput-object v0, p0, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    .line 763
    new-instance v0, Ll/ܰۗ;

    invoke-direct {v0}, Ll/ܰۗ;-><init>()V

    iput-object v0, p0, Ll/ۨۤܺ;->ܽ:Ll/ܰۗ;

    .line 766
    new-instance v0, Ll/᩹ۤܺ;

    invoke-direct {v0}, Ll/᩹ۤܺ;-><init>()V

    iput-object v0, p0, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    .line 767
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/ۨۤܺ;->ܳ:Landroid/graphics/Path;

    .line 768
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/ۨۤܺ;->ۚ:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Ll/ۨۤܺ;)V
    .locals 3

    .line 791
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 745
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ۨۤܺ;->᩸:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 755
    iput v0, p0, Ll/ۨۤܺ;->᩷:F

    .line 756
    iput v0, p0, Ll/ۨۤܺ;->ۙ:F

    .line 757
    iput v0, p0, Ll/ۨۤܺ;->᩹:F

    .line 758
    iput v0, p0, Ll/ۨۤܺ;->ܶ:F

    const/16 v0, 0xff

    .line 759
    iput v0, p0, Ll/ۨۤܺ;->֫:I

    const/4 v0, 0x0

    .line 760
    iput-object v0, p0, Ll/ۨۤܺ;->᩻:Ljava/lang/String;

    .line 761
    iput-object v0, p0, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    .line 763
    new-instance v0, Ll/ܰۗ;

    invoke-direct {v0}, Ll/ܰۗ;-><init>()V

    iput-object v0, p0, Ll/ۨۤܺ;->ܽ:Ll/ܰۗ;

    .line 792
    new-instance v1, Ll/᩹ۤܺ;

    iget-object v2, p1, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    invoke-direct {v1, v2, v0}, Ll/᩹ۤܺ;-><init>(Ll/᩹ۤܺ;Ll/ܰۗ;)V

    iput-object v1, p0, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    .line 793
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ll/ۨۤܺ;->ܳ:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ll/ۨۤܺ;->ܳ:Landroid/graphics/Path;

    .line 794
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ll/ۨۤܺ;->ۚ:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ll/ۨۤܺ;->ۚ:Landroid/graphics/Path;

    .line 795
    iget v1, p1, Ll/ۨۤܺ;->᩷:F

    iput v1, p0, Ll/ۨۤܺ;->᩷:F

    .line 796
    iget v1, p1, Ll/ۨۤܺ;->ۙ:F

    iput v1, p0, Ll/ۨۤܺ;->ۙ:F

    .line 797
    iget v1, p1, Ll/ۨۤܺ;->᩹:F

    iput v1, p0, Ll/ۨۤܺ;->᩹:F

    .line 798
    iget v1, p1, Ll/ۨۤܺ;->ܶ:F

    iput v1, p0, Ll/ۨۤܺ;->ܶ:F

    .line 800
    iget v1, p1, Ll/ۨۤܺ;->֫:I

    iput v1, p0, Ll/ۨۤܺ;->֫:I

    .line 801
    iget-object v1, p1, Ll/ۨۤܺ;->᩻:Ljava/lang/String;

    iput-object v1, p0, Ll/ۨۤܺ;->᩻:Ljava/lang/String;

    .line 802
    iget-object v1, p1, Ll/ۨۤܺ;->᩻:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 803
    invoke-virtual {v0, v1, p0}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 805
    :cond_0
    iget-object p1, p1, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/ۨۤܺ;->ᩴ:Ljava/lang/Boolean;

    return-void
.end method

.method private ۙ(Ll/᩹ۤܺ;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v7, p3

    .line 814
    iget-object v1, v0, Ll/᩹ۤܺ;->֫:Landroid/graphics/Matrix;

    iget-object v8, v0, Ll/᩹ۤܺ;->ۙ:Ljava/util/ArrayList;

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 816
    iget-object v9, v0, Ll/᩹ۤܺ;->֫:Landroid/graphics/Matrix;

    iget-object v0, v0, Ll/᩹ۤܺ;->ۤ:Landroid/graphics/Matrix;

    invoke-virtual {v9, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 819
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v10, 0x0

    .line 822
    :goto_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v10, v1, :cond_14

    .line 823
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۤܺ;

    .line 824
    instance-of v2, v1, Ll/᩹ۤܺ;

    if-eqz v2, :cond_1

    .line 825
    check-cast v1, Ll/᩹ۤܺ;

    move-object/from16 v0, p0

    move-object v2, v9

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    .line 826
    invoke-direct/range {v0 .. v5}, Ll/ۨۤܺ;->ۙ(Ll/᩹ۤܺ;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    :cond_0
    move-object v0, v6

    goto/16 :goto_a

    .line 828
    :cond_1
    instance-of v2, v1, Ll/᩵ۤܺ;

    if-eqz v2, :cond_0

    .line 829
    check-cast v1, Ll/᩵ۤܺ;

    move/from16 v2, p4

    int-to-float v3, v2

    .line 844
    iget v4, v6, Ll/ۨۤܺ;->᩹:F

    div-float/2addr v3, v4

    move/from16 v4, p5

    int-to-float v5, v4

    .line 845
    iget v11, v6, Ll/ۨۤܺ;->ܶ:F

    div-float/2addr v5, v11

    .line 846
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v11

    .line 849
    iget-object v12, v6, Ll/ۨۤܺ;->᩸:Landroid/graphics/Matrix;

    invoke-virtual {v12, v9}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 850
    invoke-virtual {v12, v3, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v3, 0x4

    new-array v3, v3, [F

    .line 970
    fill-array-data v3, :array_0

    .line 971
    invoke-virtual {v9, v3}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 972
    aget v0, v3, v0

    float-to-double v13, v0

    const/4 v0, 0x1

    aget v0, v3, v0

    float-to-double v5, v0

    invoke-static {v13, v14, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v0, v5

    const/4 v5, 0x2

    .line 973
    aget v5, v3, v5

    float-to-double v5, v5

    const/4 v13, 0x3

    aget v15, v3, v13

    const/16 v16, 0x0

    float-to-double v13, v15

    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v5, v5

    .line 974
    aget v6, v3, v16

    const/4 v13, 0x1

    aget v13, v3, v13

    const/4 v14, 0x2

    aget v14, v3, v14

    const/4 v15, 0x3

    aget v3, v3, v15

    mul-float v6, v6, v3

    mul-float v13, v13, v14

    sub-float/2addr v6, v13

    .line 976
    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/4 v3, 0x0

    cmpl-float v5, v0, v3

    if-lez v5, :cond_2

    .line 980
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v5

    div-float/2addr v5, v0

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    cmpl-float v0, v5, v3

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    goto/16 :goto_a

    :cond_3
    move-object/from16 v0, p0

    .line 1305
    iget-object v6, v0, Ll/ۨۤܺ;->ܳ:Landroid/graphics/Path;

    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 1306
    iget-object v13, v1, Ll/᩵ۤܺ;->᩷:[Ll/ۧᩳ;

    if-eqz v13, :cond_4

    .line 438
    :try_start_0
    invoke-static {v13, v6}, Ll/᩻ᩳ;->ۙ([Ll/ۧᩳ;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1310
    :catch_0
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 861
    :cond_4
    :goto_2
    iget-object v13, v0, Ll/ۨۤܺ;->ۚ:Landroid/graphics/Path;

    invoke-virtual {v13}, Landroid/graphics/Path;->reset()V

    .line 0
    instance-of v14, v1, Ll/ܽۤܺ;

    if-eqz v14, :cond_6

    .line 864
    iget v1, v1, Ll/᩵ۤܺ;->ۙ:I

    if-nez v1, :cond_5

    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_3

    .line 865
    :cond_5
    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 864
    :goto_3
    invoke-virtual {v13, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 866
    invoke-virtual {v13, v6, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 867
    invoke-virtual {v7, v13}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    goto/16 :goto_a

    .line 869
    :cond_6
    check-cast v1, Ll/ܶۤܺ;

    .line 870
    iget v14, v1, Ll/ܶۤܺ;->᩹:F

    const/high16 v15, 0x3f800000    # 1.0f

    cmpl-float v3, v14, v3

    if-nez v3, :cond_7

    iget v3, v1, Ll/ܶۤܺ;->ܽ:F

    cmpl-float v3, v3, v15

    if-eqz v3, :cond_a

    .line 871
    :cond_7
    iget v3, v1, Ll/ܶۤܺ;->ܶ:F

    add-float/2addr v14, v3

    rem-float/2addr v14, v15

    .line 872
    iget v2, v1, Ll/ܶۤܺ;->ܽ:F

    add-float/2addr v2, v3

    rem-float/2addr v2, v15

    .line 874
    iget-object v3, v0, Ll/ۨۤܺ;->۫:Landroid/graphics/PathMeasure;

    if-nez v3, :cond_8

    .line 875
    new-instance v3, Landroid/graphics/PathMeasure;

    invoke-direct {v3}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v3, v0, Ll/ۨۤܺ;->۫:Landroid/graphics/PathMeasure;

    .line 877
    :cond_8
    iget-object v3, v0, Ll/ۨۤܺ;->۫:Landroid/graphics/PathMeasure;

    const/4 v15, 0x0

    invoke-virtual {v3, v6, v15}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 879
    iget-object v3, v0, Ll/ۨۤܺ;->۫:Landroid/graphics/PathMeasure;

    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v3

    mul-float v14, v14, v3

    mul-float v2, v2, v3

    .line 882
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    cmpl-float v15, v14, v2

    if-lez v15, :cond_9

    .line 884
    iget-object v15, v0, Ll/ۨۤܺ;->۫:Landroid/graphics/PathMeasure;

    const/4 v4, 0x1

    invoke-virtual {v15, v14, v3, v6, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 885
    iget-object v3, v0, Ll/ۨۤܺ;->۫:Landroid/graphics/PathMeasure;

    const/4 v14, 0x0

    invoke-virtual {v3, v14, v2, v6, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    goto :goto_4

    :cond_9
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 887
    iget-object v15, v0, Ll/ۨۤܺ;->۫:Landroid/graphics/PathMeasure;

    invoke-virtual {v15, v14, v2, v6, v3}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    const/4 v14, 0x0

    .line 889
    :goto_4
    invoke-virtual {v6, v14, v14}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 891
    :cond_a
    invoke-virtual {v13, v6, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 893
    iget-object v2, v1, Ll/ܶۤܺ;->ܳ:Ll/ܽ۟;

    invoke-virtual {v2}, Ll/ܽ۟;->ᩴ()Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0xff

    const/high16 v6, 0x437f0000    # 255.0f

    if-eqz v2, :cond_e

    .line 894
    iget-object v2, v1, Ll/ܶۤܺ;->ܳ:Ll/ܽ۟;

    .line 895
    iget-object v14, v0, Ll/ۨۤܺ;->ۤ:Landroid/graphics/Paint;

    if-nez v14, :cond_b

    .line 896
    new-instance v14, Landroid/graphics/Paint;

    const/4 v15, 0x1

    const v16, 0xffffff

    invoke-direct {v14, v15}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v14, v0, Ll/ۨۤܺ;->ۤ:Landroid/graphics/Paint;

    .line 897
    sget-object v15, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_5

    :cond_b
    const v16, 0xffffff

    .line 900
    :goto_5
    iget-object v14, v0, Ll/ۨۤܺ;->ۤ:Landroid/graphics/Paint;

    .line 901
    invoke-virtual {v2}, Ll/ܽ۟;->ۤ()Z

    move-result v15

    if-eqz v15, :cond_c

    .line 902
    invoke-virtual {v2}, Ll/ܽ۟;->᩷()Landroid/graphics/Shader;

    move-result-object v2

    .line 903
    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 904
    invoke-virtual {v2, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 905
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 906
    iget v2, v1, Ll/ܶۤܺ;->ᩴ:F

    mul-float v2, v2, v6

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_6

    .line 908
    :cond_c
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 909
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 910
    invoke-virtual {v2}, Ll/ܽ۟;->ۙ()I

    move-result v2

    iget v6, v1, Ll/ܶۤܺ;->ᩴ:F

    sget v15, Ll/᩺ۤܺ;->ۡ:I

    .line 382
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v15

    and-int v2, v2, v16

    int-to-float v15, v15

    mul-float v15, v15, v6

    float-to-int v6, v15

    shl-int/lit8 v6, v6, 0x18

    or-int/2addr v2, v6

    .line 910
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setColor(I)V

    :goto_6
    const/high16 v2, 0x437f0000    # 255.0f

    .line 912
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 913
    iget v6, v1, Ll/᩵ۤܺ;->ۙ:I

    if-nez v6, :cond_d

    sget-object v6, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_7

    .line 914
    :cond_d
    sget-object v6, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 913
    :goto_7
    invoke-virtual {v13, v6}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 915
    invoke-virtual {v7, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_8

    :cond_e
    const v16, 0xffffff

    const/high16 v2, 0x437f0000    # 255.0f

    .line 918
    :goto_8
    iget-object v6, v1, Ll/ܶۤܺ;->ۚ:Ll/ܽ۟;

    invoke-virtual {v6}, Ll/ܽ۟;->ᩴ()Z

    move-result v6

    if-eqz v6, :cond_13

    .line 919
    iget-object v6, v1, Ll/ܶۤܺ;->ۚ:Ll/ܽ۟;

    .line 920
    iget-object v14, v0, Ll/ۨۤܺ;->ܺ:Landroid/graphics/Paint;

    if-nez v14, :cond_f

    .line 921
    new-instance v14, Landroid/graphics/Paint;

    const/4 v15, 0x1

    invoke-direct {v14, v15}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v14, v0, Ll/ۨۤܺ;->ܺ:Landroid/graphics/Paint;

    .line 922
    sget-object v15, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 925
    :cond_f
    iget-object v14, v0, Ll/ۨۤܺ;->ܺ:Landroid/graphics/Paint;

    .line 926
    iget-object v15, v1, Ll/ܶۤܺ;->ۧ:Landroid/graphics/Paint$Join;

    if-eqz v15, :cond_10

    .line 927
    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 930
    :cond_10
    iget-object v15, v1, Ll/ܶۤܺ;->֫:Landroid/graphics/Paint$Cap;

    if-eqz v15, :cond_11

    .line 931
    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 934
    :cond_11
    iget v15, v1, Ll/ܶۤܺ;->᩻:F

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 935
    invoke-virtual {v6}, Ll/ܽ۟;->ۤ()Z

    move-result v15

    if-eqz v15, :cond_12

    .line 936
    invoke-virtual {v6}, Ll/ܽ۟;->᩷()Landroid/graphics/Shader;

    move-result-object v4

    .line 937
    invoke-static {v4}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 938
    invoke-virtual {v4, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 939
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 940
    iget v4, v1, Ll/ܶۤܺ;->۫:F

    mul-float v4, v4, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_9

    .line 942
    :cond_12
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 943
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 944
    invoke-virtual {v6}, Ll/ܽ۟;->ۙ()I

    move-result v2

    iget v4, v1, Ll/ܶۤܺ;->۫:F

    sget v6, Ll/᩺ۤܺ;->ۡ:I

    .line 382
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    and-int v2, v2, v16

    int-to-float v6, v6

    mul-float v6, v6, v4

    float-to-int v4, v6

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v2, v4

    .line 944
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 947
    :goto_9
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    mul-float v11, v11, v5

    .line 949
    iget v1, v1, Ll/ܶۤܺ;->ܺ:F

    mul-float v1, v1, v11

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 950
    invoke-virtual {v7, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_13
    :goto_a
    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x0

    move-object v6, v0

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_14
    move-object v0, v6

    .line 834
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method


# virtual methods
.method public final ۙ(Landroid/graphics/Canvas;II)V
    .locals 6

    .line 839
    iget-object v1, p0, Ll/ۨۤܺ;->ۧ:Ll/᩹ۤܺ;

    sget-object v2, Ll/ۨۤܺ;->ۗ:Landroid/graphics/Matrix;

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Ll/ۨۤܺ;->ۙ(Ll/᩹ۤܺ;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    return-void
.end method
