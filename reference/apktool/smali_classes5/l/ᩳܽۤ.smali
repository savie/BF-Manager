.class public final Ll/ᩳܽۤ;
.super Ljava/lang/Object;
.source "E5LS"


# static fields
.field public static final ۠:Ljava/util/Map;


# instance fields
.field public ֡:Ll/ۡܽۤ;

.field public ֨:I

.field public ֫:I

.field public ۖ:Z

.field public ۗ:[Ljava/lang/String;

.field public ۘ:Ljava/io/Reader;

.field public ۙ:[Ll/ۡܽۤ;

.field public ۚ:Z

.field public ۛ:I

.field public final ۟:Ll/ᩳ᩶᩹;

.field public ۡ:Z

.field public ۢ:I

.field public ۤ:[Ljava/lang/String;

.field public ۧ:I

.field public ۨ:I

.field public ۫:[Ljava/lang/String;

.field public ܰ:[C

.field public ܳ:I

.field public ܶ:Ljava/lang/String;

.field public ܺ:I

.field public ܽ:Ljava/lang/String;

.field public ܿ:I

.field public ᩳ:[C

.field public ᩴ:Z

.field public ᩵:[I

.field public ᩶:I

.field public ᩷:I

.field public ᩸:I

.field public ᩹:[I

.field public ᩺:Ljava/lang/String;

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    invoke-static {}, Ll/ܽ۫ܽ;->᩸()Ll/ܽ۫ܽ;

    move-result-object v0

    sput-object v0, Ll/ᩳܽۤ;->۠:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [Ljava/lang/String;

    .line 47
    iput-object v1, p0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    const/16 v1, 0x8

    new-array v2, v1, [Ljava/lang/String;

    .line 48
    iput-object v2, p0, Ll/ᩳܽۤ;->ۗ:[Ljava/lang/String;

    const/4 v2, 0x4

    new-array v2, v2, [I

    .line 49
    iput-object v2, p0, Ll/ᩳܽۤ;->᩹:[I

    const/16 v2, 0x80

    new-array v3, v2, [C

    .line 70
    iput-object v3, p0, Ll/ᩳܽۤ;->ᩳ:[C

    new-array v0, v0, [Ljava/lang/String;

    .line 84
    iput-object v0, p0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    new-array v0, v1, [Ll/ۡܽۤ;

    .line 85
    iput-object v0, p0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 94
    iput-object v0, p0, Ll/ᩳܽۤ;->᩵:[I

    .line 580
    new-instance v0, Ll/ᩳ᩶᩹;

    invoke-direct {v0}, Ll/ᩳ᩶᩹;-><init>()V

    iput-object v0, p0, Ll/ᩳܽۤ;->۟:Ll/ᩳ᩶᩹;

    .line 666
    new-instance v0, Ll/ۡܽۤ;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 666
    iput-object v0, p0, Ll/ᩳܽۤ;->֡:Ll/ۡܽۤ;

    .line 103
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v0

    const-wide/32 v3, 0x100000

    cmp-long v5, v0, v3

    if-ltz v5, :cond_0

    const/16 v2, 0x2000

    :cond_0
    new-array v0, v2, [C

    iput-object v0, p0, Ll/ᩳܽۤ;->ܰ:[C

    return-void
.end method

.method private ֫(I)V
    .locals 5

    .line 655
    iget-boolean v0, p0, Ll/ᩳܽۤ;->ۚ:Z

    const/16 v1, 0x20

    const/4 v2, 0x0

    if-gt p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/2addr v0, v1

    iput-boolean v0, p0, Ll/ᩳܽۤ;->ۚ:Z

    .line 657
    iget v0, p0, Ll/ᩳܽۤ;->ۢ:I

    iget-object v1, p0, Ll/ᩳܽۤ;->ᩳ:[C

    array-length v3, v1

    if-ne v0, v3, :cond_1

    const/4 v3, 0x3

    const/4 v4, 0x4

    .line 658
    invoke-static {v0, v4, v3, v4}, Ll/ۜ᩶֫;->ۙ(IIII)I

    move-result v3

    new-array v3, v3, [C

    .line 659
    invoke-static {v1, v2, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 660
    iput-object v3, p0, Ll/ᩳܽۤ;->ᩳ:[C

    .line 663
    :cond_1
    iget-object v0, p0, Ll/ᩳܽۤ;->ᩳ:[C

    iget v1, p0, Ll/ᩳܽۤ;->ۢ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳܽۤ;->ۢ:I

    int-to-char p1, p1

    aput-char p1, v0, v1

    return-void
.end method

.method private ۗ()Ljava/lang/String;
    .locals 11

    .line 1006
    iget v0, p0, Ll/ᩳܽۤ;->ۢ:I

    const/4 v1, 0x0

    .line 1007
    invoke-direct {p0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v2

    const/16 v3, 0x3a

    const/16 v4, 0x5f

    const/16 v5, 0x24

    const/16 v6, 0x5a

    const/16 v7, 0x41

    const/16 v8, 0x7a

    const/16 v9, 0x61

    if-lt v2, v9, :cond_0

    if-le v2, v8, :cond_3

    :cond_0
    if-lt v2, v7, :cond_1

    if-le v2, v6, :cond_3

    :cond_1
    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_3

    if-eq v2, v3, :cond_3

    const/16 v10, 0xc0

    if-lt v2, v10, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "name expected"

    .line 230
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    .line 1018
    :cond_3
    :goto_0
    invoke-direct {p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v2

    invoke-direct {p0, v2}, Ll/ᩳܽۤ;->֫(I)V

    .line 1019
    invoke-direct {p0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v2

    if-lt v2, v9, :cond_4

    if-le v2, v8, :cond_3

    :cond_4
    if-lt v2, v7, :cond_5

    if-le v2, v6, :cond_3

    :cond_5
    const/16 v10, 0x30

    if-lt v2, v10, :cond_6

    const/16 v10, 0x39

    if-le v2, v10, :cond_3

    :cond_6
    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_3

    const/16 v10, 0x2d

    if-eq v2, v10, :cond_3

    if-eq v2, v3, :cond_3

    const/16 v10, 0x2e

    if-eq v2, v10, :cond_3

    const/16 v10, 0xb7

    if-ge v2, v10, :cond_3

    .line 1031
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->۫(I)Ljava/lang/String;

    move-result-object v1

    .line 1032
    iput v0, p0, Ll/ᩳܽۤ;->ۢ:I

    return-object v1
.end method

.method private ۙ(IILjava/lang/String;)Ljava/lang/String;
    .locals 6

    sub-int v0, p2, p1

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    .line 621
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-ne p2, v1, :cond_1

    return-object p3

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x7

    if-ne v0, v2, :cond_2

    const-string v3, "android"

    .line 625
    invoke-virtual {p3, p1, v3, v1, v2}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v3

    :cond_2
    const/16 v2, 0x10

    if-le v0, v2, :cond_3

    .line 629
    invoke-virtual {p3, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    mul-int/lit8 v2, v0, 0x1f

    .line 631
    invoke-virtual {p3, p1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/2addr v3, v2

    const/4 v2, 0x1

    if-le v0, v2, :cond_4

    mul-int/lit8 v3, v3, 0x1f

    add-int/lit8 v2, p1, 0x1

    .line 633
    invoke-virtual {p3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/2addr v3, v2

    .line 635
    :cond_4
    iget-object v2, p0, Ll/ᩳܽۤ;->۟:Ll/ᩳ᩶᩹;

    invoke-virtual {v2, v3}, Ll/ᩳ᩶᩹;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    .line 636
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v0, :cond_5

    .line 637
    invoke-virtual {p3, p1, v4, v1, v0}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_5

    return-object v4

    .line 640
    :cond_5
    invoke-virtual {p3, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 641
    invoke-virtual {v2, v3, p1}, Ll/ᩳ᩶᩹;->ۙ(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method private ۙ(C)V
    .locals 3

    .line 913
    invoke-direct {p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    .line 915
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected: \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "\' actual: \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-char p1, v0

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 230
    invoke-direct {p0, p1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private ۙ(IZ)V
    .locals 5

    const/4 v0, 0x0

    .line 876
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-eq v1, v3, :cond_6

    if-eq v1, p1, :cond_6

    const/16 v3, 0x3e

    const/16 v4, 0x20

    if-ne p1, v4, :cond_0

    if-le v1, v4, :cond_6

    if-ne v1, v3, :cond_0

    goto :goto_4

    :cond_0
    const/16 v4, 0x26

    if-ne v1, v4, :cond_2

    if-nez p2, :cond_1

    goto :goto_4

    .line 889
    :cond_1
    invoke-direct {p0}, Ll/ᩳܽۤ;->ܶ()V

    goto :goto_1

    .line 896
    :cond_2
    invoke-direct {p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v4

    invoke-direct {p0, v4}, Ll/ᩳܽۤ;->֫(I)V

    :goto_1
    const/16 v4, 0x5d

    if-ne v1, v3, :cond_4

    const/4 v3, 0x2

    if-lt v2, v3, :cond_4

    if-ne p1, v4, :cond_3

    goto :goto_2

    :cond_3
    const-string p1, "Illegal: ]]>"

    .line 230
    invoke-direct {p0, p1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_4
    :goto_2
    if-ne v1, v4, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 907
    :goto_3
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v1

    goto :goto_0

    :cond_6
    :goto_4
    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ll/ۡܽۤ;)V
    .locals 4

    .line 239
    new-instance v0, Ll/ۢܽۤ;

    .line 240
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x64

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0, p1}, Ll/ۢܽۤ;-><init>(Ljava/lang/String;Ll/ۡܽۤ;)V

    throw v0
.end method

.method private ۙ(Z)V
    .locals 16

    move-object/from16 v0, p0

    if-nez p1, :cond_0

    .line 679
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 680
    :cond_0
    iget-object v1, v0, Ll/ᩳܽۤ;->֡:Ll/ۡܽۤ;

    invoke-virtual {v1, v0}, Ll/ۡܽۤ;->᩷(Ll/ᩳܽۤ;)V

    .line 681
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->ۗ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    .line 682
    invoke-virtual {v1, v0}, Ll/ۡܽۤ;->ۙ(Ll/ᩳܽۤ;)V

    const/4 v2, 0x0

    .line 683
    iput v2, v0, Ll/ᩳܽۤ;->᩷:I

    .line 686
    :cond_1
    :goto_0
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩵()V

    .line 688
    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v3

    const-string v4, ""

    const/4 v5, -0x1

    const/16 v6, 0x3e

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz p1, :cond_2

    const/16 v9, 0x3f

    if-ne v3, v9, :cond_14

    .line 692
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 693
    invoke-direct {v0, v6}, Ll/ᩳܽۤ;->ۙ(C)V

    return-void

    :cond_2
    const/16 v9, 0x2f

    if-ne v3, v9, :cond_3

    .line 698
    iput-boolean v7, v0, Ll/ᩳܽۤ;->ᩴ:Z

    .line 699
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 700
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩵()V

    .line 701
    invoke-direct {v0, v6}, Ll/ᩳܽۤ;->ۙ(C)V

    goto :goto_1

    :cond_3
    if-ne v3, v6, :cond_14

    .line 706
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 772
    :goto_1
    iget v3, v0, Ll/ᩳܽۤ;->ܳ:I

    add-int/lit8 v6, v3, 0x1

    iput v6, v0, Ll/ᩳܽۤ;->ܳ:I

    shl-int/lit8 v3, v3, 0x2

    .line 774
    iget-object v6, v0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    add-int/lit8 v7, v3, 0x4

    .line 202
    array-length v9, v6

    if-lt v9, v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v7, v3, 0x14

    .line 204
    new-array v7, v7, [Ljava/lang/String;

    .line 205
    array-length v9, v6

    invoke-static {v6, v2, v7, v2, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v6, v7

    .line 774
    :goto_2
    iput-object v6, v0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    add-int/lit8 v7, v3, 0x3

    .line 775
    iget-object v9, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    aput-object v9, v6, v7

    .line 777
    iget v6, v0, Ll/ᩳܽۤ;->ܳ:I

    iget-object v7, v0, Ll/ᩳܽۤ;->᩹:[I

    array-length v9, v7

    if-lt v6, v9, :cond_5

    add-int/lit8 v6, v6, 0x4

    .line 778
    new-array v6, v6, [I

    .line 779
    array-length v9, v7

    invoke-static {v7, v2, v6, v2, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 780
    iput-object v6, v0, Ll/ᩳܽۤ;->᩹:[I

    .line 783
    :cond_5
    iget-object v6, v0, Ll/ᩳܽۤ;->᩹:[I

    iget v7, v0, Ll/ᩳܽۤ;->ܳ:I

    add-int/lit8 v9, v7, -0x1

    aget v9, v6, v9

    aput v9, v6, v7

    const/4 v6, 0x0

    .line 110
    :goto_3
    iget v7, v0, Ll/ᩳܽۤ;->᩷:I

    const/16 v9, 0x3a

    if-ge v6, v7, :cond_b

    shl-int/lit8 v7, v6, 0x2

    shl-int/lit8 v10, v6, 0x1

    .line 114
    iget-object v11, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    add-int/lit8 v12, v7, 0x2

    aget-object v11, v11, v12

    .line 115
    invoke-virtual {v11, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-eq v9, v5, :cond_7

    const/4 v12, 0x5

    if-ne v9, v12, :cond_a

    const-string v12, "xmlns:"

    .line 119
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 123
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    invoke-direct {v0, v9, v12, v11}, Ll/ᩳܽۤ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_4

    :cond_7
    const-string v9, "xmlns"

    .line 124
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    move-object v9, v8

    .line 129
    :goto_4
    iget-object v11, v0, Ll/ᩳܽۤ;->᩹:[I

    iget v12, v0, Ll/ᩳܽۤ;->ܳ:I

    aget v13, v11, v12

    add-int/lit8 v14, v13, 0x1

    aput v14, v11, v12

    shl-int/lit8 v11, v13, 0x1

    .line 131
    iget-object v12, v0, Ll/ᩳܽۤ;->ۗ:[Ljava/lang/String;

    add-int/lit8 v13, v11, 0x2

    .line 202
    array-length v14, v12

    if-lt v14, v13, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v13, v11, 0x12

    .line 204
    new-array v13, v13, [Ljava/lang/String;

    .line 205
    array-length v14, v12

    invoke-static {v12, v2, v13, v2, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v12, v13

    .line 131
    :goto_5
    iput-object v12, v0, Ll/ᩳܽۤ;->ۗ:[Ljava/lang/String;

    .line 132
    aput-object v9, v12, v11

    add-int/lit8 v11, v11, 0x1

    .line 133
    iget-object v13, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    add-int/lit8 v7, v7, 0x3

    aget-object v14, v13, v7

    aput-object v14, v12, v11

    if-eqz v9, :cond_a

    .line 135
    aget-object v7, v13, v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_6

    .line 136
    :cond_9
    iget-object v1, v0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    aget-object v1, v1, v10

    const-string v2, "illegal empty namespace"

    .line 222
    invoke-static {v2, v1}, Ll/ᩳܽۤ;->ۙ(Ljava/lang/String;Ll/ۡܽۤ;)V

    throw v8

    :cond_a
    :goto_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_b
    const/4 v6, 0x0

    .line 150
    :goto_7
    iget v7, v0, Ll/ᩳܽۤ;->᩷:I

    if-ge v6, v7, :cond_f

    shl-int/lit8 v7, v6, 0x2

    shl-int/lit8 v10, v6, 0x1

    .line 153
    iget-object v11, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    add-int/lit8 v12, v7, 0x2

    aget-object v11, v11, v12

    .line 154
    invoke-virtual {v11, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-eqz v13, :cond_e

    if-eq v13, v5, :cond_d

    .line 160
    invoke-direct {v0, v2, v13, v11}, Ll/ᩳܽۤ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v14

    add-int/lit8 v15, v13, 0x1

    .line 161
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {v0, v15, v2, v11}, Ll/ᩳܽۤ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 162
    invoke-virtual {v0, v14}, Ll/ᩳܽۤ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_c

    .line 169
    iget-object v10, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    aput-object v11, v10, v7

    add-int/lit8 v7, v7, 0x1

    .line 170
    aput-object v14, v10, v7

    .line 171
    aput-object v2, v10, v12

    goto :goto_8

    .line 164
    :cond_c
    iget-object v1, v0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    aget-object v1, v1, v10

    invoke-virtual {v1}, Ll/ۡܽۤ;->clone()Ll/ۡܽۤ;

    move-result-object v1

    .line 165
    invoke-virtual {v1}, Ll/ۡܽۤ;->ۙ()I

    move-result v2

    add-int/2addr v2, v13

    invoke-virtual {v1, v2}, Ll/ۡܽۤ;->ۤ(I)V

    .line 166
    invoke-virtual {v1}, Ll/ۡܽۤ;->ᩴ()I

    move-result v2

    add-int/2addr v2, v13

    invoke-virtual {v1, v2}, Ll/ۡܽۤ;->ᩴ(I)V

    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Undefined Prefix: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ᩳܽۤ;->ۙ(Ljava/lang/String;Ll/ۡܽۤ;)V

    throw v8

    :cond_d
    :goto_8
    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x0

    goto :goto_7

    :cond_e
    const-string v1, "illegal attribute name: "

    .line 157
    invoke-virtual {v1, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    aget-object v2, v2, v10

    invoke-static {v1, v2}, Ll/ᩳܽۤ;->ۙ(Ljava/lang/String;Ll/ۡܽۤ;)V

    throw v8

    .line 176
    :cond_f
    iget-object v2, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-eqz v2, :cond_13

    if-eq v2, v5, :cond_10

    .line 182
    iget-object v5, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v0, v6, v2, v5}, Ll/ᩳܽۤ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Ll/ᩳܽۤ;->᩺:Ljava/lang/String;

    .line 183
    iget-object v5, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    add-int/lit8 v6, v2, 0x1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    invoke-direct {v0, v6, v7, v5}, Ll/ᩳܽۤ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    .line 186
    :cond_10
    iget-object v5, v0, Ll/ᩳܽۤ;->᩺:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ll/ᩳܽۤ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Ll/ᩳܽۤ;->ܶ:Ljava/lang/String;

    if-nez v5, :cond_12

    .line 189
    iget-object v5, v0, Ll/ᩳܽۤ;->᩺:Ljava/lang/String;

    if-nez v5, :cond_11

    .line 195
    iput-object v4, v0, Ll/ᩳܽۤ;->ܶ:Ljava/lang/String;

    goto :goto_9

    .line 190
    :cond_11
    invoke-virtual {v1}, Ll/ۡܽۤ;->clone()Ll/ۡܽۤ;

    move-result-object v1

    .line 191
    invoke-virtual {v1}, Ll/ۡܽۤ;->ۙ()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Ll/ۡܽۤ;->ۤ(I)V

    .line 192
    invoke-virtual {v1}, Ll/ۡܽۤ;->ᩴ()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Ll/ۡܽۤ;->ᩴ(I)V

    .line 193
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "undefined prefix: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Ll/ᩳܽۤ;->᩺:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 222
    invoke-static {v2, v1}, Ll/ᩳܽۤ;->ۙ(Ljava/lang/String;Ll/ۡܽۤ;)V

    throw v8

    .line 797
    :cond_12
    :goto_9
    iget-object v1, v0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    iget-object v2, v0, Ll/ᩳܽۤ;->ܶ:Ljava/lang/String;

    aput-object v2, v1, v3

    add-int/lit8 v2, v3, 0x1

    .line 798
    iget-object v4, v0, Ll/ᩳܽۤ;->᩺:Ljava/lang/String;

    aput-object v4, v1, v2

    add-int/lit8 v3, v3, 0x2

    .line 799
    iget-object v2, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    aput-object v2, v1, v3

    return-void

    .line 179
    :cond_13
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "illegal tag name: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 222
    invoke-static {v2, v1}, Ll/ᩳܽۤ;->ۙ(Ljava/lang/String;Ll/ۡܽۤ;)V

    throw v8

    :cond_14
    if-eq v3, v5, :cond_1d

    .line 716
    iget v2, v0, Ll/ᩳܽۤ;->᩷:I

    shl-int/lit8 v3, v2, 0x2

    add-int/lit8 v5, v2, 0x1

    .line 717
    iput v5, v0, Ll/ᩳܽۤ;->᩷:I

    shl-int/2addr v2, v7

    .line 718
    iget-object v5, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    add-int/lit8 v6, v3, 0x4

    .line 202
    array-length v9, v5

    if-lt v9, v6, :cond_15

    goto :goto_a

    :cond_15
    add-int/lit8 v6, v3, 0x14

    .line 204
    new-array v6, v6, [Ljava/lang/String;

    .line 205
    array-length v9, v5

    const/4 v10, 0x0

    invoke-static {v5, v10, v6, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v6

    .line 718
    :goto_a
    iput-object v5, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    .line 719
    iget-object v5, v0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    add-int/lit8 v6, v2, 0x2

    .line 210
    array-length v9, v5

    if-lt v9, v6, :cond_16

    goto :goto_b

    :cond_16
    add-int/lit8 v6, v2, 0xa

    .line 212
    new-array v6, v6, [Ll/ۡܽۤ;

    .line 213
    array-length v9, v5

    const/4 v10, 0x0

    invoke-static {v5, v10, v6, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v6

    .line 719
    :goto_b
    iput-object v5, v0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    .line 721
    aget-object v6, v5, v2

    if-nez v6, :cond_17

    .line 723
    new-instance v6, Ll/ۡܽۤ;

    .line 5
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 723
    aput-object v6, v5, v2

    .line 725
    :cond_17
    invoke-virtual {v6, v0}, Ll/ۡܽۤ;->᩷(Ll/ᩳܽۤ;)V

    .line 726
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->ۗ()Ljava/lang/String;

    move-result-object v5

    .line 727
    invoke-virtual {v6, v0}, Ll/ۡܽۤ;->ۙ(Ll/ᩳܽۤ;)V

    .line 728
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_1c

    .line 734
    iget-object v6, v0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    add-int/lit8 v2, v2, 0x1

    aget-object v9, v6, v2

    if-nez v9, :cond_18

    .line 736
    new-instance v9, Ll/ۡܽۤ;

    .line 5
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 736
    aput-object v9, v6, v2

    .line 739
    :cond_18
    iget-object v2, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    add-int/lit8 v6, v3, 0x1

    aput-object v4, v2, v3

    add-int/lit8 v4, v3, 0x2

    .line 740
    aput-object v8, v2, v6

    add-int/lit8 v3, v3, 0x3

    .line 741
    aput-object v5, v2, v4

    .line 743
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩵()V

    const/4 v2, 0x0

    .line 745
    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v4

    const/16 v6, 0x3d

    if-ne v4, v6, :cond_1b

    .line 749
    invoke-direct {v0, v6}, Ll/ᩳܽۤ;->ۙ(C)V

    .line 750
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩵()V

    .line 751
    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v4

    const/16 v5, 0x27

    if-eq v4, v5, :cond_1a

    const/16 v5, 0x22

    if-ne v4, v5, :cond_19

    goto :goto_c

    :cond_19
    const-string v1, "attr value delimiter missing!"

    .line 230
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v8

    .line 757
    :cond_1a
    :goto_c
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 759
    invoke-virtual {v9, v0}, Ll/ۡܽۤ;->᩷(Ll/ᩳܽۤ;)V

    .line 760
    iget v5, v0, Ll/ᩳܽۤ;->ۢ:I

    .line 761
    invoke-direct {v0, v4, v7}, Ll/ᩳܽۤ;->ۙ(IZ)V

    .line 762
    invoke-virtual {v9, v0}, Ll/ۡܽۤ;->ۙ(Ll/ᩳܽۤ;)V

    .line 764
    iget-object v6, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    invoke-direct {v0, v5}, Ll/ᩳܽۤ;->۫(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v3

    .line 765
    iput v5, v0, Ll/ᩳܽۤ;->ۢ:I

    const/16 v3, 0x20

    if-eq v4, v3, :cond_1

    .line 768
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    goto/16 :goto_0

    :cond_1b
    const-string v1, "Attr.value missing f. "

    .line 746
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v8

    :cond_1c
    const-string v1, "attr name expected"

    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v8

    :cond_1d
    const-string v1, "Unexpected EOF"

    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v8
.end method

.method private ۚ(I)I
    .locals 6

    .line 950
    :goto_0
    iget v0, p0, Ll/ᩳܽۤ;->ۨ:I

    iget-object v1, p0, Ll/ᩳܽۤ;->᩵:[I

    if-lt p1, v0, :cond_6

    .line 954
    iget-object v0, p0, Ll/ᩳܽۤ;->ܰ:[C

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gt v2, v4, :cond_0

    .line 955
    iget-object v0, p0, Ll/ᩳܽۤ;->ۘ:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->read()I

    move-result v0

    goto :goto_2

    .line 956
    :cond_0
    iget v2, p0, Ll/ᩳܽۤ;->ܿ:I

    iget v5, p0, Ll/ᩳܽۤ;->᩶:I

    if-ge v2, v5, :cond_1

    add-int/lit8 v5, v2, 0x1

    .line 957
    iput v5, p0, Ll/ᩳܽۤ;->ܿ:I

    aget-char v0, v0, v2

    goto :goto_2

    .line 959
    :cond_1
    iget-object v2, p0, Ll/ᩳܽۤ;->ۘ:Ljava/io/Reader;

    array-length v5, v0

    invoke-virtual {v2, v0, v3, v5}, Ljava/io/Reader;->read([CII)I

    move-result v2

    iput v2, p0, Ll/ᩳܽۤ;->᩶:I

    if-gtz v2, :cond_2

    const/4 v0, -0x1

    goto :goto_1

    .line 963
    :cond_2
    aget-char v0, v0, v3

    .line 965
    :goto_1
    iput v4, p0, Ll/ᩳܽۤ;->ܿ:I

    :goto_2
    const/16 v2, 0xd

    const/16 v5, 0xa

    if-ne v0, v2, :cond_3

    .line 969
    iput-boolean v4, p0, Ll/ᩳܽۤ;->ۖ:Z

    .line 970
    iget v0, p0, Ll/ᩳܽۤ;->ۨ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ᩳܽۤ;->ۨ:I

    aput v5, v1, v0

    goto :goto_0

    :cond_3
    if-ne v0, v5, :cond_4

    .line 973
    iget-boolean v0, p0, Ll/ᩳܽۤ;->ۖ:Z

    if-nez v0, :cond_5

    .line 974
    iget v0, p0, Ll/ᩳܽۤ;->ۨ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ᩳܽۤ;->ۨ:I

    aput v5, v1, v0

    goto :goto_3

    .line 976
    :cond_4
    iget v2, p0, Ll/ᩳܽۤ;->ۨ:I

    add-int/lit8 v4, v2, 0x1

    iput v4, p0, Ll/ᩳܽۤ;->ۨ:I

    aput v0, v1, v2

    .line 978
    :cond_5
    :goto_3
    iput-boolean v3, p0, Ll/ᩳܽۤ;->ۖ:Z

    goto :goto_0

    .line 982
    :cond_6
    aget p1, v1, p1

    return p1
.end method

.method private ۤ(Ljava/lang/String;)V
    .locals 4

    .line 234
    new-instance v0, Ll/ۢܽۤ;

    .line 235
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x64

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-direct {v0, p1, p0}, Ll/ۢܽۤ;-><init>(Ljava/lang/String;Ll/ᩳܽۤ;)V

    throw v0
.end method

.method private ۫(I)Ljava/lang/String;
    .locals 8

    .line 583
    iget-object v0, p0, Ll/ᩳܽۤ;->ᩳ:[C

    .line 584
    iget v1, p0, Ll/ᩳܽۤ;->ۢ:I

    sub-int/2addr v1, p1

    const/16 v2, 0x10

    if-le v1, v2, :cond_0

    .line 586
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0, p1, v1}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    :cond_0
    if-nez v1, :cond_1

    const-string p1, ""

    return-object p1

    :cond_1
    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    mul-int/lit8 v2, v1, 0x1f

    .line 593
    aget-char v3, v0, p1

    goto :goto_0

    :cond_2
    mul-int/lit8 v2, v1, 0x1f

    .line 595
    aget-char v3, v0, p1

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x1f

    add-int/lit8 v3, p1, 0x1

    aget-char v3, v0, v3

    :goto_0
    add-int/2addr v2, v3

    .line 597
    iget-object v3, p0, Ll/ᩳܽۤ;->۟:Ll/ᩳ᩶᩹;

    invoke-virtual {v3, v2}, Ll/ᩳ᩶᩹;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    .line 598
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v1, :cond_5

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v1, :cond_4

    add-int v6, v5, p1

    .line 601
    aget-char v6, v0, v6

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v6, v7, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    return-object v4

    .line 610
    :cond_5
    :goto_2
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v0, p1, v1}, Ljava/lang/String;-><init>([CII)V

    .line 611
    invoke-virtual {v3, v2, v4}, Ll/ᩳ᩶᩹;->ۙ(ILjava/lang/Object;)Ljava/lang/Object;

    return-object v4
.end method

.method private ܶ()V
    .locals 6

    .line 810
    invoke-direct {p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v0

    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->֫(I)V

    .line 813
    iget v0, p0, Ll/ᩳܽۤ;->ۢ:I

    .line 816
    :goto_0
    invoke-direct {p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v1

    const/16 v2, 0x3b

    const/4 v3, 0x0

    const/16 v4, 0x23

    if-ne v1, v2, :cond_5

    .line 838
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->۫(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    .line 839
    iput v0, p0, Ll/ᩳܽۤ;->ۢ:I

    const/4 v0, 0x0

    .line 844
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_1

    .line 846
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x78

    if-ne v0, v3, :cond_0

    const/4 v0, 0x2

    .line 847
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_1

    .line 848
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 849
    :goto_1
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->֫(I)V

    return-void

    .line 853
    :cond_1
    sget-object v4, Ll/ᩳܽۤ;->۠:Ljava/util/Map;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 855
    :goto_2
    iput-boolean v2, p0, Ll/ᩳܽۤ;->ۡ:Z

    if-nez v2, :cond_4

    .line 861
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 862
    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Ll/ᩳܽۤ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    return-void

    :cond_4
    const-string v0, "unresolved: &"

    const-string v2, ";"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 230
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v3

    :cond_5
    const/16 v2, 0x80

    if-ge v1, v2, :cond_a

    const/16 v2, 0x30

    if-lt v1, v2, :cond_6

    const/16 v2, 0x39

    if-le v1, v2, :cond_a

    :cond_6
    const/16 v2, 0x61

    if-lt v1, v2, :cond_7

    const/16 v2, 0x7a

    if-le v1, v2, :cond_a

    :cond_7
    const/16 v2, 0x41

    if-lt v1, v2, :cond_8

    const/16 v2, 0x5a

    if-le v1, v2, :cond_a

    :cond_8
    const/16 v2, 0x5f

    if-eq v1, v2, :cond_a

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_a

    if-ne v1, v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "unterminated entity ref"

    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v3

    .line 835
    :cond_a
    :goto_4
    invoke-direct {p0, v1}, Ll/ᩳܽۤ;->֫(I)V

    goto/16 :goto_0
.end method

.method private ܽ()I
    .locals 5

    const/4 v0, 0x0

    .line 556
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v0, v1, :cond_4

    const/16 v1, 0x26

    if-eq v0, v1, :cond_3

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    return v0

    .line 566
    :cond_0
    invoke-direct {p0, v4}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v0

    const/16 v1, 0x21

    if-eq v0, v1, :cond_2

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    const/16 v1, 0x3f

    if-eq v0, v1, :cond_2

    return v3

    :cond_1
    return v2

    :cond_2
    const/16 v0, 0x3e7

    return v0

    :cond_3
    const/4 v0, 0x6

    return v0

    .line 558
    :cond_4
    iget v0, p0, Ll/ᩳܽۤ;->ܳ:I

    if-nez v0, :cond_5

    return v4

    :cond_5
    sub-int/2addr v0, v4

    shl-int/2addr v0, v3

    .line 560
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "expected: </"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    add-int/2addr v0, v2

    aget-object v0, v3, v0

    const-string v2, ">"

    .line 0
    invoke-static {v1, v0, v2}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 230
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private ᩵()V
    .locals 2

    :goto_0
    const/4 v0, 0x0

    .line 1039
    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_1

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 1042
    :cond_0
    invoke-direct {p0}, Ll/ᩳܽۤ;->᩹()I

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 5

    .line 986
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 988
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 990
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x61

    if-lt v3, v4, :cond_1

    const/16 v4, 0x7a

    if-le v3, v4, :cond_3

    :cond_1
    const/16 v4, 0x41

    if-lt v3, v4, :cond_2

    const/16 v4, 0x5a

    if-le v3, v4, :cond_3

    :cond_2
    const/16 v4, 0x24

    if-eq v3, v4, :cond_3

    const/16 v4, 0x5f

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3a

    if-eq v3, v4, :cond_3

    const/16 v4, 0xb7

    if-ge v3, v4, :cond_3

    return v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method

.method private ᩹()I
    .locals 5

    .line 921
    iget v0, p0, Ll/ᩳܽۤ;->ۨ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    .line 922
    invoke-direct {p0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v0

    goto :goto_0

    .line 924
    :cond_0
    iget-object v0, p0, Ll/ᩳܽۤ;->᩵:[I

    aget v3, v0, v1

    .line 925
    aget v4, v0, v2

    aput v4, v0, v1

    move v0, v3

    .line 931
    :goto_0
    iget v1, p0, Ll/ᩳܽۤ;->ۨ:I

    sub-int/2addr v1, v2

    iput v1, p0, Ll/ᩳܽۤ;->ۨ:I

    .line 932
    iget v1, p0, Ll/ᩳܽۤ;->᩸:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ᩳܽۤ;->᩸:I

    .line 933
    iget v1, p0, Ll/ᩳܽۤ;->ۛ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ᩳܽۤ;->ۛ:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 937
    iget v1, p0, Ll/ᩳܽۤ;->ܺ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ᩳܽۤ;->ܺ:I

    .line 938
    iput v2, p0, Ll/ᩳܽۤ;->᩸:I

    :cond_1
    return v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 1165
    iget v0, p0, Ll/ᩳܽۤ;->ۧ:I

    return v0
.end method

.method public final ۙ()I
    .locals 1

    .line 1235
    iget v0, p0, Ll/ᩳܽۤ;->᩷:I

    return v0
.end method

.method public final ۙ(I)Ljava/lang/String;
    .locals 1

    .line 1253
    iget v0, p0, Ll/ᩳܽۤ;->᩷:I

    if-ge p1, v0, :cond_0

    .line 1255
    iget-object v0, p0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    shl-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x2

    aget-object p1, v0, p1

    return-object p1

    .line 1254
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "xml"

    .line 1093
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "http://www.w3.org/XML/1998/namespace"

    return-object p1

    :cond_0
    const-string v0, "xmlns"

    .line 1095
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "http://www.w3.org/2000/xmlns/"

    return-object p1

    .line 1098
    :cond_1
    iget v0, p0, Ll/ᩳܽۤ;->ܳ:I

    .line 1080
    iget-object v1, p0, Ll/ᩳܽۤ;->᩹:[I

    aget v0, v1, v0

    shl-int/lit8 v0, v0, 0x1

    :cond_2
    add-int/lit8 v0, v0, -0x2

    if-ltz v0, :cond_4

    if-nez p1, :cond_3

    .line 1100
    iget-object v1, p0, Ll/ᩳܽۤ;->ۗ:[Ljava/lang/String;

    aget-object v2, v1, v0

    if-nez v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 1101
    aget-object p1, v1, v0

    return-object p1

    .line 1102
    :cond_3
    iget-object v1, p0, Ll/ᩳܽۤ;->ۗ:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1103
    iget-object p1, p0, Ll/ᩳܽۤ;->ۗ:[Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    aget-object p1, p1, v0

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ljava/io/Reader;)V
    .locals 1

    .line 1049
    iput-object p1, p0, Ll/ᩳܽۤ;->ۘ:Ljava/io/Reader;

    const/4 p1, 0x1

    .line 1051
    iput p1, p0, Ll/ᩳܽۤ;->ܺ:I

    const/4 p1, 0x0

    .line 1052
    iput p1, p0, Ll/ᩳܽۤ;->᩸:I

    .line 1053
    iput p1, p0, Ll/ᩳܽۤ;->ۛ:I

    .line 1055
    iput p1, p0, Ll/ᩳܽۤ;->֨:I

    const/4 v0, 0x0

    .line 1056
    iput-object v0, p0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    .line 1057
    iput-object v0, p0, Ll/ᩳܽۤ;->ܶ:Ljava/lang/String;

    .line 1058
    iput-boolean p1, p0, Ll/ᩳܽۤ;->ᩴ:Z

    const/4 v0, -0x1

    .line 1059
    iput v0, p0, Ll/ᩳܽۤ;->᩷:I

    .line 1067
    iput p1, p0, Ll/ᩳܽۤ;->ܿ:I

    .line 1068
    iput p1, p0, Ll/ᩳܽۤ;->᩶:I

    .line 1069
    iput p1, p0, Ll/ᩳܽۤ;->ۨ:I

    .line 1070
    iput p1, p0, Ll/ᩳܽۤ;->ܳ:I

    return-void
.end method

.method public final ۚ()I
    .locals 1

    .line 1169
    iget v0, p0, Ll/ᩳܽۤ;->֫:I

    return v0
.end method

.method public final ۤ()I
    .locals 1

    .line 1177
    iget v0, p0, Ll/ᩳܽۤ;->ܺ:I

    return v0
.end method

.method public final ۤ(I)Ljava/lang/String;
    .locals 1

    .line 1247
    iget v0, p0, Ll/ᩳܽۤ;->᩷:I

    if-ge p1, v0, :cond_0

    .line 1249
    iget-object v0, p0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    shl-int/lit8 p1, p1, 0x2

    aget-object p1, v0, p1

    return-object p1

    .line 1248
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ۧ()I
    .locals 1

    .line 1173
    iget v0, p0, Ll/ᩳܽۤ;->᩻:I

    return v0
.end method

.method public final ۫()Ljava/lang/String;
    .locals 1

    .line 1217
    iget-object v0, p0, Ll/ᩳܽۤ;->ܶ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 1221
    iget-object v0, p0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ(I)Ll/ۡܽۤ;
    .locals 1

    .line 1277
    iget v0, p0, Ll/ᩳܽۤ;->᩷:I

    if-ge p1, v0, :cond_0

    .line 1279
    iget-object v0, p0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1

    .line 1278
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ܺ()I
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 1302
    iput v1, v0, Ll/ᩳܽۤ;->ۢ:I

    const/4 v2, 0x1

    .line 1303
    iput-boolean v2, v0, Ll/ᩳܽۤ;->ۚ:Z

    .line 1307
    iget v3, v0, Ll/ᩳܽۤ;->ܺ:I

    iput v3, v0, Ll/ᩳܽۤ;->ۧ:I

    .line 1308
    iget v3, v0, Ll/ᩳܽۤ;->᩸:I

    iput v3, v0, Ll/ᩳܽۤ;->֫:I

    .line 1309
    iget v3, v0, Ll/ᩳܽۤ;->ۛ:I

    iput v3, v0, Ll/ᩳܽۤ;->᩻:I

    const/16 v3, 0x270f

    .line 249
    :cond_0
    iget-object v4, v0, Ll/ᩳܽۤ;->ۘ:Ljava/io/Reader;

    const/4 v5, 0x0

    if-eqz v4, :cond_2b

    .line 252
    iget v4, v0, Ll/ᩳܽۤ;->֨:I

    const/4 v6, 0x3

    if-ne v4, v6, :cond_1

    .line 253
    iget v4, v0, Ll/ᩳܽۤ;->ܳ:I

    sub-int/2addr v4, v2

    iput v4, v0, Ll/ᩳܽۤ;->ܳ:I

    :cond_1
    :goto_0
    const/4 v4, -0x1

    .line 256
    iput v4, v0, Ll/ᩳܽۤ;->᩷:I

    .line 261
    iget-boolean v7, v0, Ll/ᩳܽۤ;->ᩴ:Z

    const/4 v8, 0x6

    const/4 v9, 0x4

    if-eqz v7, :cond_2

    .line 262
    iput-boolean v1, v0, Ll/ᩳܽۤ;->ᩴ:Z

    .line 263
    iput v6, v0, Ll/ᩳܽۤ;->֨:I

    goto/16 :goto_d

    .line 292
    :cond_2
    iput-object v5, v0, Ll/ᩳܽۤ;->᩺:Ljava/lang/String;

    .line 293
    iput-object v5, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    .line 294
    iput-object v5, v0, Ll/ᩳܽۤ;->ܶ:Ljava/lang/String;

    .line 297
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->ܽ()I

    move-result v7

    iput v7, v0, Ll/ᩳܽۤ;->֨:I

    if-eq v7, v2, :cond_27

    const/4 v10, 0x2

    if-eq v7, v10, :cond_26

    const/16 v10, 0x3e

    if-eq v7, v6, :cond_23

    const/16 v6, 0x3c

    const/4 v11, 0x7

    if-eq v7, v9, :cond_22

    if-eq v7, v8, :cond_21

    .line 352
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 353
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v7

    const/16 v13, 0xa

    const/16 v14, 0x2d

    const/4 v15, 0x3

    const/16 v12, 0x3f

    if-ne v7, v12, :cond_e

    .line 356
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v16, 0x2

    const/16 v12, 0x78

    if-eq v7, v12, :cond_3

    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v12, 0x58

    if-ne v7, v12, :cond_d

    .line 357
    :cond_3
    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v12, 0x6d

    if-eq v7, v12, :cond_4

    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v12, 0x4d

    if-ne v7, v12, :cond_d

    .line 363
    :cond_4
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 364
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 366
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v12, 0x6c

    if-eq v7, v12, :cond_5

    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v12, 0x4c

    if-ne v7, v12, :cond_d

    :cond_5
    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v12, 0x20

    if-gt v7, v12, :cond_d

    .line 368
    iget v4, v0, Ll/ᩳܽۤ;->ܺ:I

    if-ne v4, v2, :cond_c

    iget v4, v0, Ll/ᩳܽۤ;->᩸:I

    if-gt v4, v9, :cond_c

    .line 371
    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۙ(Z)V

    .line 373
    iget v4, v0, Ll/ᩳܽۤ;->᩷:I

    if-lt v4, v2, :cond_b

    iget-object v4, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    aget-object v4, v4, v16

    const-string v6, "version"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 376
    iget-object v4, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    aget-object v6, v4, v15

    .line 380
    iget v6, v0, Ll/ᩳܽۤ;->᩷:I

    if-ge v2, v6, :cond_6

    const-string v6, "encoding"

    aget-object v4, v4, v8

    .line 381
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 382
    iget-object v4, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    aget-object v4, v4, v11

    const/4 v4, 0x2

    goto :goto_1

    :cond_6
    const/4 v4, 0x1

    .line 386
    :goto_1
    iget v6, v0, Ll/ᩳܽۤ;->᩷:I

    if-ge v4, v6, :cond_9

    iget-object v6, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    mul-int/lit8 v7, v4, 0x4

    add-int/lit8 v8, v7, 0x2

    aget-object v6, v6, v8

    const-string v8, "standalone"

    .line 387
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 388
    iget-object v6, v0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    add-int/lit8 v7, v7, 0x3

    aget-object v6, v6, v7

    const-string v7, "yes"

    .line 389
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_2

    :cond_7
    const-string v7, "no"

    .line 391
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    const-string v1, "illegal standalone value: "

    .line 0
    invoke-static {v1, v6}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    .line 398
    :cond_9
    :goto_3
    iget v6, v0, Ll/ᩳܽۤ;->᩷:I

    if-ne v4, v6, :cond_a

    .line 401
    iput-boolean v2, v0, Ll/ᩳܽۤ;->ۚ:Z

    .line 402
    iput v1, v0, Ll/ᩳܽۤ;->ۢ:I

    const/16 v4, 0x3e6

    goto/16 :goto_c

    :cond_a
    const-string v1, "illegal xmldecl"

    .line 230
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    :cond_b
    const-string v1, "version expected"

    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    :cond_c
    const-string v1, "PI must not start with xml"

    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    :cond_d
    const-string v7, ""

    const/16 v8, 0x8

    const/16 v9, 0x3f

    goto :goto_4

    :cond_e
    const/16 v8, 0x21

    if-ne v7, v8, :cond_20

    .line 415
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    if-ne v7, v14, :cond_f

    const/16 v8, 0x9

    const-string v7, "--"

    const/16 v9, 0x2d

    goto :goto_4

    .line 419
    :cond_f
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v7

    const/16 v8, 0x5b

    if-ne v7, v8, :cond_10

    const/4 v7, 0x5

    const-string v8, "[CDATA["

    const/16 v9, 0x5d

    const/4 v11, 0x1

    goto :goto_5

    :cond_10
    const-string v7, "DOCTYPE"

    const/16 v8, 0xa

    const/4 v9, -0x1

    :goto_4
    const/4 v11, 0x0

    move/from16 v17, v8

    move-object v8, v7

    move/from16 v7, v17

    :goto_5
    const/4 v12, 0x0

    .line 434
    :goto_6
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v12, v15, :cond_11

    .line 435
    invoke-virtual {v8, v12}, Ljava/lang/String;->charAt(I)C

    move-result v15

    invoke-direct {v0, v15}, Ll/ᩳܽۤ;->ۙ(C)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_11
    const-string v8, "Unexpected EOF"

    if-ne v7, v13, :cond_18

    const/4 v9, 0x0

    const/4 v12, 0x1

    .line 484
    :cond_12
    :goto_7
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v13

    if-eq v13, v4, :cond_17

    const/16 v14, 0x27

    if-eq v13, v14, :cond_15

    if-eq v13, v6, :cond_14

    if-eq v13, v10, :cond_13

    goto :goto_8

    :cond_13
    if-nez v9, :cond_16

    add-int/lit8 v12, v12, -0x1

    if-nez v12, :cond_16

    goto :goto_b

    :cond_14
    if-nez v9, :cond_16

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_15
    xor-int/lit8 v9, v9, 0x1

    :cond_16
    :goto_8
    if-eqz v11, :cond_12

    .line 508
    invoke-direct {v0, v13}, Ll/ᩳܽۤ;->֫(I)V

    goto :goto_7

    .line 230
    :cond_17
    invoke-direct {v0, v8}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    :cond_18
    const/4 v6, 0x0

    .line 441
    :goto_9
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    move-result v12

    if-eq v12, v4, :cond_1f

    if-eqz v11, :cond_19

    .line 448
    invoke-direct {v0, v12}, Ll/ᩳܽۤ;->֫(I)V

    :cond_19
    const/16 v13, 0x3f

    if-eq v9, v13, :cond_1a

    if-ne v12, v9, :cond_1e

    .line 451
    :cond_1a
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v13

    if-ne v13, v9, :cond_1e

    .line 452
    invoke-direct {v0, v2}, Ll/ᩳܽۤ;->ۚ(I)I

    move-result v13

    if-ne v13, v10, :cond_1e

    if-ne v9, v14, :cond_1c

    if-eq v6, v14, :cond_1b

    goto :goto_a

    :cond_1b
    const-string v1, "illegal comment delimiter: --->"

    .line 230
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    .line 461
    :cond_1c
    :goto_a
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 462
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    if-eqz v11, :cond_1d

    const/16 v6, 0x3f

    if-eq v9, v6, :cond_1d

    .line 465
    iget v4, v0, Ll/ᩳܽۤ;->ۢ:I

    sub-int/2addr v4, v2

    iput v4, v0, Ll/ᩳܽۤ;->ۢ:I

    :cond_1d
    :goto_b
    move v4, v7

    .line 332
    :goto_c
    iput v4, v0, Ll/ᩳܽۤ;->֨:I

    const/16 v13, 0x3e6

    if-ne v4, v13, :cond_27

    .line 334
    iget v4, v0, Ll/ᩳܽۤ;->ܺ:I

    iput v4, v0, Ll/ᩳܽۤ;->ۧ:I

    .line 335
    iget v4, v0, Ll/ᩳܽۤ;->᩸:I

    iput v4, v0, Ll/ᩳܽۤ;->֫:I

    .line 336
    iget v4, v0, Ll/ᩳܽۤ;->ۛ:I

    iput v4, v0, Ll/ᩳܽۤ;->᩻:I

    const/4 v6, 0x3

    goto/16 :goto_0

    :cond_1e
    const/16 v6, 0x3f

    const/16 v13, 0x3e6

    move v6, v12

    goto :goto_9

    .line 230
    :cond_1f
    invoke-direct {v0, v8}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    :cond_20
    const-string v1, "illegal: <"

    .line 0
    invoke-static {v7, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    .line 302
    :cond_21
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->ܶ()V

    goto/16 :goto_d

    .line 317
    :cond_22
    invoke-direct {v0, v6, v2}, Ll/ᩳܽۤ;->ۙ(IZ)V

    .line 318
    iget v4, v0, Ll/ᩳܽۤ;->ܳ:I

    if-nez v4, :cond_27

    .line 319
    iget-boolean v4, v0, Ll/ᩳܽۤ;->ۚ:Z

    if-eqz v4, :cond_27

    .line 320
    iget v4, v0, Ll/ᩳܽۤ;->ܺ:I

    iput v4, v0, Ll/ᩳܽۤ;->ۧ:I

    .line 321
    iget v4, v0, Ll/ᩳܽۤ;->᩸:I

    iput v4, v0, Ll/ᩳܽۤ;->֫:I

    .line 322
    iget v4, v0, Ll/ᩳܽۤ;->ۛ:I

    iput v4, v0, Ll/ᩳܽۤ;->᩻:I

    .line 323
    iput v11, v0, Ll/ᩳܽۤ;->֨:I

    goto :goto_d

    .line 517
    :cond_23
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 518
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩹()I

    .line 519
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->ۗ()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    .line 520
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->᩵()V

    .line 521
    invoke-direct {v0, v10}, Ll/ᩳܽۤ;->ۙ(C)V

    .line 523
    iget v4, v0, Ll/ᩳܽۤ;->ܳ:I

    add-int/lit8 v6, v4, -0x1

    shl-int/lit8 v6, v6, 0x2

    if-eqz v4, :cond_25

    .line 531
    iget-object v4, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    iget-object v7, v0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    add-int/lit8 v8, v6, 0x3

    aget-object v7, v7, v8

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    .line 550
    iget-object v4, v0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    aget-object v5, v4, v6

    iput-object v5, v0, Ll/ᩳܽۤ;->ܶ:Ljava/lang/String;

    add-int/lit8 v5, v6, 0x1

    .line 551
    aget-object v5, v4, v5

    iput-object v5, v0, Ll/ᩳܽۤ;->᩺:Ljava/lang/String;

    add-int/lit8 v6, v6, 0x2

    .line 552
    aget-object v4, v4, v6

    iput-object v4, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    goto :goto_d

    .line 532
    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected: /"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Ll/ᩳܽۤ;->۫:[Ljava/lang/String;

    aget-object v2, v2, v8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " read: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Ll/ᩳܽۤ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    :cond_25
    const-string v1, "element stack empty"

    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5

    .line 306
    :cond_26
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۙ(Z)V

    .line 1312
    :cond_27
    :goto_d
    iget v4, v0, Ll/ᩳܽۤ;->֨:I

    if-ge v4, v3, :cond_28

    move v3, v4

    :cond_28
    const/4 v4, 0x6

    if-gt v3, v4, :cond_0

    const/4 v4, 0x4

    if-lt v3, v4, :cond_29

    .line 1317
    invoke-direct/range {p0 .. p0}, Ll/ᩳܽۤ;->ܽ()I

    move-result v5

    if-ge v5, v4, :cond_0

    .line 1319
    :cond_29
    iput v3, v0, Ll/ᩳܽۤ;->֨:I

    if-le v3, v4, :cond_2a

    .line 1321
    iput v4, v0, Ll/ᩳܽۤ;->֨:I

    .line 1323
    :cond_2a
    iget v1, v0, Ll/ᩳܽۤ;->֨:I

    return v1

    :cond_2b
    const-string v1, "No Input specified"

    .line 250
    invoke-direct {v0, v1}, Ll/ᩳܽۤ;->ۤ(Ljava/lang/String;)V

    throw v5
.end method

.method public final ᩴ()I
    .locals 1

    .line 1294
    iget v0, p0, Ll/ᩳܽۤ;->֨:I

    return v0
.end method

.method public final ᩴ(I)Ljava/lang/String;
    .locals 1

    .line 1271
    iget v0, p0, Ll/ᩳܽۤ;->᩷:I

    if-ge p1, v0, :cond_0

    .line 1273
    iget-object v0, p0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    shl-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x3

    aget-object p1, v0, p1

    return-object p1

    .line 1272
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ᩷()I
    .locals 1

    .line 1181
    iget v0, p0, Ll/ᩳܽۤ;->᩸:I

    return v0
.end method

.method public final ᩷(I)Ll/ۡܽۤ;
    .locals 1

    .line 1259
    iget v0, p0, Ll/ᩳܽۤ;->᩷:I

    if-ge p1, v0, :cond_0

    .line 1261
    iget-object v0, p0, Ll/ᩳܽۤ;->ۙ:[Ll/ۡܽۤ;

    shl-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1

    .line 1260
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ᩸()I
    .locals 1

    .line 1185
    iget v0, p0, Ll/ᩳܽۤ;->ۛ:I

    return v0
.end method

.method public final ᩸(I)Ljava/lang/String;
    .locals 1

    .line 1265
    iget v0, p0, Ll/ᩳܽۤ;->᩷:I

    if-ge p1, v0, :cond_0

    .line 1267
    iget-object v0, p0, Ll/ᩳܽۤ;->ۤ:[Ljava/lang/String;

    shl-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    return-object p1

    .line 1266
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 2

    .line 1196
    iget v0, p0, Ll/ᩳܽۤ;->֨:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩳܽۤ;->ۡ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll/ᩳܽۤ;->۫(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
