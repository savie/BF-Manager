.class public final Ll/ᩴۚܺ;
.super Ljava/lang/Object;
.source "1AG9"


# instance fields
.field public final ֫:Ljava/util/function/IntUnaryOperator;

.field public ۙ:[F

.field public ۚ:F

.field public final ۤ:F

.field public final ۧ:I

.field public ۫:I

.field public ܳ:I

.field public final synthetic ܺ:Ll/ۚۚܺ;

.field public ܽ:F

.field public ᩴ:I

.field public final ᩷:I

.field public ᩸:I

.field public final ᩻:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ll/ۚۚܺ;Ljava/lang/CharSequence;IIFLjava/util/function/IntUnaryOperator;)V
    .locals 0

    .line 844
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۚܺ;->ܺ:Ll/ۚۚܺ;

    .line 845
    iput-object p2, p0, Ll/ᩴۚܺ;->᩻:Ljava/lang/CharSequence;

    .line 846
    iput p3, p0, Ll/ᩴۚܺ;->᩸:I

    iput p3, p0, Ll/ᩴۚܺ;->ᩴ:I

    iput p3, p0, Ll/ᩴۚܺ;->ۧ:I

    .line 847
    iput p4, p0, Ll/ᩴۚܺ;->᩷:I

    .line 848
    iput p5, p0, Ll/ᩴۚܺ;->ۤ:F

    .line 849
    iput-object p6, p0, Ll/ᩴۚܺ;->֫:Ljava/util/function/IntUnaryOperator;

    return-void
.end method

