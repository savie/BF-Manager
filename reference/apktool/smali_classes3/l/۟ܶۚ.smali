.class public final Ll/۟ܶۚ;
.super Ljava/lang/Object;
.source "G7AI"


# static fields
.field public static final ܳ:[C


# instance fields
.field public ۙ:Ljava/lang/ref/SoftReference;

.field public ۤ:Ljava/lang/ref/SoftReference;

.field public final ᩴ:Ll/ۖܶۚ;

.field public final ᩷:Ljava/lang/Object;

.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789abcdef"

    .line 52
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/۟ܶۚ;->ܳ:[C

    return-void
.end method

.method public constructor <init>(Ll/ۖܶۚ;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۟ܶۚ;->᩷:Ljava/lang/Object;

    .line 64
    iput-object p1, p0, Ll/۟ܶۚ;->ᩴ:Ll/ۖܶۚ;

    .line 65
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۟ܶۚ;->᩸:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ll/ۖܶۚ;Ljava/util/ArrayList;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۟ܶۚ;->᩷:Ljava/lang/Object;

    .line 72
    iput-object p1, p0, Ll/۟ܶۚ;->ᩴ:Ll/ۖܶۚ;

    .line 73
    invoke-static {p2}, Ll/֨ܶۚ;->ۙ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܶۚ;->᩸:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ۙ(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۟ܶۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic ۙ(Ll/ۖܳۤ;Ll/ۖܳۤ;)I
    .locals 2

    .line 167
    invoke-interface {p0}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܳ۫ۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۤ۫ۤ;->۫()I

    move-result v0

    invoke-interface {p1}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܳ۫ۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۤ۫ۤ;->۫()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-nez v0, :cond_0

    .line 168
    invoke-interface {p0}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v0

    invoke-interface {v0}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v0

    invoke-interface {p1}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    :cond_0
    if-nez v0, :cond_1

    .line 169
    invoke-static {p0}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ll/۟ܶۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_1
    return v0
.end method

.method public static ۙ(Ll/ۚ۫ۤ;)I
    .locals 2

    .line 1621
    invoke-interface {p0}, Ll/ۚ۫ۤ;->ܽ()I

    move-result v0

    .line 1622
    invoke-interface {p0}, Ll/ۚ۫ۤ;->getValue()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0

    .line 1627
    :cond_2
    :goto_1
    invoke-interface {p0}, Ll/ۚ۫ۤ;->getValue()I

    move-result p0

    return p0
.end method

.method public static ۙ(Ljava/lang/String;)J
    .locals 10

    const-wide/16 v0, -0x1

    if-eqz p0, :cond_6

    .line 826
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_6

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v7, "0x"

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    const-wide/16 v2, 0x0

    const/4 v4, 0x2

    .line 830
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_5

    .line 831
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x30

    if-lt v5, v6, :cond_1

    const/16 v6, 0x39

    if-gt v5, v6, :cond_1

    add-int/lit8 v5, v5, -0x30

    goto :goto_1

    :cond_1
    const/16 v6, 0x61

    if-lt v5, v6, :cond_2

    const/16 v6, 0x66

    if-gt v5, v6, :cond_2

    add-int/lit8 v5, v5, -0x57

    goto :goto_1

    :cond_2
    const/16 v6, 0x41

    if-lt v5, v6, :cond_3

    const/16 v6, 0x46

    if-gt v5, v6, :cond_3

    add-int/lit8 v5, v5, -0x37

    goto :goto_1

    :cond_3
    const/4 v5, -0x1

    :goto_1
    if-gez v5, :cond_4

    return-wide v0

    :cond_4
    const/4 v6, 0x4

    shl-long/2addr v2, v6

    int-to-long v5, v5

    or-long/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return-wide v2

    :cond_6
    :goto_2
    return-wide v0
.end method

.method public static ۙ(I)Ljava/lang/String;
    .locals 5

    const/16 v0, 0xa

    new-array v0, v0, [C

    const/16 v1, 0x30

    const/4 v2, 0x0

    aput-char v1, v0, v2

    const/4 v1, 0x1

    const/16 v3, 0x78

    aput-char v3, v0, v1

    :goto_0
    const/16 v1, 0x8

    if-ge v2, v1, :cond_0

    add-int/lit8 v1, v2, 0x2

    mul-int/lit8 v3, v2, 0x4

    rsub-int/lit8 v3, v3, 0x1c

    ushr-int v3, p0, v3

    and-int/lit8 v3, v3, 0xf

    .line 799
    sget-object v4, Ll/۟ܶۚ;->ܳ:[C

    aget-char v3, v4, v3

    aput-char v3, v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 801
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static bridge synthetic ۙ(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۟ܶۚ;->᩷(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ۚ۫ۤ;Ll/ۡܽۚ;Ljava/util/HashSet;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/۟ܶۚ;->ۙ(Ll/ۚ۫ۤ;Ll/ۡܽۚ;Ljava/util/Set;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۚ۫ۤ;Ll/ۡܽۚ;Ljava/util/Set;)Ljava/lang/String;
    .locals 1

    .line 1553
    iget-object v0, p1, Ll/ۡܽۚ;->ۙ:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1556
    :cond_0
    invoke-interface {p0}, Ll/ۚ۫ۤ;->ܽ()I

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "null_value"

    return-object p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_4

    .line 1560
    iget-boolean p0, p1, Ll/ۡܽۚ;->ۤ:Z

    if-eqz p0, :cond_2

    const-string p0, "styled_text"

    return-object p0

    .line 1563
    :cond_2
    iget-object p0, p1, Ll/ۡܽۚ;->᩷:Ljava/lang/String;

    if-eqz p0, :cond_3

    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "file_path"

    return-object p0

    :cond_3
    const-string p0, "text"

    return-object p0

    :cond_4
    const/4 p1, 0x1

    if-eq p0, p1, :cond_e

    const/4 p1, 0x7

    if-ne p0, p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 p1, 0x2

    if-eq p0, p1, :cond_d

    const/16 p1, 0x8

    if-ne p0, p1, :cond_6

    goto :goto_2

    :cond_6
    const/16 p1, 0x12

    if-ne p0, p1, :cond_7

    const-string p0, "boolean"

    return-object p0

    :cond_7
    const/16 p1, 0x1c

    if-lt p0, p1, :cond_8

    const/16 p1, 0x1f

    if-gt p0, p1, :cond_8

    const-string p0, "color"

    return-object p0

    :cond_8
    const/4 p1, 0x5

    if-ne p0, p1, :cond_9

    const-string p0, "dimension"

    return-object p0

    :cond_9
    const/4 p1, 0x6

    if-ne p0, p1, :cond_a

    const-string p0, "fraction"

    return-object p0

    :cond_a
    const/4 p1, 0x4

    if-eq p0, p1, :cond_c

    const/16 p1, 0x10

    if-eq p0, p1, :cond_c

    const/16 p1, 0x11

    if-ne p0, p1, :cond_b

    goto :goto_1

    :cond_b
    :goto_0
    const-string p0, "unparsed"

    return-object p0

    :cond_c
    :goto_1
    const-string p0, "number"

    return-object p0

    :cond_d
    :goto_2
    const-string p0, "attribute"

    return-object p0

    :cond_e
    :goto_3
    const-string p0, "reference"

    return-object p0
.end method

.method public static ۙ(Ljava/lang/Iterable;)Ljava/util/ArrayList;
    .locals 2

    .line 661
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 662
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܳۤ;

    .line 663
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 665
    :cond_0
    new-instance p0, Ll/ܿᩴܳ;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Ll/ܿᩴܳ;-><init>(I)V

    invoke-static {v0, p0}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static bridge synthetic ۙ(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۟ܶۚ;->ۙ(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Ll/ᩴ᩸ۤ;)Ljava/util/HashMap;
    .locals 8

    .line 439
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 440
    iget-object v1, p0, Ll/۟ܶۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ܶۚ;

    .line 442
    invoke-virtual {v2}, Ll/֨ܶۚ;->ۙ()Z

    move-result v3

    iget-object v4, v2, Ll/֨ܶۚ;->ܺ:Ljava/lang/String;

    iget v5, v2, Ll/֨ܶۚ;->۫:I

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ll/֨ܶۚ;->᩷()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 443
    :cond_1
    invoke-static {p1, v5, v4}, Ll/۟ܶۚ;->᩷(Ll/ۜܳۤ;ILjava/lang/String;)Ll/ۖܳۤ;

    move-result-object v3

    if-eqz v3, :cond_2

    const v6, 0xffff

    and-int/2addr v6, v5

    .line 444
    invoke-interface {v3, v6}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 448
    invoke-static {v5, v4}, Ll/۟ܶۚ;->᩷(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v2, v2, Ll/֨ܶۚ;->ۤ:[B

    .line 449
    invoke-static {v3, v6, v2}, Ll/ۘܽۚ;->ۙ(Ll/ۖܳۤ;I[B)Ll/ۨܽۚ;

    move-result-object v2

    .line 448
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    const-string p1, "RESOURCE_PATCH_CORRUPT"

    const-string v0, "Resource patch target is missing from base resources.arsc."

    .line 445
    invoke-static {p1, v0}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    :cond_3
    return-object v0
.end method

.method public static bridge synthetic ۙ(Ll/ۜܳۤ;ILjava/lang/String;)Ll/ۖܳۤ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/۟ܶۚ;->᩷(Ll/ۜܳۤ;ILjava/lang/String;)Ll/ۖܳۤ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ۖᩴۤ;Ll/ۖܳۤ;I)Ll/ۖܽۚ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/۟ܶۚ;->᩷(Ll/ۖᩴۤ;Ll/ۖܳۤ;I)Ll/ۖܽۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;IIIILjava/util/Set;Ljava/util/HashMap;)Ll/ۗܶۚ;
    .locals 31

    move-object/from16 v0, p2

    move/from16 v1, p4

    move/from16 v2, p5

    move-object/from16 v13, p0

    .line 1472
    iget-object v14, v13, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    .line 1473
    invoke-static/range {p1 .. p1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v18

    .line 1474
    invoke-interface/range {p2 .. p2}, Ll/۠ܳۤ;->ۤۙ()I

    move-result v15

    const/16 v17, 0x0

    if-nez v15, :cond_1

    if-ltz v1, :cond_0

    .line 1477
    invoke-static {v14, v0, v1}, Ll/ܶ᩹ۚ;->ۙ(Ll/ۖᩴۤ;Ll/۠ܳۤ;I)Ll/ᩴ᩹ۚ;

    move-result-object v0

    move-object/from16 v30, v0

    goto :goto_0

    :cond_0
    move-object/from16 v30, v17

    .line 2435
    :goto_0
    new-instance v0, Ll/ۗܶۚ;

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-string v19, "null_value"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v15, v0

    move-object/from16 v16, v17

    invoke-direct/range {v15 .. v30}, Ll/ۗܶۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽܶۚ;Ljava/util/ArrayList;ZILl/ᩴ᩹ۚ;)V

    return-object v0

    :cond_1
    if-ltz v1, :cond_2

    .line 1480
    invoke-static {v14, v0, v1}, Ll/ܶ᩹ۚ;->ۙ(Ll/ۖᩴۤ;Ll/۠ܳۤ;I)Ll/ᩴ᩹ۚ;

    move-result-object v1

    move-object/from16 v30, v1

    goto :goto_1

    :cond_2
    move-object/from16 v30, v17

    .line 1481
    :goto_1
    invoke-static/range {p2 .. p2}, Ll/۟ܶۚ;->᩸(Ll/۠ܳۤ;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    .line 1482
    invoke-interface {v0, v3}, Ll/۠ܳۤ;->getValue(I)Ll/ۚ۫ۤ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object/from16 v4, v18

    move/from16 v5, p3

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, v30

    invoke-static/range {v0 .. v9}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/ۚ۫ۤ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/ᩴ᩹ۚ;)Ll/ۗܶۚ;

    move-result-object v0

    return-object v0

    .line 1485
    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1487
    invoke-interface/range {p2 .. p2}, Ll/۠ܳۤ;->values()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v12, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ll/ۚ۫ۤ;

    if-ge v12, v2, :cond_4

    .line 1489
    invoke-interface {v4}, Ll/ۚ۫ۤ;->᩻ۙ()I

    move-result v3

    move-object/from16 v11, p1

    invoke-static {v14, v11, v3}, Ll/۟ܶۚ;->᩷(Ll/ۖᩴۤ;Ll/ۖܳۤ;I)Ll/ۖܽۚ;

    move-result-object v3

    .line 1490
    iget-object v5, v3, Ll/ۖܽۚ;->ۙ:Ljava/lang/String;

    iget-object v6, v3, Ll/ۖܽۚ;->᩷:Ljava/lang/String;

    const/16 v16, 0x0

    move-object/from16 v3, p0

    move-object/from16 v7, v18

    move/from16 v8, p3

    move/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move/from16 v17, v12

    move-object/from16 v12, v16

    invoke-static/range {v3 .. v12}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/ۚ۫ۤ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/ᩴ᩹ۚ;)Ll/ۗܶۚ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    move/from16 v17, v12

    :goto_3
    add-int/lit8 v12, v17, 0x1

    goto :goto_2

    :cond_5
    if-le v15, v2, :cond_6

    const/4 v0, 0x1

    const/16 v28, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    const/16 v28, 0x0

    .line 2446
    :goto_4
    new-instance v0, Ll/ۗܶۚ;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v19, "item_list"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move v2, v15

    move-object v15, v0

    move-object/from16 v27, v1

    move/from16 v29, v2

    invoke-direct/range {v15 .. v30}, Ll/ۗܶۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽܶۚ;Ljava/util/ArrayList;ZILl/ᩴ᩹ۚ;)V

    return-object v0
.end method

.method public static ۙ(Ll/֨ܽۚ;Ll/ۚ۫ۤ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/ᩴ᩹ۚ;)Ll/ۗܶۚ;
    .locals 19

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v7, p8

    move-object/from16 v15, p9

    .line 1510
    iget-object v1, v6, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    move/from16 v2, p5

    .line 1511
    invoke-static {v1, v0, v2}, Ll/۟ܶۚ;->ۙ(Ll/ۖᩴۤ;Ll/ۚ۫ۤ;I)Ll/ۡܽۚ;

    move-result-object v8

    iget-object v1, v8, Ll/ۡܽۚ;->ۙ:Ljava/lang/String;

    move-object/from16 v5, p7

    .line 1512
    invoke-static {v0, v8, v5}, Ll/۟ܶۚ;->ۙ(Ll/ۚ۫ۤ;Ll/ۡܽۚ;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "null_value"

    .line 1513
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2435
    new-instance v16, Ll/ۗܶۚ;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v9

    move-object v9, v10

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v15, p9

    invoke-direct/range {v0 .. v15}, Ll/ۗܶۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽܶۚ;Ljava/util/ArrayList;ZILl/ᩴ᩹ۚ;)V

    return-object v16

    :cond_0
    const-string v2, "unparsed"

    .line 1516
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1518
    new-instance v16, Ll/ۗܶۚ;

    if-eqz v1, :cond_2

    .line 1543
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 219
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x12c

    invoke-static {v0, v2, v3, v1}, Ll/֨۫ۚ;->ۙ(IIILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v7, 0x0

    .line 1519
    :goto_1
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v9

    move-object v9, v10

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v15, p9

    invoke-direct/range {v0 .. v15}, Ll/ۗܶۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽܶۚ;Ljava/util/ArrayList;ZILl/ᩴ᩹ۚ;)V

    return-object v16

    .line 1522
    :cond_3
    iget-object v11, v8, Ll/ۡܽۚ;->᩸:Ljava/lang/String;

    .line 1523
    invoke-static/range {p1 .. p1}, Ll/۟ܶۚ;->ۙ(Ll/ۚ۫ۤ;)I

    move-result v12

    if-nez v12, :cond_4

    const/4 v13, 0x0

    goto :goto_2

    .line 788
    :cond_4
    invoke-static {v12}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    :goto_2
    const-string v0, "file_path"

    .line 1525
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v8, Ll/ۡܽۚ;->᩷:Ljava/lang/String;

    move-object v14, v0

    goto :goto_3

    :cond_5
    const/4 v14, 0x0

    :goto_3
    const/4 v0, 0x1

    move/from16 v1, p6

    if-ne v1, v0, :cond_8

    if-eqz v12, :cond_8

    .line 788
    invoke-static {v12}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object v3

    const-string v0, "\n"

    move-object/from16 v4, p4

    .line 0
    invoke-static {v4, v0, v3}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v7, :cond_6

    .line 1710
    invoke-virtual {v7, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1711
    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽܶۚ;

    move-object v12, v0

    move-object/from16 p1, v13

    goto :goto_5

    .line 1729
    :cond_6
    :try_start_0
    new-instance v1, Ll/᩷ܶۚ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    move-object v10, v1

    move-object/from16 v1, p0

    move-object/from16 p1, v13

    move-object v13, v2

    move v2, v12

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    :try_start_1
    invoke-direct/range {v0 .. v5}, Ll/᩷ܶۚ;-><init>(Ll/֨ܽۚ;ILjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    .line 1731
    new-instance v0, Ll/ᩳܽۚ;

    invoke-direct {v0, v10}, Ll/ᩳܽۚ;-><init>(Ll/᩷ܶۚ;)V

    invoke-static {v6, v12, v0}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;ILl/ܳܶۚ;)V

    .line 1732
    invoke-virtual {v10}, Ll/᩷ܶۚ;->ۙ()Ll/ܽܶۚ;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_0
    move-object/from16 p1, v13

    move-object v13, v2

    :catch_1
    const/4 v0, 0x0

    :goto_4
    if-eqz v7, :cond_7

    .line 1716
    invoke-virtual {v7, v13, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    move-object v12, v0

    goto :goto_5

    :cond_8
    move-object/from16 p1, v13

    const/4 v12, 0x0

    .line 1531
    :goto_5
    new-instance v16, Ll/ۗܶۚ;

    const-string v0, "styled_text"

    .line 1532
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    iget-boolean v6, v8, Ll/ۡܽۚ;->ᩴ:Z

    if-nez v15, :cond_9

    const/4 v8, 0x0

    goto :goto_6

    .line 1533
    :cond_9
    iget-object v0, v15, Ll/ᩴ᩹ۚ;->᩸:Ljava/lang/String;

    move-object v8, v0

    :goto_6
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v9

    move-object v7, v11

    move-object v9, v14

    move-object/from16 v10, p1

    move-object v11, v12

    move-object v12, v13

    move/from16 v13, v17

    move/from16 v14, v18

    move-object/from16 v15, p9

    invoke-direct/range {v0 .. v15}, Ll/ۗܶۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽܶۚ;Ljava/util/ArrayList;ZILl/ᩴ᩹ۚ;)V

    return-object v16
.end method

.method public static bridge synthetic ۙ(Ll/֨ܽۚ;Ll/ۚ۫ۤ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Ll/ۗܶۚ;
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    .line 0
    invoke-static/range {v0 .. v9}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/ۚ۫ۤ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/HashMap;Ll/ᩴ᩹ۚ;)Ll/ۗܶۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖܶۚ;)Ll/۟ܶۚ;
    .locals 1

    .line 100
    new-instance v0, Ll/۟ܶۚ;

    invoke-direct {v0, p0}, Ll/۟ܶۚ;-><init>(Ll/ۖܶۚ;)V

    .line 432
    invoke-direct {v0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    return-object v0
.end method

.method public static ۙ(Ll/ۖܶۚ;Ljava/util/ArrayList;)Ll/۟ܶۚ;
    .locals 1

    .line 111
    new-instance v0, Ll/۟ܶۚ;

    invoke-direct {v0, p0, p1}, Ll/۟ܶۚ;-><init>(Ll/ۖܶۚ;Ljava/util/ArrayList;)V

    .line 432
    invoke-direct {v0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    return-object v0
.end method

.method public static bridge synthetic ۙ(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)Ll/۠ܳۤ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/۟ܶۚ;->᩷(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)Ll/۠ܳۤ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ۖᩴۤ;Ll/ۚ۫ۤ;)Ll/ۡܽۚ;
    .locals 1

    const/16 v0, 0x12c

    .line 0
    invoke-static {p0, p1, v0}, Ll/۟ܶۚ;->ۙ(Ll/ۖᩴۤ;Ll/ۚ۫ۤ;I)Ll/ۡܽۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖᩴۤ;Ll/ۚ۫ۤ;I)Ll/ۡܽۚ;
    .locals 9

    .line 1592
    :try_start_0
    invoke-interface {p1}, Ll/ۚ۫ۤ;->ܽ()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ll/ۚ۫ۤ;->ᩴ᩷()Ll/ܶ۫ۤ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1593
    invoke-interface {p1}, Ll/ۚ۫ۤ;->ᩴ᩷()Ll/ܶ۫ۤ;

    move-result-object p0

    .line 1594
    invoke-interface {p0}, Ll/ܶ۫ۤ;->getValue()Ljava/lang/String;

    move-result-object p1

    .line 1595
    invoke-interface {p0}, Ll/ܶ۫ۤ;->۠ۙ()Z

    move-result p0

    move v8, p0

    goto :goto_0

    .line 1597
    :cond_0
    invoke-static {p0, p1}, Ll/۬ᩴۤ;->ۙ(Ll/ۖᩴۤ;Ll/ۚ۫ۤ;)Ljava/lang/CharSequence;

    move-result-object p1

    .line 1598
    instance-of p0, p1, Ll/ܶ۫ۤ;

    if-eqz p0, :cond_1

    check-cast p1, Ll/ܶ۫ۤ;

    .line 1599
    invoke-interface {p1}, Ll/ܶ۫ۤ;->getValue()Ljava/lang/String;

    move-result-object p0

    .line 1600
    invoke-interface {p1}, Ll/ܶ۫ۤ;->۠ۙ()Z

    move-result p1

    move v8, p1

    move-object p1, p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    const/4 v8, 0x0

    .line 1603
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/֨۫ۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-gtz p2, :cond_2

    .line 1605
    new-instance p0, Ll/ۡܽۚ;

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    move-object v4, v6

    invoke-direct/range {v3 .. v8}, Ll/ۡܽۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object p0

    .line 212
    :cond_2
    invoke-static {v2, p2, v6}, Ll/֨۫ۚ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 1608
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {v4, v2, p0}, Ljava/lang/String;->codePointCount(II)I

    move-result p0

    .line 1609
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v6, v2, p1}, Ljava/lang/String;->codePointCount(II)I

    move-result p1

    if-ge p0, p1, :cond_3

    const/4 p0, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    const/4 v7, 0x0

    .line 1610
    :goto_1
    new-instance p0, Ll/ۡܽۚ;

    const/4 v5, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Ll/ۡܽۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 1612
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p0, "Failed to format resource value"

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    :goto_2
    move-object v2, p0

    .line 1613
    new-instance p0, Ll/ۡܽۚ;

    const/4 v5, 0x0

    const/4 v3, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ll/ۡܽۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object p0
.end method

.method public static ۙ(Ll/ۜܳۤ;II)Ll/ܳ۫ۤ;
    .locals 3

    .line 716
    invoke-interface {p0}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤ۫ۤ;

    .line 717
    invoke-interface {v0}, Ll/ۤ۫ۤ;->۫()I

    move-result v1

    if-eq v1, p1, :cond_1

    goto :goto_0

    .line 718
    :cond_1
    invoke-interface {v0}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ۫ۤ;

    .line 719
    invoke-interface {v1}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v2

    if-ne v2, p2, :cond_2

    return-object v1

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/֨ܽۚ;ILl/ܳܶۚ;)V
    .locals 3

    .line 458
    iget-object v0, p0, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    invoke-virtual {v0}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v0

    ushr-int/lit8 v1, p1, 0x18

    ushr-int/lit8 v2, p1, 0x10

    and-int/lit16 v2, v2, 0xff

    .line 459
    invoke-static {v0, v1, v2}, Ll/۟ܶۚ;->ۙ(Ll/ۜܳۤ;II)Ll/ܳ۫ۤ;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const v1, 0xffff

    and-int/2addr p1, v1

    .line 464
    invoke-interface {v0}, Ll/ܳ۫ۤ;->ۤ᩷()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܳۤ;

    .line 465
    invoke-interface {v1, p1}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 468
    :cond_2
    invoke-interface {v1, p1}, Ll/ۖܳۤ;->᩷(I)Ll/۠ܳۤ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 470
    invoke-static {p0, v1, v2}, Ll/۟ܶۚ;->᩷(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)Ll/۠ܳۤ;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Ll/ܳܶۚ;->ۙ(Ll/ۖܳۤ;Ll/۠ܳۤ;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/֨ܽۚ;Ll/۫ܶۚ;Ll/ۚܶۚ;Ll/ᩴܶۚ;)V
    .locals 3

    .line 619
    iget-object v0, p0, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    invoke-virtual {v0}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v0

    .line 620
    iget v1, p1, Ll/۫ܶۚ;->ۤ:I

    iget v2, p1, Ll/۫ܶۚ;->ۙ:I

    iget p1, p1, Ll/۫ܶۚ;->۫:I

    invoke-static {v0, v1, p1}, Ll/۟ܶۚ;->ۙ(Ll/ۜܳۤ;II)Ll/ܳ۫ۤ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    if-nez p3, :cond_1

    .line 625
    invoke-interface {p1}, Ll/ܳ۫ۤ;->ۤ᩷()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Ll/۟ܶۚ;->ۙ(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p1}, Ll/ᩴܶۚ;->ۙ(Ll/ܳ۫ۤ;)Ljava/util/ArrayList;

    move-result-object p1

    .line 626
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۖܳۤ;

    .line 627
    invoke-interface {p3, v2}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 630
    :cond_3
    invoke-interface {p3, v2}, Ll/ۖܳۤ;->᩷(I)Ll/۠ܳۤ;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 634
    :cond_4
    invoke-static {p0, p3, v0}, Ll/۟ܶۚ;->᩷(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)Ll/۠ܳۤ;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ll/ۚܶۚ;->ۙ(Ll/ۖܳۤ;Ll/۠ܳۤ;)Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_5
    :goto_2
    return-void
.end method

.method public static ۙ(Ll/ۜܳۤ;Ljava/lang/String;)V
    .locals 3

    const-string v0, "*"

    .line 182
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "default"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Ll/ܿۤۤ;->֡:Ll/ܿۤۤ;

    .line 198
    :try_start_0
    invoke-static {p1, v0}, Ll/᩵ۤۤ;->ۙ(Ljava/lang/String;Ll/ܿۤۤ;)Ll/᩵ۤۤ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ۤۤ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 183
    :cond_0
    invoke-interface {p0}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤ۫ۤ;

    .line 184
    invoke-interface {v0}, Ll/ۤ۫ۤ;->ۙ᩷()Ll/ܿۤۤ;

    move-result-object v1

    sget-object v2, Ll/ܿۤۤ;->֡:Ll/ܿۤۤ;

    if-eq v1, v2, :cond_2

    invoke-interface {v0}, Ll/ۤ۫ۤ;->ۙ᩷()Ll/ܿۤۤ;

    move-result-object v1

    .line 198
    :try_start_1
    invoke-static {p1, v1}, Ll/᩵ۤۤ;->ۙ(Ljava/lang/String;Ll/ܿۤۤ;)Ll/᩵ۤۤ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩵ۤۤ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_2

    .line 186
    :cond_2
    invoke-interface {v0}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ۫ۤ;

    .line 187
    invoke-interface {v1}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖܳۤ;

    .line 188
    invoke-static {v2}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    .line 35
    :cond_5
    invoke-static {p1}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "-zh-rCN"

    const-string v2, "variant"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Invalid variant. Use default for a configuration with no qualifiers, or exact qualifiers with a leading hyphen, such as -zh-rCN. Copy a variant returned by resource_table_variants when unsure. Use * only to list all configurations."

    .line 33
    invoke-static {v1, v2, p0, p1, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    .line 192
    throw p0

    :cond_6
    :goto_2
    return-void
.end method

.method public static ۙ(Ll/֨ܽۚ;Ll/ܳ۫ۤ;Ll/֫ܶۚ;)Z
    .locals 5

    .line 500
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 501
    invoke-interface {p1}, Ll/ܳ۫ۤ;->ۤ᩷()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖܳۤ;

    .line 502
    invoke-interface {v1}, Ll/ۖܳۤ;->᩸()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ܳۤ;

    .line 503
    invoke-interface {v3}, Ll/۠ܳۤ;->ۨ᩷()I

    move-result v4

    .line 504
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    .line 507
    :cond_2
    invoke-static {p0, v1, v3}, Ll/۟ܶۚ;->᩷(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)Ll/۠ܳۤ;

    move-result-object v3

    invoke-static {v3}, Ll/۟ܶۚ;->ᩴ(Ll/۠ܳۤ;)Ll/۫ܶۚ;

    move-result-object v3

    invoke-interface {p2, v3}, Ll/֫ܶۚ;->ۙ(Ll/۫ܶۚ;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/۟ܶۚ;Ll/᩹ܶۚ;ILl/ۤۛۚ;ZLl/֨ܽۚ;Ll/᩵᩹ۚ;Ljava/lang/String;Ljava/util/HashSet;Ll/ᩴܶۚ;ILjava/util/ArrayList;ILl/۫ܶۚ;)Z
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v7, p6

    move-object/from16 v4, p7

    move-object/from16 v8, p13

    iget-object v1, v8, Ll/۫ܶۚ;->ܳ:Ljava/lang/String;

    iget v2, v8, Ll/۫ܶۚ;->ᩴ:I

    iget-object v3, v8, Ll/۫ܶۚ;->᩷:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    iget v5, v0, Ll/᩹ܶۚ;->ۙ:I

    add-int/lit8 v12, v5, 0x1

    iput v12, v0, Ll/᩹ܶۚ;->ۙ:I

    const/4 v13, 0x0

    move/from16 v6, p2

    if-ge v5, v6, :cond_0

    goto/16 :goto_9

    :cond_0
    move-object/from16 v5, p3

    .line 756
    iget-object v6, v5, Ll/ۤۛۚ;->ܺ:Ljava/lang/String;

    const-string v9, "/"

    const/4 v10, 0x1

    if-eqz v6, :cond_7

    .line 2345
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_2

    :cond_1
    const/16 v18, 0x0

    const/16 v19, 0x2

    const/4 v15, 0x1

    const/16 v16, 0x0

    const-string v17, "0x"

    move-object v14, v6

    .line 2348
    invoke-virtual/range {v14 .. v19}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 858
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v14, 0xa

    if-le v11, v14, :cond_2

    goto/16 :goto_9

    :cond_2
    const/4 v11, 0x0

    .line 861
    :goto_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v11, v14, :cond_7

    if-nez v11, :cond_3

    const/16 v14, 0x30

    goto :goto_1

    :cond_3
    if-ne v11, v10, :cond_4

    const/16 v14, 0x78

    goto :goto_1

    :cond_4
    add-int/lit8 v14, v11, -0x2

    mul-int/lit8 v14, v14, 0x4

    rsub-int/lit8 v14, v14, 0x1c

    ushr-int v14, v2, v14

    and-int/lit8 v14, v14, 0xf

    .line 868
    sget-object v15, Ll/۟ܶۚ;->ܳ:[C

    aget-char v14, v15, v14

    .line 870
    :goto_1
    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-eq v15, v14, :cond_5

    .line 871
    invoke-static {v14}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v14

    if-eq v15, v14, :cond_5

    goto/16 :goto_9

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 2351
    :cond_6
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_7

    .line 2352
    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    :cond_7
    :goto_2
    if-eqz p4, :cond_8

    .line 599
    new-instance v9, Ll/ۨܶۚ;

    move-object v1, v9

    move-object/from16 v2, p5

    move-object/from16 v3, p3

    move-object/from16 v4, p7

    move-object/from16 v5, p13

    move-object/from16 v6, p8

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v7}, Ll/ۨܶۚ;-><init>(Ll/֨ܽۚ;Ll/ۤۛۚ;Ljava/lang/String;Ll/۫ܶۚ;Ljava/util/HashSet;Ll/᩵᩹ۚ;)V

    .line 601
    new-instance v1, Ll/ܿܽۚ;

    invoke-direct {v1, v9}, Ll/ܿܽۚ;-><init>(Ll/ۨܶۚ;)V

    move-object/from16 v3, p9

    invoke-static {v2, v8, v1, v3}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/۫ܶۚ;Ll/ۚܶۚ;Ll/ᩴܶۚ;)V

    .line 602
    iget-object v1, v9, Ll/ۨܶۚ;->ᩴ:Ll/᩸᩺ۚ;

    :goto_3
    const/4 v2, 0x1

    goto/16 :goto_8

    :cond_8
    const-string v5, "resource_table_id"

    .line 573
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v10, 0x0

    if-eqz v6, :cond_b

    move/from16 v6, p10

    if-eq v2, v6, :cond_9

    move-object v5, v10

    goto :goto_4

    .line 788
    :cond_9
    invoke-static {v2}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    .line 734
    new-instance v2, Ll/ۗ᩹ۚ;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v2, v5, v13, v3, v1}, Ll/ۗ᩹ۚ;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;)V

    move-object v5, v2

    :goto_4
    if-eqz v5, :cond_a

    .line 780
    new-instance v14, Ll/᩸᩺ۚ;

    const/4 v11, 0x0

    const/4 v15, 0x0

    const-string v2, "resource"

    const-string v6, "id"

    const/4 v7, 0x0

    const/16 v16, 0x1

    const/4 v9, 0x0

    move-object v1, v14

    move-object/from16 v3, p7

    move-object v4, v6

    move-object v6, v7

    move-object/from16 v7, p13

    move-object v8, v10

    move-object v10, v11

    move-object v11, v15

    invoke-direct/range {v1 .. v11}, Ll/᩸᩺ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩹ۚ;Ljava/lang/String;Ll/۫ܶۚ;Ll/᩵ܶۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    const/4 v1, 0x1

    goto :goto_7

    :cond_b
    const/4 v14, 0x1

    const-string v2, "resource_table_name"

    .line 578
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 744
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "resource_table_type_name"

    invoke-virtual {v7, v1, v5}, Ll/᩵᩹ۚ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/ۗ᩹ۚ;

    move-result-object v1

    if-eqz v1, :cond_c

    :goto_5
    move-object v5, v1

    goto :goto_6

    .line 749
    :cond_c
    invoke-virtual {v7, v3, v2}, Ll/᩵᩹ۚ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/String;)Ll/ۗ᩹ۚ;

    move-result-object v1

    goto :goto_5

    :goto_6
    if-eqz v5, :cond_d

    .line 780
    new-instance v15, Ll/᩸᩺ۚ;

    const/4 v11, 0x0

    const/16 v16, 0x0

    const-string v2, "resource"

    const-string v6, "name"

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v1, v15

    move-object/from16 v3, p7

    move-object v4, v6

    move-object v6, v7

    move-object/from16 v7, p13

    move-object v8, v10

    move-object v10, v11

    move-object/from16 v11, v16

    invoke-direct/range {v1 .. v11}, Ll/᩸᩺ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩹ۚ;Ljava/lang/String;Ll/۫ܶۚ;Ll/᩵ܶۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_d
    :goto_7
    const/4 v2, 0x1

    move-object v1, v10

    :goto_8
    if-eqz v1, :cond_e

    move-object/from16 v3, p11

    .line 327
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    invoke-virtual/range {p11 .. p11}, Ljava/util/ArrayList;->size()I

    move-result v1

    move/from16 v3, p12

    if-lt v1, v3, :cond_e

    .line 329
    iput-boolean v2, v0, Ll/᩹ܶۚ;->᩷:Z

    .line 330
    iput v12, v0, Ll/᩹ܶۚ;->ۤ:I

    return v2

    :cond_e
    :goto_9
    return v13
.end method

.method public static bridge synthetic ۙ(Ll/۠ܳۤ;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۟ܶۚ;->᩸(Ll/۠ܳۤ;)Z

    move-result p0

    return p0
.end method

.method public static ۤ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 808
    invoke-static {p0, p1}, Ll/۟ܶۚ;->᩸(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    .line 788
    invoke-static {p0}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۤ(Ll/۠ܳۤ;)Ljava/lang/String;
    .locals 1

    .line 1461
    invoke-interface {p0}, Ll/۠ܳۤ;->ۤۙ()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Ll/۟ܶۚ;->᩸(Ll/۠ܳۤ;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "item_list"

    return-object p0

    :cond_0
    const-string p0, "single_value"

    return-object p0
.end method

.method private ᩴ()Ll/֨ܽۚ;
    .locals 5

    .line 405
    iget-object v0, p0, Ll/۟ܶۚ;->ۤ:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    .line 406
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨ܽۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 411
    :cond_0
    iget-object v0, p0, Ll/۟ܶۚ;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 412
    :try_start_0
    iget-object v1, p0, Ll/۟ܶۚ;->ۤ:Ljava/lang/ref/SoftReference;

    if-eqz v1, :cond_1

    .line 413
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ܽۚ;

    if-eqz v1, :cond_1

    .line 415
    monitor-exit v0

    return-object v1

    .line 418
    :cond_1
    iget-object v1, p0, Ll/۟ܶۚ;->ᩴ:Ll/ۖܶۚ;

    invoke-virtual {v1}, Ll/ۖܶۚ;->᩷()Ll/᩺۫ۤ;

    move-result-object v1

    .line 419
    iget-object v2, p0, Ll/۟ܶۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v1

    goto :goto_0

    .line 420
    :cond_2
    new-instance v2, Ll/ۙ᩹ۚ;

    iget-object v3, p0, Ll/۟ܶۚ;->᩸:Ljava/util/ArrayList;

    invoke-direct {v2, v1, v3}, Ll/ۙ᩹ۚ;-><init>(Ll/ۜܳۤ;Ljava/util/ArrayList;)V

    .line 421
    :goto_0
    new-instance v3, Ll/ۖᩴۤ;

    invoke-direct {v3, v2}, Ll/ۖᩴۤ;-><init>(Ll/ۜܳۤ;)V

    .line 422
    new-instance v4, Ll/֨ܽۚ;

    invoke-direct {p0, v2}, Ll/۟ܶۚ;->ۙ(Ll/ᩴ᩸ۤ;)Ljava/util/HashMap;

    move-result-object v2

    invoke-direct {v4, v3, v2, v1}, Ll/֨ܽۚ;-><init>(Ll/ۖᩴۤ;Ljava/util/HashMap;Ll/᩺۫ۤ;)V

    .line 423
    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, v4}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Ll/۟ܶۚ;->ۤ:Ljava/lang/ref/SoftReference;

    .line 424
    monitor-exit v0

    return-object v4

    :catchall_0
    move-exception v1

    .line 425
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ᩴ(Ll/۠ܳۤ;)Ll/۫ܶۚ;
    .locals 8

    .line 559
    invoke-interface {p0}, Ll/۠ܳۤ;->᩷ۙ()I

    move-result v2

    .line 560
    invoke-interface {p0}, Ll/۠ܳۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object v0

    .line 561
    invoke-interface {p0}, Ll/۠ܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v1

    .line 562
    new-instance v7, Ll/۫ܶۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ll/ۤ۫ۤ;->۫()I

    move-result v3

    .line 563
    invoke-interface {v1}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v5

    invoke-interface {p0}, Ll/۠ܳۤ;->۬ۙ()Ljava/lang/String;

    move-result-object v6

    invoke-interface {p0}, Ll/۠ܳۤ;->ۨ᩷()I

    move-result p0

    move-object v0, v7

    move-object v1, v4

    move v4, v5

    move v5, p0

    invoke-direct/range {v0 .. v6}, Ll/۫ܶۚ;-><init>(Ljava/lang/String;IIIILjava/lang/String;)V

    return-object v7
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 703
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "default"

    .line 705
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, -0x1

    return p0

    .line 707
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    .line 710
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic ᩷(Ll/ۖܳۤ;Ll/ۖܳۤ;)I
    .locals 0

    .line 665
    invoke-static {p0}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ll/۟ܶۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ᩷(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 681
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 788
    invoke-static {p0}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object p0

    .line 681
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0xa

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ll/ۜܳۤ;ILjava/lang/String;)Ll/ۖܳۤ;
    .locals 2

    ushr-int/lit8 v0, p1, 0x18

    ushr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 686
    invoke-static {p0, v0, v1}, Ll/۟ܶۚ;->ۙ(Ll/ۜܳۤ;II)Ll/ܳ۫ۤ;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0xffff

    and-int/2addr p1, v0

    .line 691
    invoke-interface {p0}, Ll/ܳ۫ۤ;->ۤ᩷()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖܳۤ;

    .line 692
    invoke-static {v0}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0, p1}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩷(Ll/ۖᩴۤ;Ll/ۖܳۤ;I)Ll/ۖܽۚ;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne p2, v2, :cond_0

    .line 1637
    new-instance p0, Ll/ۖܽۚ;

    invoke-direct {p0, v1, v0}, Ll/ۖܽۚ;-><init>(Ljava/lang/String;I)V

    return-object p0

    :cond_0
    const-string v3, "style"

    if-ne p2, v2, :cond_1

    goto :goto_0

    .line 1658
    :cond_1
    invoke-interface {p1}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۢܶۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, p2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 1666
    :goto_1
    invoke-interface {p1}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v4

    invoke-interface {v4}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۢܶۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "plurals"

    .line 1667
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const v3, 0x1000004

    sub-int v3, p2, v3

    if-ltz v3, :cond_4

    const/4 v4, 0x6

    if-ge v3, v4, :cond_4

    .line 1670
    sget-object p0, Ll/ۚ۫ۤ;->ܳ:[Ljava/lang/String;

    aget-object v1, p0, v3

    goto :goto_4

    .line 1672
    :cond_3
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1673
    invoke-virtual {p0}, Ll/ۖᩴۤ;->᩷()Ll/ۜۤۤ;

    move-result-object v3

    invoke-virtual {v3, p2}, Ll/ۜۤۤ;->᩷(I)Ll/ۖۤۤ;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 1675
    iget v0, v3, Ll/ۖۤۤ;->ۙ:I

    ushr-int/lit8 v0, v0, 0x18

    and-int/lit16 v0, v0, 0xff

    .line 1676
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ll/ۖܳۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۤ۫ۤ;->۫()I

    move-result p1

    invoke-virtual {p0, p1, v0}, Ll/ۖᩴۤ;->ۙ(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, v3, Ll/ۖۤۤ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 1680
    :cond_4
    invoke-interface {p1}, Ll/ۖܳۤ;->ۤ()Ll/ۤ۫ۤ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۤ۫ۤ;->۫()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Ll/ۖᩴۤ;->᩷(II)Ljava/lang/String;

    move-result-object p0

    .line 1688
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v3, 0x8

    if-eq p1, v3, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    if-ge v0, v3, :cond_7

    mul-int/lit8 p1, v0, 0x4

    rsub-int/lit8 p1, p1, 0x1c

    ushr-int p1, p2, p1

    and-int/lit8 p1, p1, 0xf

    .line 1692
    sget-object v4, Ll/۟ܶۚ;->ܳ:[C

    aget-char p1, v4, p1

    .line 1693
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, p1, :cond_6

    :goto_3
    move-object v1, p0

    goto :goto_4

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1641
    :cond_7
    :goto_4
    new-instance p0, Ll/ۖܽۚ;

    if-nez v1, :cond_8

    .line 788
    invoke-static {p2}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    .line 1641
    :cond_8
    invoke-direct {p0, v1, v2}, Ll/ۖܽۚ;-><init>(Ljava/lang/String;I)V

    return-object p0
.end method

.method public static ᩷(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)Ll/۠ܳۤ;
    .locals 1

    .line 673
    iget-object v0, p0, Ll/֨ܽۚ;->ۤ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 676
    :cond_0
    iget-object p0, p0, Ll/֨ܽۚ;->ۤ:Ljava/util/HashMap;

    invoke-interface {p2}, Ll/۠ܳۤ;->᩷ۙ()I

    move-result v0

    invoke-static {p1}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/۟ܶۚ;->᩷(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ܳۤ;

    if-nez p0, :cond_1

    :goto_0
    return-object p2

    :cond_1
    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/۠ܳۤ;)Ll/۫ܶۚ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۟ܶۚ;->ᩴ(Ll/۠ܳۤ;)Ll/۫ܶۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩸(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 815
    invoke-static {p0}, Ll/۟ܶۚ;->ۙ(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    const-string v0, "Invalid "

    .line 0
    invoke-static {v0, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 883
    :cond_0
    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    :goto_0
    const-string v1, "0x00000000..0xffffffff"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 884
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "0x7f010000"

    invoke-virtual {v2, p1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 882
    invoke-static {v0, p1, p0, v1, v2}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    .line 817
    throw p0

    :cond_1
    long-to-int p0, v0

    return p0
.end method

.method public static ᩸(Ll/۠ܳۤ;)Z
    .locals 3

    .line 1453
    invoke-interface {p0}, Ll/۠ܳۤ;->ۤۙ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 1454
    invoke-interface {p0, v1}, Ll/۠ܳۤ;->getValue(I)Ll/ۚ۫ۤ;

    move-result-object p0

    invoke-interface {p0}, Ll/ۚ۫ۤ;->᩻ۙ()I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    return v2

    :cond_0
    return v1
.end method


# virtual methods
.method public final ۙ(Ll/ᩳۨۚ;)Ll/ۘۛۚ;
    .locals 18

    move-object/from16 v0, p1

    .line 155
    invoke-direct/range {p0 .. p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    invoke-virtual {v1}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v1

    .line 156
    iget-object v2, v0, Ll/ᩳۨۚ;->֫:Ljava/lang/String;

    iget-object v3, v0, Ll/ᩳۨۚ;->ۚ:Ljava/lang/String;

    iget v4, v0, Ll/ᩳۨۚ;->ܳ:I

    invoke-static {v1, v2}, Ll/۟ܶۚ;->ۙ(Ll/ۜܳۤ;Ljava/lang/String;)V

    .line 157
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 158
    invoke-interface {v1}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۤ۫ۤ;

    .line 159
    invoke-interface {v6}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳ۫ۤ;

    const-string v8, "*"

    .line 160
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-interface {v7}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_0

    .line 161
    :cond_2
    invoke-interface {v7}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۖܳۤ;

    .line 162
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    invoke-static {v9}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    :cond_4
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 166
    :cond_5
    new-instance v1, Ll/۟ܽۚ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v5, v1}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 171
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v1, v1

    int-to-long v6, v4

    iget v3, v0, Ll/ᩳۨۚ;->ۤ:I

    int-to-long v8, v3

    add-long/2addr v6, v8

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    sub-int v1, v2, v4

    const/4 v3, 0x0

    .line 172
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 173
    new-instance v1, Ll/ۘۛۚ;

    iget-object v7, v0, Ll/ᩳۨۚ;->᩻:Ljava/lang/String;

    iget-object v8, v0, Ll/ᩳۨۚ;->ۧ:Ljava/lang/String;

    .line 174
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v10

    iget v11, v0, Ll/ᩳۨۚ;->ۤ:I

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_6

    const/4 v0, 0x1

    const/4 v12, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    const/4 v12, 0x0

    :goto_2
    add-int v13, v4, v9

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v17}, Ll/ۘۛۚ;-><init>(Ljava/lang/String;Ljava/lang/String;IIIZILjava/lang/String;Ljava/lang/String;Ll/᩸֫ۚ;I)V

    :goto_3
    if-ge v4, v2, :cond_7

    .line 176
    new-instance v0, Ll/ܿܶۚ;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖܳۤ;

    invoke-direct {v0, v3}, Ll/ܿܶۚ;-><init>(Ll/ۖܳۤ;)V

    iget-object v3, v1, Ll/ۘۛۚ;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    return-object v1
.end method

.method public final ۙ(Ljava/util/ArrayList;)Ll/ۤܶۚ;
    .locals 4

    .line 395
    invoke-direct {p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v0

    .line 396
    new-instance v1, Ll/ۙ᩹ۚ;

    iget-object v2, v0, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    invoke-virtual {v2}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ll/ۙ᩹ۚ;-><init>(Ll/ۜܳۤ;Ljava/util/ArrayList;)V

    .line 397
    new-instance p1, Ll/ۤܶۚ;

    new-instance v2, Ll/֨ܽۚ;

    new-instance v3, Ll/ۖᩴۤ;

    invoke-direct {v3, v1}, Ll/ۖᩴۤ;-><init>(Ll/ۜܳۤ;)V

    iget-object v1, v0, Ll/֨ܽۚ;->ۤ:Ljava/util/HashMap;

    iget-object v0, v0, Ll/֨ܽۚ;->ۙ:Ll/᩺۫ۤ;

    invoke-direct {v2, v3, v1, v0}, Ll/֨ܽۚ;-><init>(Ll/ۖᩴۤ;Ljava/util/HashMap;Ll/᩺۫ۤ;)V

    invoke-direct {p1, v2}, Ll/ۤܶۚ;-><init>(Ll/֨ܽۚ;)V

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;IILjava/util/HashSet;)Ll/ۧܶۚ;
    .locals 9

    .line 119
    invoke-direct {p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v0

    .line 120
    iget-object v1, v0, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    invoke-virtual {v1}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v2

    invoke-static {v2, p2}, Ll/۟ܶۚ;->ۙ(Ll/ۜܳۤ;Ljava/lang/String;)V

    .line 121
    new-instance v2, Ll/᩻ܶۚ;

    invoke-direct {v2, p3, p4}, Ll/᩻ܶۚ;-><init>(II)V

    .line 122
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 123
    invoke-virtual {v1}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object p4

    invoke-interface {p4}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object p4

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ۫ۤ;

    .line 124
    invoke-interface {v1}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ۫ۤ;

    .line 125
    invoke-interface {v1}, Ll/ۤ۫ۤ;->۫()I

    move-result v5

    shl-int/lit8 v5, v5, 0x8

    invoke-interface {v4}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v6

    or-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "*"

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-interface {v4}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    .line 126
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 127
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 128
    invoke-interface {v4}, Ll/ܳ۫ۤ;->ۧ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖܳۤ;

    .line 129
    invoke-static {v7}, Ll/ۢܶۚ;->ۙ(Ll/ۖܳۤ;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 131
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_0

    .line 133
    :cond_5
    new-instance v5, Ll/֡ܽۚ;

    invoke-direct {v5, p2, v6, v2}, Ll/֡ܽۚ;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ll/᩻ܶۚ;)V

    invoke-static {v0, v4, v5}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/ܳ۫ۤ;Ll/֫ܶۚ;)Z

    goto :goto_0

    .line 1271
    :cond_6
    iget-object p1, v2, Ll/᩻ܶۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    iget p4, v2, Ll/᩻ܶۚ;->ۤ:I

    add-int/2addr p3, p4

    .line 1272
    new-instance p4, Ll/ۧܶۚ;

    iget v1, v2, Ll/᩻ܶۚ;->᩸:I

    const/4 v2, 0x1

    if-ge p3, v1, :cond_7

    const/4 v3, 0x1

    goto :goto_2

    :cond_7
    const/4 v3, 0x0

    :goto_2
    invoke-direct {p4, v1, p3, p1, v3}, Ll/ۧܶۚ;-><init>(IILjava/util/ArrayList;Z)V

    .line 146
    new-instance p3, Ll/ᩴܶۚ;

    invoke-direct {p3}, Ll/ᩴܶۚ;-><init>()V

    .line 147
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ܶۚ;

    .line 646
    new-instance v3, Ll/᩶ܶۚ;

    invoke-direct {v3}, Ll/᩶ܶۚ;-><init>()V

    .line 647
    new-instance v4, Ll/ۢܽۚ;

    invoke-direct {v4, v3, v0, p5, p2}, Ll/ۢܽۚ;-><init>(Ll/᩶ܶۚ;Ll/֨ܽۚ;Ljava/util/HashSet;Ljava/lang/String;)V

    invoke-static {v0, v1, v4, p3}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/۫ܶۚ;Ll/ۚܶۚ;Ll/ᩴܶۚ;)V

    .line 652
    invoke-virtual {v3}, Ll/᩶ܶۚ;->ۙ()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    iput v4, v1, Ll/۫ܶۚ;->֫:I

    .line 1987
    iget-object v4, v3, Ll/᩶ܶۚ;->᩷:Ljava/util/LinkedHashSet;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v5

    if-le v5, v2, :cond_8

    const-string v4, "mixed"

    goto :goto_4

    :cond_8
    const-string v5, "item_list"

    .line 1990
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object v4, v5

    goto :goto_4

    :cond_9
    const-string v4, "single_value"

    .line 653
    :goto_4
    iput-object v4, v1, Ll/۫ܶۚ;->ۚ:Ljava/lang/String;

    .line 1999
    iget-object v3, v3, Ll/᩶ܶۚ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_a
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗܶۚ;

    const-string v6, "default"

    .line 2000
    iget-object v7, v5, Ll/ۗܶۚ;->ۛ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object v4, v5

    goto :goto_6

    :cond_b
    if-eqz v4, :cond_c

    .line 2003
    iget-object v6, v5, Ll/ۗܶۚ;->ۛ:Ljava/lang/String;

    iget-object v7, v4, Ll/ۗܶۚ;->ۛ:Ljava/lang/String;

    invoke-static {v6, v7}, Ll/۟ܶۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    if-gez v6, :cond_a

    :cond_c
    move-object v4, v5

    goto :goto_5

    .line 654
    :cond_d
    :goto_6
    iput-object v4, v1, Ll/۫ܶۚ;->᩸:Ll/ۗܶۚ;

    goto :goto_3

    :cond_e
    return-object p4
.end method

.method public final ۙ(Ljava/lang/String;IIILjava/util/HashSet;)Ll/ܰܶۚ;
    .locals 32

    move-object/from16 v8, p1

    move/from16 v9, p2

    .line 345
    invoke-direct/range {p0 .. p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v10

    const-string v0, "locator"

    .line 346
    invoke-static {v8, v0}, Ll/۟ܶۚ;->᩸(Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    .line 347
    new-instance v12, Ll/ᩴܶۚ;

    invoke-direct {v12}, Ll/ᩴܶۚ;-><init>()V

    .line 1304
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1317
    iget-object v14, v10, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    .line 519
    invoke-virtual {v14}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v0

    .line 520
    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 521
    invoke-interface {v0}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤ۫ۤ;

    .line 522
    invoke-interface {v2}, Ll/ۤ۫ۤ;->۫()I

    move-result v17

    .line 523
    invoke-interface {v2}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ll/ܳ۫ۤ;

    .line 524
    invoke-interface {v7}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v2

    shl-int/lit8 v3, v17, 0x8

    or-int/2addr v2, v3

    .line 525
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 540
    :cond_0
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 541
    invoke-interface {v7}, Ll/ܳ۫ۤ;->ۤ᩷()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ll/ۖܳۤ;

    .line 542
    invoke-interface {v5}, Ll/ۖܳۤ;->᩸()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    move v4, v1

    :goto_3
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܳۤ;

    .line 543
    invoke-interface {v1}, Ll/۠ܳۤ;->ۨ᩷()I

    move-result v2

    .line 544
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v21, v4, 0x1

    if-ge v4, v9, :cond_3

    :cond_2
    move-object/from16 v30, v5

    move-object/from16 v31, v6

    move-object/from16 v26, v7

    goto/16 :goto_11

    :cond_3
    if-ne v4, v9, :cond_4

    move/from16 v2, p3

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    .line 1337
    :goto_4
    new-instance v3, Ll/ۛܶۚ;

    .line 1338
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    move/from16 v2, p4

    invoke-direct {v3, v13, v0, v2}, Ll/ۛܶۚ;-><init>(Ljava/util/ArrayList;II)V

    .line 1339
    new-instance v0, Ll/ۘܶۚ;

    invoke-direct {v0, v10, v5, v1}, Ll/ۘܶۚ;-><init>(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)V

    .line 1340
    invoke-interface {v1}, Ll/۠ܳۤ;->ۨ᩷()I

    move-result v1

    .line 1341
    invoke-virtual {v12, v7}, Ll/ᩴܶۚ;->ۙ(Ll/ܳ۫ۤ;)Ljava/util/ArrayList;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_5
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_2

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v9, v23

    check-cast v9, Ll/ۖܳۤ;

    .line 1342
    invoke-interface {v9, v1}, Ll/ۖܳۤ;->ܺ(I)Z

    move-result v23

    if-nez v23, :cond_5

    goto :goto_6

    .line 1345
    :cond_5
    invoke-interface {v9, v1}, Ll/ۖܳۤ;->᩷(I)Ll/۠ܳۤ;

    move-result-object v2

    if-nez v2, :cond_6

    :goto_6
    move/from16 v9, p2

    move/from16 v2, p4

    goto :goto_5

    .line 1349
    :cond_6
    invoke-static {v10, v9, v2}, Ll/۟ܶۚ;->᩷(Ll/֨ܽۚ;Ll/ۖܳۤ;Ll/۠ܳۤ;)Ll/۠ܳۤ;

    move-result-object v2

    move/from16 v23, v1

    .line 2019
    invoke-interface {v2}, Ll/۠ܳۤ;->getParent()I

    move-result v1

    if-eqz v1, :cond_7

    if-ne v1, v11, :cond_7

    .line 2021
    invoke-virtual {v3, v0, v9, v8}, Ll/ۛܶۚ;->ۙ(Ll/ۘܶۚ;Ll/ۖܳۤ;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    move-object v0, v3

    move/from16 v29, v4

    goto/16 :goto_e

    .line 1461
    :cond_7
    invoke-interface {v2}, Ll/۠ܳۤ;->ۤۙ()I

    move-result v1

    if-lez v1, :cond_8

    invoke-static {v2}, Ll/۟ܶۚ;->᩸(Ll/۠ܳۤ;)Z

    move-result v1

    if-nez v1, :cond_8

    const/4 v1, 0x1

    const/16 v24, 0x1

    goto :goto_7

    :cond_8
    const/4 v1, 0x0

    const/16 v24, 0x0

    .line 2026
    :goto_7
    invoke-interface {v2}, Ll/۠ܳۤ;->values()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v25

    :goto_8
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v26, v1

    check-cast v26, Ll/ۚ۫ۤ;

    if-eqz v11, :cond_c

    if-eqz v24, :cond_c

    .line 2028
    invoke-interface/range {v26 .. v26}, Ll/ۚ۫ۤ;->᩻ۙ()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_9

    move-object/from16 v27, v0

    goto :goto_9

    .line 1658
    :cond_9
    invoke-interface {v9}, Ll/ۖܳۤ;->getType()Ll/ܳ۫ۤ;

    move-result-object v2

    invoke-interface {v2}, Ll/ܳ۫ۤ;->getTypeName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۢܶۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v27, v0

    const-string v0, "style"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_a

    :cond_a
    :goto_9
    const/4 v1, 0x0

    :goto_a
    if-ne v1, v11, :cond_b

    move-object v0, v3

    move-object v1, v14

    move-object/from16 v2, v27

    move-object/from16 v28, v3

    move-object v3, v9

    move/from16 v29, v4

    move-object/from16 v4, v26

    move-object/from16 v30, v5

    move-object/from16 v5, p1

    move-object/from16 v31, v6

    move-object/from16 v6, p5

    .line 2029
    invoke-virtual/range {v0 .. v6}, Ll/ۛܶۚ;->ۙ(Ll/ۖᩴۤ;Ll/ۘܶۚ;Ll/ۖܳۤ;Ll/ۚ۫ۤ;Ljava/lang/String;Ljava/util/HashSet;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_d

    :cond_b
    :goto_b
    move-object/from16 v28, v3

    move/from16 v29, v4

    move-object/from16 v30, v5

    move-object/from16 v31, v6

    goto :goto_c

    :cond_c
    move-object/from16 v27, v0

    goto :goto_b

    :cond_d
    :goto_c
    if-eqz v11, :cond_f

    .line 2033
    invoke-static/range {v26 .. v26}, Ll/۟ܶۚ;->ۙ(Ll/ۚ۫ۤ;)I

    move-result v0

    if-ne v0, v11, :cond_f

    move-object/from16 v0, v28

    move-object v1, v14

    move-object/from16 v2, v27

    move-object v3, v9

    move-object/from16 v4, v26

    move/from16 v5, v24

    move-object/from16 v6, p1

    move-object/from16 v26, v7

    move-object/from16 v7, p5

    .line 2034
    invoke-virtual/range {v0 .. v7}, Ll/ۛܶۚ;->ۙ(Ll/ۖᩴۤ;Ll/ۘܶۚ;Ll/ۖܳۤ;Ll/ۚ۫ۤ;ZLjava/lang/String;Ljava/util/HashSet;)Z

    move-result v0

    if-eqz v0, :cond_e

    :goto_d
    move-object/from16 v0, v28

    .line 1354
    :goto_e
    iget v0, v0, Ll/ۛܶۚ;->᩷:I

    const/4 v1, 0x1

    move/from16 v4, v29

    goto :goto_12

    :cond_e
    :goto_f
    move-object/from16 v0, v28

    goto :goto_10

    :cond_f
    move-object/from16 v26, v7

    goto :goto_f

    :goto_10
    move-object v3, v0

    move-object/from16 v7, v26

    move-object/from16 v0, v27

    move/from16 v4, v29

    move-object/from16 v5, v30

    move-object/from16 v6, v31

    goto/16 :goto_8

    :cond_10
    move/from16 v9, p2

    move/from16 v2, p4

    move/from16 v1, v23

    goto/16 :goto_5

    :goto_11
    const/4 v0, 0x0

    move/from16 v9, p2

    move/from16 v4, v21

    move-object/from16 v7, v26

    move-object/from16 v5, v30

    move-object/from16 v6, v31

    goto/16 :goto_3

    :cond_11
    move/from16 v29, v4

    move-object/from16 v31, v6

    move-object/from16 v26, v7

    const/4 v0, 0x0

    move/from16 v9, p2

    move/from16 v1, v29

    goto/16 :goto_2

    :cond_12
    const/4 v0, 0x0

    move/from16 v9, p2

    goto/16 :goto_1

    :cond_13
    const/4 v0, 0x0

    move/from16 v9, p2

    goto/16 :goto_0

    :cond_14
    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    move/from16 v21, v1

    const/4 v1, 0x0

    .line 1365
    :goto_12
    new-instance v2, Ll/ܰܶۚ;

    if-eqz v1, :cond_15

    goto :goto_13

    :cond_15
    move/from16 v4, v21

    :goto_13
    if-eqz v1, :cond_16

    goto :goto_14

    :cond_16
    const/4 v0, 0x0

    .line 1367
    :goto_14
    invoke-direct {v2, v4, v0, v13, v1}, Ll/ܰܶۚ;-><init>(IILjava/util/ArrayList;Z)V

    return-object v2
.end method

.method public final ۙ(Ll/ۤۛۚ;Ljava/lang/String;ILjava/util/HashSet;I)Ll/ܶܶۚ;
    .locals 18

    move-object/from16 v4, p1

    move-object/from16 v8, p2

    move/from16 v3, p3

    .line 288
    iget-object v0, v4, Ll/ۤۛۚ;->֫:Ll/ۨ᩹ۚ;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    if-gtz p5, :cond_0

    .line 290
    new-instance v0, Ll/ܶܶۚ;

    invoke-direct {v0, v14, v3, v1}, Ll/ܶܶۚ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0

    :cond_0
    const-string v1, "resource_table_id"

    .line 293
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const-string v1, "literal"

    .line 294
    iget-object v5, v0, Ll/ۨ᩹ۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 295
    new-instance v0, Ll/ܶܶۚ;

    invoke-direct {v0, v14, v3, v2}, Ll/ܶܶۚ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0

    .line 297
    :cond_1
    iget-object v1, v4, Ll/ۤۛۚ;->᩻:Ljava/lang/String;

    invoke-static {v1}, Ll/۟ܶۚ;->ۙ(Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v9, 0x0

    cmp-long v1, v5, v9

    if-gez v1, :cond_2

    .line 299
    new-instance v0, Ll/ܶܶۚ;

    invoke-direct {v0, v14, v3, v2}, Ll/ܶܶۚ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0

    :cond_2
    long-to-int v1, v5

    move v11, v1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    const/4 v11, 0x0

    .line 305
    :goto_0
    invoke-direct/range {p0 .. p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v15

    .line 306
    invoke-virtual {v0}, Ll/ۨ᩹ۚ;->ۙ()Ll/᩵᩹ۚ;

    move-result-object v7

    const-string v0, "resource_table_value"

    .line 307
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "resource_table_file_path"

    .line 308
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    const/4 v5, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x1

    const/4 v5, 0x1

    :goto_2
    if-eqz v5, :cond_6

    .line 309
    new-instance v0, Ll/ᩴܶۚ;

    invoke-direct {v0}, Ll/ᩴܶۚ;-><init>()V

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    move-object v10, v0

    .line 310
    new-instance v13, Ll/᩹ܶۚ;

    .line 1287
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 311
    new-instance v12, Ll/ܰܽۚ;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object v2, v13

    move/from16 v3, p3

    move-object/from16 v4, p1

    move-object v6, v15

    move-object/from16 v8, p2

    move-object/from16 v9, p4

    move-object/from16 v16, v12

    move-object v12, v14

    move-object/from16 v17, v14

    move-object v14, v13

    move/from16 v13, p5

    invoke-direct/range {v0 .. v13}, Ll/ܰܽۚ;-><init>(Ll/۟ܶۚ;Ll/᩹ܶۚ;ILl/ۤۛۚ;ZLl/֨ܽۚ;Ll/᩵᩹ۚ;Ljava/lang/String;Ljava/util/HashSet;Ll/ᩴܶۚ;ILjava/util/ArrayList;I)V

    .line 479
    iget-object v0, v15, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    invoke-virtual {v0}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v0

    .line 480
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 481
    invoke-interface {v0}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤ۫ۤ;

    .line 482
    invoke-interface {v2}, Ll/ۤ۫ۤ;->۫()I

    move-result v3

    .line 483
    invoke-interface {v2}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳ۫ۤ;

    .line 484
    invoke-interface {v4}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v5

    shl-int/lit8 v6, v3, 0x8

    or-int/2addr v5, v6

    .line 485
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_4

    :cond_8
    move-object/from16 v5, v16

    .line 488
    invoke-static {v15, v4, v5}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;Ll/ܳ۫ۤ;Ll/֫ܶۚ;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_5

    :cond_9
    move-object/from16 v16, v5

    goto :goto_4

    .line 336
    :cond_a
    :goto_5
    new-instance v0, Ll/ܶܶۚ;

    iget-boolean v1, v14, Ll/᩹ܶۚ;->᩷:Z

    if-eqz v1, :cond_b

    .line 337
    iget v2, v14, Ll/᩹ܶۚ;->ۤ:I

    goto :goto_6

    :cond_b
    iget v2, v14, Ll/᩹ܶۚ;->ۙ:I

    :goto_6
    move-object/from16 v3, v17

    invoke-direct {v0, v3, v2, v1}, Ll/ܶܶۚ;-><init>(Ljava/util/ArrayList;IZ)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;IIIILjava/util/HashSet;)Ll/ܺܶۚ;
    .locals 13

    .line 263
    invoke-direct {p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v10

    const-string v0, "locator"

    move-object v1, p1

    .line 264
    invoke-static {p1, v0}, Ll/۟ܶۚ;->᩸(Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    .line 265
    new-instance v12, Ll/ۙܶۚ;

    const/4 v4, 0x1

    move-object v0, v12

    move-object v1, v10

    move v2, v11

    move-object v3, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Ll/ۙܶۚ;-><init>(Ll/֨ܽۚ;ILjava/lang/String;IIIIILjava/util/HashSet;)V

    .line 267
    new-instance v0, Ll/᩶ܽۚ;

    invoke-direct {v0, v12}, Ll/᩶ܽۚ;-><init>(Ll/ۙܶۚ;)V

    invoke-static {v10, v11, v0}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;ILl/ܳܶۚ;)V

    .line 268
    iget-object v0, v12, Ll/ۙܶۚ;->ۤ:Ll/۫ܶۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 271
    :cond_0
    invoke-virtual {v12}, Ll/ۙܶۚ;->ۙ()Ljava/util/ArrayList;

    move-result-object v3

    .line 272
    iget-object v0, v12, Ll/ۙܶۚ;->ۤ:Ll/۫ܶۚ;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, v0, Ll/۫ܶۚ;->֫:I

    move-object v0, p2

    .line 273
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 274
    new-instance v9, Ll/ܺܶۚ;

    iget-object v2, v12, Ll/ۙܶۚ;->ۤ:Ll/۫ܶۚ;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v9

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Ll/ܺܶۚ;-><init>(Ll/۫ܶۚ;Ljava/util/ArrayList;Ljava/util/ArrayList;IZILjava/lang/String;)V

    return-object v9

    .line 277
    :cond_1
    invoke-virtual {v12}, Ll/ۙܶۚ;->᩷()V

    .line 278
    new-instance v9, Ll/ܺܶۚ;

    iget-object v2, v12, Ll/ۙܶۚ;->ۤ:Ll/۫ܶۚ;

    iget-object v4, v12, Ll/ۙܶۚ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    iget v7, v12, Ll/ۙܶۚ;->ۧ:I

    move-object v1, v9

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Ll/ܺܶۚ;-><init>(Ll/۫ܶۚ;Ljava/util/ArrayList;Ljava/util/ArrayList;IZILjava/lang/String;)V

    return-object v9
.end method

.method public final ۙ(Ljava/lang/String;Ljava/util/HashSet;)Ll/ܺܶۚ;
    .locals 13

    .line 231
    invoke-direct {p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v10

    const-string v0, "locator"

    .line 232
    invoke-static {p1, v0}, Ll/۟ܶۚ;->᩸(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 233
    new-instance v11, Ll/ۙܶۚ;

    const-string v12, "default"

    const/16 v4, 0x14

    const/16 v5, 0x1000

    const v6, 0x8000

    const/16 v7, 0x32

    const/4 v8, 0x0

    move-object v0, v11

    move-object v1, v10

    move v2, p1

    move-object v3, v12

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Ll/ۙܶۚ;-><init>(Ll/֨ܽۚ;ILjava/lang/String;IIIIILjava/util/HashSet;)V

    .line 236
    new-instance p2, Ll/᩶ܽۚ;

    invoke-direct {p2, v11}, Ll/᩶ܽۚ;-><init>(Ll/ۙܶۚ;)V

    invoke-static {v10, p1, p2}, Ll/۟ܶۚ;->ۙ(Ll/֨ܽۚ;ILl/ܳܶۚ;)V

    .line 237
    iget-object p1, v11, Ll/ۙܶۚ;->ۤ:Ll/۫ܶۚ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 240
    :cond_0
    invoke-virtual {v11}, Ll/ۙܶۚ;->ۙ()Ljava/util/ArrayList;

    move-result-object v2

    .line 241
    iget-object p1, v11, Ll/ۙܶۚ;->ۤ:Ll/۫ܶۚ;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p2

    iput p2, p1, Ll/۫ܶۚ;->֫:I

    const-string p1, "*"

    .line 1921
    iget-object p2, v11, Ll/ۙܶۚ;->ܳ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 244
    :cond_1
    invoke-static {v12}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object p2

    .line 245
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "default"

    const-string v3, "variant"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Resource variant not found"

    .line 243
    invoke-static {v1, v3, p1, p2, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    .line 246
    iget-object p2, p1, Ll/ۢܳۚ;->ܿ:Lbin/mt/json/JSONObject;

    const-string v0, "availableVariants"

    invoke-static {v2}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 247
    throw p1

    .line 249
    :cond_2
    :goto_0
    invoke-virtual {v11}, Ll/ۙܶۚ;->᩷()V

    .line 250
    iget-object v3, v11, Ll/ۙܶۚ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 251
    iget v6, v11, Ll/ۙܶۚ;->ۧ:I

    if-ge v4, v6, :cond_3

    const/4 p1, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    const/4 v5, 0x0

    .line 252
    :goto_1
    new-instance p1, Ll/ܺܶۚ;

    iget-object v1, v11, Ll/ۙܶۚ;->ۤ:Ll/۫ܶۚ;

    move-object v0, p1

    move-object v7, v12

    invoke-direct/range {v0 .. v7}, Ll/ܺܶۚ;-><init>(Ll/۫ܶۚ;Ljava/util/ArrayList;Ljava/util/ArrayList;IZILjava/lang/String;)V

    return-object p1
.end method

.method public final ۙ()Ll/᩶ۤۤ;
    .locals 4

    .line 358
    iget-object v0, p0, Ll/۟ܶۚ;->ۙ:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    .line 359
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۤۤ;

    if-eqz v0, :cond_0

    return-object v0

    .line 364
    :cond_0
    iget-object v0, p0, Ll/۟ܶۚ;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 365
    :try_start_0
    iget-object v1, p0, Ll/۟ܶۚ;->ۙ:Ljava/lang/ref/SoftReference;

    if-eqz v1, :cond_1

    .line 366
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۤۤ;

    if-eqz v1, :cond_1

    .line 368
    monitor-exit v0

    return-object v1

    .line 432
    :cond_1
    invoke-direct {p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    .line 372
    new-instance v2, Ll/᩶ۤۤ;

    invoke-virtual {v1}, Ll/ۖᩴۤ;->ۙ()Ll/ۜܳۤ;

    move-result-object v3

    invoke-virtual {v1}, Ll/ۖᩴۤ;->᩷()Ll/ۜۤۤ;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ll/᩶ۤۤ;-><init>(Ll/ۜܳۤ;Ll/ۜۤۤ;)V

    .line 373
    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Ll/۟ܶۚ;->ۙ:Ljava/lang/ref/SoftReference;

    .line 374
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 375
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۤ()Ll/ᩳܶۚ;
    .locals 1

    .line 432
    invoke-direct {p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v0

    iget-object v0, v0, Ll/֨ܽۚ;->᩷:Ll/ۖᩴۤ;

    .line 382
    invoke-static {v0}, Ll/ܶ᩹ۚ;->ۙ(Ll/ۖᩴۤ;)Ll/ᩳܶۚ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/ۤܶۚ;
    .locals 2

    .line 389
    new-instance v0, Ll/ۤܶۚ;

    invoke-direct {p0}, Ll/۟ܶۚ;->ᩴ()Ll/֨ܽۚ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۤܶۚ;-><init>(Ll/֨ܽۚ;)V

    return-object v0
.end method

.method public final ᩸()Ljava/util/ArrayList;
    .locals 2

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۟ܶۚ;->᩸:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