.method private ۙ(I)Z
    .locals 2

    .line 910
    iget-object v0, p0, Ll/ᩴۚܺ;->᩻:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    .line 911
    invoke-static {p1}, Ll/֡۫ܺ;->ۙ(C)B

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_0

    .line 912
    invoke-static {p1}, Ll/ۡ۫ܺ;->ۤ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/16 p1, 0x8

    if-ne v0, p1, :cond_2

    iget-object p1, p0, Ll/ᩴۚܺ;->ܺ:Ll/ۚۚܺ;

    invoke-static {p1}, Ll/ۚۚܺ;->᩷(Ll/ۚۚܺ;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ۙ()F
    .locals 1

    .line 852
    iget v0, p0, Ll/ᩴۚܺ;->ܽ:F

    return v0
.end method

.method public final ۙ(FI)F
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 923
    iget v3, v0, Ll/ᩴۚܺ;->ۧ:I

    if-lt v2, v3, :cond_13

    iget v4, v0, Ll/ᩴۚܺ;->᩷:I

    if-gt v2, v4, :cond_13

    const/4 v5, 0x0

    cmpg-float v6, v1, v5

    if-gtz v6, :cond_0

    return v5

    .line 925
    :cond_0
    iget-object v6, v0, Ll/ᩴۚܺ;->ۙ:[F

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    iget v8, v0, Ll/ᩴۚܺ;->ᩴ:I

    if-gt v2, v8, :cond_2

    iget v8, v0, Ll/ᩴۚܺ;->۫:I

    if-lt v2, v8, :cond_2

    iget v9, v0, Ll/ᩴۚܺ;->ܳ:I

    if-gt v2, v9, :cond_2

    if-ne v2, v8, :cond_1

    .line 926
    iget v2, v0, Ll/ᩴۚܺ;->ۚ:F

    goto :goto_0

    :cond_1
    iget v3, v0, Ll/ᩴۚܺ;->ۚ:F

    sub-int/2addr v2, v8

    sub-int/2addr v2, v7

    aget v2, v6, v2

    add-float/2addr v2, v3

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    return v1

    .line 928
    :cond_2
    iget v6, v0, Ll/ᩴۚܺ;->ᩴ:I

    const/4 v8, 0x0

    if-ge v2, v6, :cond_3

    .line 929
    iput v3, v0, Ll/ᩴۚܺ;->᩸:I

    iput v3, v0, Ll/ᩴۚܺ;->ᩴ:I

    .line 930
    iput v5, v0, Ll/ᩴۚܺ;->ܽ:F

    .line 931
    iput-object v8, v0, Ll/ᩴۚܺ;->ۙ:[F

    .line 933
    :cond_3
    :goto_1
    iget v5, v0, Ll/ᩴۚܺ;->ᩴ:I

    if-ge v5, v2, :cond_12

    iget v6, v0, Ll/ᩴۚܺ;->ܽ:F

    cmpg-float v9, v6, v1

    if-gez v9, :cond_12

    if-lt v5, v4, :cond_4

    goto :goto_2

    .line 857
    :cond_4
    iget-object v5, v0, Ll/ᩴۚܺ;->ܺ:Ll/ۚۚܺ;

    invoke-static {v5}, Ll/ۚۚܺ;->ۙ(Ll/ۚۚܺ;)Ll/۫ۚܺ;

    move-result-object v9

    iget-object v10, v5, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    iget-object v11, v0, Ll/ᩴۚܺ;->᩻:Ljava/lang/CharSequence;

    if-eqz v9, :cond_5

    .line 858
    iget v7, v0, Ll/ᩴۚܺ;->ᩴ:I

    invoke-static {v7, v4, v11}, Ll/֫ۚܺ;->ۙ(IILjava/lang/CharSequence;)I

    move-result v7

    iput v7, v0, Ll/ᩴۚܺ;->ᩴ:I

    .line 859
    invoke-static {v3, v7, v5, v11}, Ll/ۚۚܺ;->ۙ(IILl/ۚۚܺ;Ljava/lang/CharSequence;)F

    move-result v5

    iput v5, v0, Ll/ᩴۚܺ;->ܽ:F

    :goto_2
    move/from16 v16, v3

    move/from16 v17, v4

    goto/16 :goto_b

    .line 862
    :cond_5
    iget v9, v0, Ll/ᩴۚܺ;->ᩴ:I

    iget v12, v0, Ll/ᩴۚܺ;->᩸:I

    if-lt v9, v12, :cond_8

    .line 863
    iget-object v12, v0, Ll/ᩴۚܺ;->֫:Ljava/util/function/IntUnaryOperator;

    if-nez v12, :cond_6

    move v9, v4

    goto :goto_3

    :cond_6
    invoke-interface {v12, v9}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v9

    invoke-static {v4, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    :goto_3
    iput v9, v0, Ll/ᩴۚܺ;->᩸:I

    .line 864
    iget v12, v0, Ll/ᩴۚܺ;->ᩴ:I

    if-le v9, v12, :cond_7

    goto :goto_4

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid text segment end"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 866
    :cond_8
    :goto_4
    iget v9, v0, Ll/ᩴۚܺ;->ᩴ:I

    iget v12, v0, Ll/ᩴۚܺ;->᩸:I

    invoke-static {v9, v12, v11}, Ll/֫ۚܺ;->ۙ(IILjava/lang/CharSequence;)I

    move-result v9

    .line 867
    iget-object v12, v0, Ll/ᩴۚܺ;->ۙ:[F

    if-eqz v12, :cond_9

    iget v13, v0, Ll/ᩴۚܺ;->ᩴ:I

    iget v14, v0, Ll/ᩴۚܺ;->۫:I

    if-lt v13, v14, :cond_9

    iget v15, v0, Ll/ᩴۚܺ;->ܳ:I

    if-ge v13, v15, :cond_9

    .line 868
    iget v5, v0, Ll/ᩴۚܺ;->ۚ:F

    sub-int v10, v9, v14

    sub-int/2addr v10, v7

    aget v7, v12, v10

    add-float/2addr v5, v7

    iput v5, v0, Ll/ᩴۚܺ;->ܽ:F

    move/from16 v16, v3

    move/from16 v17, v4

    goto/16 :goto_a

    .line 869
    :cond_9
    iget v12, v0, Ll/ᩴۚܺ;->ᩴ:I

    invoke-direct {v0, v12}, Ll/ᩴۚܺ;->ۙ(I)Z

    move-result v12

    if-eqz v12, :cond_10

    .line 870
    iget v5, v0, Ll/ᩴۚܺ;->ᩴ:I

    iput v5, v0, Ll/ᩴۚܺ;->۫:I

    .line 871
    iput v9, v0, Ll/ᩴۚܺ;->ܳ:I

    .line 872
    :goto_5
    iget v5, v0, Ll/ᩴۚܺ;->ܳ:I

    iget v8, v0, Ll/ᩴۚܺ;->᩸:I

    if-ge v5, v8, :cond_b

    .line 873
    invoke-static {v5, v8, v11}, Ll/֫ۚܺ;->ۙ(IILjava/lang/CharSequence;)I

    move-result v5

    .line 874
    iget v8, v0, Ll/ᩴۚܺ;->ܳ:I

    sub-int v12, v5, v8

    if-ne v12, v7, :cond_a

    invoke-direct {v0, v8}, Ll/ᩴۚܺ;->ۙ(I)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_6

    .line 875
    :cond_a
    iput v5, v0, Ll/ᩴۚܺ;->ܳ:I

    goto :goto_5

    .line 877
    :cond_b
    :goto_6
    iget v5, v0, Ll/ᩴۚܺ;->ܳ:I

    iget v7, v0, Ll/ᩴۚܺ;->۫:I

    sub-int v8, v5, v7

    .line 878
    new-array v12, v8, [C

    const/4 v13, 0x0

    .line 879
    invoke-static {v11, v7, v5, v12, v13}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    .line 880
    new-array v5, v8, [F

    iput-object v5, v0, Ll/ᩴۚܺ;->ۙ:[F

    .line 882
    invoke-virtual {v10, v12, v13, v8, v5}, Landroid/graphics/Paint;->getTextWidths([CII[F)I

    const-wide/16 v13, 0x0

    const/4 v5, 0x0

    :goto_7
    if-ge v5, v8, :cond_c

    .line 885
    iget-object v7, v0, Ll/ᩴۚܺ;->ۙ:[F

    aget v15, v7, v5

    move/from16 v16, v3

    move/from16 v17, v4

    float-to-double v3, v15

    add-double/2addr v13, v3

    .line 886
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    aput v3, v7, v5

    add-int/lit8 v5, v5, 0x1

    move/from16 v3, v16

    move/from16 v4, v17

    goto :goto_7

    :cond_c
    move/from16 v16, v3

    move/from16 v17, v4

    .line 889
    iget-object v3, v0, Ll/ᩴۚܺ;->ۙ:[F

    add-int/lit8 v4, v8, -0x1

    const/4 v5, 0x0

    invoke-virtual {v10, v12, v5, v8}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v5

    aput v5, v3, v4

    .line 891
    iget v3, v0, Ll/ᩴۚܺ;->۫:I

    :goto_8
    iget v4, v0, Ll/ᩴۚܺ;->ܳ:I

    if-ge v3, v4, :cond_f

    .line 892
    invoke-static {v3, v4, v11}, Ll/֫ۚܺ;->ۙ(IILjava/lang/CharSequence;)I

    move-result v4

    .line 893
    iget v5, v0, Ll/ᩴۚܺ;->۫:I

    if-ne v3, v5, :cond_d

    const/4 v5, 0x0

    goto :goto_9

    :cond_d
    iget-object v7, v0, Ll/ᩴۚܺ;->ۙ:[F

    sub-int v5, v3, v5

    add-int/lit8 v5, v5, -0x1

    aget v5, v7, v5

    :goto_9
    add-int/lit8 v3, v3, 0x1

    if-ge v3, v4, :cond_e

    .line 895
    iget-object v7, v0, Ll/ᩴۚܺ;->ۙ:[F

    iget v8, v0, Ll/ᩴۚܺ;->۫:I

    sub-int v8, v3, v8

    add-int/lit8 v8, v8, -0x1

    aput v5, v7, v8

    goto :goto_9

    :cond_e
    move v3, v4

    goto :goto_8

    .line 899
    :cond_f
    iget v3, v0, Ll/ᩴۚܺ;->ܽ:F

    iput v3, v0, Ll/ᩴۚܺ;->ۚ:F

    .line 900
    iget-object v4, v0, Ll/ᩴۚܺ;->ۙ:[F

    iget v5, v0, Ll/ᩴۚܺ;->۫:I

    sub-int v5, v9, v5

    add-int/lit8 v5, v5, -0x1

    aget v4, v4, v5

    add-float/2addr v3, v4

    iput v3, v0, Ll/ᩴۚܺ;->ܽ:F

    const/4 v8, 0x0

    goto :goto_a

    :cond_10
    move/from16 v16, v3

    move/from16 v17, v4

    .line 902
    iput-object v8, v0, Ll/ᩴۚܺ;->ۙ:[F

    .line 903
    iget v3, v0, Ll/ᩴۚܺ;->ܽ:F

    iget v4, v0, Ll/ᩴۚܺ;->ᩴ:I

    iget v7, v0, Ll/ᩴۚܺ;->ۤ:F

    add-float/2addr v7, v3

    invoke-virtual {v5, v11, v4, v9, v7}, Ll/ۚۚܺ;->ۙ(Ljava/lang/CharSequence;IIF)F

    move-result v4

    add-float/2addr v4, v3

    iput v4, v0, Ll/ᩴۚܺ;->ܽ:F

    .line 905
    :goto_a
    iput v9, v0, Ll/ᩴۚܺ;->ᩴ:I

    .line 936
    :goto_b
    iget v3, v0, Ll/ᩴۚܺ;->ᩴ:I

    if-le v3, v2, :cond_11

    invoke-static {v1, v6}, Ljava/lang/Math;->min(FF)F

    move-result v1

    return v1

    :cond_11
    const/4 v7, 0x1

    move/from16 v3, v16

    move/from16 v4, v17

    goto/16 :goto_1

    .line 938
    :cond_12
    iget v2, v0, Ll/ᩴۚܺ;->ܽ:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    return v1

    .line 923
    :cond_13
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v1
.end method

.method public final ۙ(F)I
    .locals 4

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 943
    iget p1, p0, Ll/ᩴۚܺ;->ۧ:I

    return p1

    .line 944
    :cond_0
    iget v0, p0, Ll/ᩴۚܺ;->ᩴ:I

    iget v1, p0, Ll/ᩴۚܺ;->᩷:I

    if-ge v0, v1, :cond_1

    .line 946
    iget v2, p0, Ll/ᩴۚܺ;->ܽ:F

    .line 948
    iget-object v3, p0, Ll/ᩴۚܺ;->᩻:Ljava/lang/CharSequence;

    invoke-static {v0, v1, v3}, Ll/֫ۚܺ;->ۙ(IILjava/lang/CharSequence;)I

    move-result v1

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 918
    invoke-virtual {p0, v3, v1}, Ll/ᩴۚܺ;->ۙ(FI)F

    move-result v1

    sub-float/2addr v1, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v1, v3

    add-float/2addr v1, v2

    cmpl-float v1, v1, p1

    if-lez v1, :cond_0

    return v0

    :cond_1
    return v1
.end method
