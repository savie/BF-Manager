.class public final Ll/ܶ᩸᩻;
.super Ljava/lang/Object;
.source "L6P4"


# instance fields
.field public final ֫:[Z

.field public final ۗ:Ljava/util/ArrayList;

.field public final ۙ:Ljava/lang/String;

.field public final ۚ:Ljava/lang/String;

.field public final ۤ:[I

.field public final ۧ:[I

.field public final ۫:I

.field public final ܳ:Ljava/lang/String;

.field public final ܶ:Z

.field public final ܺ:Ll/ۤ᩻ᩴ;

.field public final ܽ:Ljava/lang/CharSequence;

.field public final ᩴ:[B

.field public final ᩷:Z

.field public final ᩸:[I

.field public final ᩹:[Z

.field public final ᩻:[Z


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/ۗܺۨ;Ll/۟ܺۨ;Ll/۫᩸᩻;Ll/ۧ᩸᩻;ZLl/ۤ᩻ᩴ;)V
    .locals 7

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    .line 44
    iput-object p1, p0, Ll/ܶ᩸᩻;->ܽ:Ljava/lang/CharSequence;

    .line 45
    iput-boolean p6, p0, Ll/ܶ᩸᩻;->᩷:Z

    .line 46
    invoke-virtual {p4}, Ll/۫᩸᩻;->ۤ()Z

    move-result p6

    iput-boolean p6, p0, Ll/ܶ᩸᩻;->ܶ:Z

    .line 47
    invoke-virtual {p4}, Ll/۫᩸᩻;->᩷()Z

    move-result p6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p6, :cond_0

    const-string p4, "\t"

    goto :goto_1

    :cond_0
    invoke-virtual {p4}, Ll/۫᩸᩻;->ۙ()I

    move-result p4

    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    if-ltz p4, :cond_16

    if-eqz p4, :cond_4

    const-string p6, " "

    if-ne p4, v1, :cond_1

    move-object p4, p6

    goto :goto_1

    :cond_1
    const v2, 0x7fffffff

    .line 0
    div-int/2addr v2, p4

    if-gt v1, v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p4, :cond_2

    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    const-string p2, "Repeating 1 bytes String "

    const-string p3, " times will produce a String exceeding maximum size."

    invoke-static {p4, p2, p3}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p4, ""

    .line 47
    :goto_1
    iput-object p4, p0, Ll/ܶ᩸᩻;->ܳ:Ljava/lang/String;

    .line 48
    invoke-virtual {p5}, Ll/ۧ᩸᩻;->ۙ()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Ll/ܶ᩸᩻;->ۙ:Ljava/lang/String;

    .line 49
    invoke-virtual {p5}, Ll/ۧ᩸᩻;->᩷()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-static {p1}, Ll/ᩳۚ᩻;->ۙ(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p5}, Ll/ۧ᩸᩻;->᩷()Ljava/lang/String;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Ll/ܶ᩸᩻;->ۚ:Ljava/lang/String;

    .line 50
    invoke-virtual {p5}, Ll/ۧ᩸᩻;->ۤ()I

    move-result p1

    iput p1, p0, Ll/ܶ᩸᩻;->۫:I

    .line 51
    iput-object p7, p0, Ll/ܶ᩸᩻;->ܺ:Ll/ۤ᩻ᩴ;

    .line 52
    invoke-virtual {p2}, Ll/ۗܺۨ;->size()I

    move-result p1

    new-array p1, p1, [I

    const/4 p4, -0x1

    .line 53
    invoke-static {p1, p4}, Ljava/util/Arrays;->fill([II)V

    .line 54
    invoke-virtual {p2}, Ll/ۗܺۨ;->᩸()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ll/۠ܺۨ;

    .line 55
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 56
    invoke-interface {p5}, Ll/۠ܺۨ;->᩷()I

    move-result p6

    if-nez p6, :cond_6

    invoke-interface {p5}, Ll/۠ܺۨ;->getType()I

    move-result p6

    if-eq p6, p4, :cond_6

    .line 57
    invoke-interface {p5}, Ll/۠ܺۨ;->ۤ()I

    move-result p6

    iget-object p7, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p7}, Ljava/util/ArrayList;->size()I

    move-result p7

    aput p7, p1, p6

    .line 58
    iget-object p6, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p6, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 61
    :cond_7
    iget-object p2, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [I

    iput-object p2, p0, Ll/ܶ᩸᩻;->ۧ:[I

    .line 62
    invoke-static {p2, p4}, Ljava/util/Arrays;->fill([II)V

    .line 63
    iget-object p2, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/2addr p2, v1

    new-array p4, p2, [I

    iput-object p4, p0, Ll/ܶ᩸᩻;->᩸:[I

    .line 64
    new-array p4, p2, [I

    iput-object p4, p0, Ll/ܶ᩸᩻;->ۤ:[I

    .line 65
    new-array p4, p2, [B

    iput-object p4, p0, Ll/ܶ᩸᩻;->ᩴ:[B

    .line 66
    new-array p2, p2, [Z

    iput-object p2, p0, Ll/ܶ᩸᩻;->᩻:[Z

    .line 67
    iget-object p2, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Z

    iput-object p2, p0, Ll/ܶ᩸᩻;->֫:[Z

    .line 68
    iget-object p2, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Z

    iput-object p2, p0, Ll/ܶ᩸᩻;->᩹:[Z

    .line 70
    new-instance p2, Ljava/util/ArrayDeque;

    invoke-direct {p2}, Ljava/util/ArrayDeque;-><init>()V

    .line 71
    invoke-virtual {p2, p3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 72
    :cond_8
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p3

    const/16 p4, 0x14

    const/16 p5, 0x12

    const/16 p6, 0x10

    const/4 p7, 0x7

    if-nez p3, :cond_f

    .line 73
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 74
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ᩳ᩹ۨ;

    .line 75
    instance-of v2, p3, Ll/۟ܺۨ;

    if-eqz v2, :cond_8

    check-cast p3, Ll/۟ܺۨ;

    .line 76
    invoke-virtual {p3}, Ll/ۖܺۨ;->᩷()I

    move-result v2

    const/4 v3, 0x5

    const/16 v4, 0x8

    if-eq v2, v3, :cond_9

    const/4 v3, 0x6

    if-eq v2, v3, :cond_9

    if-eq v2, p7, :cond_9

    if-ne v2, v4, :cond_e

    .line 322
    :cond_9
    iget-object p7, p3, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 328
    iget-object v2, p3, Ll/۟ܺۨ;->ᩴ:Ll/۠ܺۨ;

    if-eqz p7, :cond_e

    if-eqz v2, :cond_e

    .line 81
    invoke-interface {p7}, Ll/۠ܺۨ;->ۤ()I

    move-result v3

    if-ltz v3, :cond_e

    invoke-interface {v2}, Ll/۠ܺۨ;->ۤ()I

    move-result v3

    if-ltz v3, :cond_e

    .line 82
    invoke-interface {p7}, Ll/۠ܺۨ;->ۤ()I

    move-result p7

    aget p7, p1, p7

    invoke-interface {v2}, Ll/۠ܺۨ;->ۤ()I

    move-result v2

    aget v2, p1, v2

    if-ltz p7, :cond_e

    if-le v2, p7, :cond_e

    .line 83
    invoke-direct {p0, p7}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v3

    invoke-direct {p0, v2}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v5

    const/16 v6, 0xf

    if-ne v3, v6, :cond_a

    if-eq v5, p6, :cond_d

    :cond_a
    const/16 p6, 0x11

    if-ne v3, p6, :cond_b

    if-eq v5, p5, :cond_d

    :cond_b
    if-eq v3, v4, :cond_c

    const/16 p5, 0x13

    if-ne v3, p5, :cond_e

    :cond_c
    if-ne v5, p4, :cond_e

    .line 84
    :cond_d
    iget-object p4, p0, Ll/ܶ᩸᩻;->ۧ:[I

    aput v2, p4, p7

    .line 85
    aput p7, p4, v2

    .line 89
    :cond_e
    invoke-virtual {p3}, Ll/۟ܺۨ;->getChildCount()I

    move-result p4

    sub-int/2addr p4, v1

    :goto_4
    if-ltz p4, :cond_8

    invoke-virtual {p3, p4}, Ll/۟ܺۨ;->ۙ(I)Ll/ᩳ᩹ۨ;

    move-result-object p5

    invoke-virtual {p2, p5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 p4, p4, -0x1

    goto :goto_4

    .line 91
    :cond_f
    :goto_5
    iget-object p1, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_15

    .line 92
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 93
    invoke-direct {p0, v0}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result p1

    invoke-static {p1}, Ll/ܶ᩸᩻;->ۙ(I)Z

    move-result p1

    if-eqz p1, :cond_10

    iget-object p1, p0, Ll/ܶ᩸᩻;->ۧ:[I

    aget p1, p1, v0

    if-gez p1, :cond_10

    const-string p1, "Unclosed CSS delimiter"

    .line 94
    invoke-direct {p0, v0, p1}, Ll/ܶ᩸᩻;->ۙ(ILjava/lang/String;)V

    .line 95
    iget-object p1, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/2addr p1, v1

    invoke-direct {p0, v0, p1}, Ll/ܶ᩸᩻;->ۙ(II)V

    return-void

    .line 98
    :cond_10
    invoke-direct {p0, v0}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result p1

    if-ne p1, p7, :cond_11

    const-string p1, "Unterminated CSS string"

    .line 99
    invoke-direct {p0, v0, p1}, Ll/ܶ᩸᩻;->ۙ(ILjava/lang/String;)V

    .line 100
    iget-object p1, p0, Ll/ܶ᩸᩻;->᩻:[Z

    add-int/lit8 p2, v0, 0x1

    aput-boolean v1, p1, p2

    .line 103
    :cond_11
    invoke-direct {p0, v0}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result p1

    const/16 p2, 0x18

    if-ne p1, p2, :cond_12

    iget-object p1, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܺۨ;

    invoke-interface {p1}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object p1

    const-string p2, "\\"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    const-string p1, "Invalid CSS escape"

    .line 104
    invoke-direct {p0, v0, p1}, Ll/ܶ᩸᩻;->ۙ(ILjava/lang/String;)V

    .line 105
    iget-object p1, p0, Ll/ܶ᩸᩻;->᩻:[Z

    add-int/lit8 p2, v0, 0x1

    aput-boolean v1, p1, p2

    .line 107
    :cond_12
    invoke-direct {p0, v0}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result p1

    if-eq p1, p6, :cond_13

    if-eq p1, p4, :cond_13

    if-ne p1, p5, :cond_14

    :cond_13
    iget-object p1, p0, Ll/ܶ᩸᩻;->ۧ:[I

    aget p1, p1, v0

    if-gez p1, :cond_14

    const-string p1, "Unexpected CSS closing delimiter"

    .line 108
    invoke-direct {p0, v0, p1}, Ll/ܶ᩸᩻;->ۙ(ILjava/lang/String;)V

    .line 109
    iget-object p1, p0, Ll/ܶ᩸᩻;->᩻:[Z

    add-int/lit8 p2, v0, 0x1

    aput-boolean v1, p1, p2

    aput-boolean v1, p1, v0

    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_5

    :cond_15
    return-void

    .line 0
    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "count is negative: "

    invoke-static {p4, p2}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۙ(II)V
    .locals 2

    .line 415
    iget-object v0, p0, Ll/ܶ᩸᩻;->᩻:[Z

    array-length v1, v0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void
.end method

.method private ۙ(IIIZ)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    .line 128
    iget-object v4, v0, Ll/ܶ᩸᩻;->ۤ:[I

    invoke-static {v4, v1, v2, v3}, Ljava/util/Arrays;->fill([IIII)V

    if-ge v1, v2, :cond_0

    const/4 v5, 0x2

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    or-int/lit8 v5, v5, 0x4

    int-to-byte v5, v5

    .line 129
    iget-object v6, v0, Ll/ܶ᩸᩻;->ᩴ:[B

    aput-byte v5, v6, v1

    const/4 v5, 0x1

    if-ge v1, v2, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    or-int/lit8 v7, v7, 0x4

    int-to-byte v7, v7

    .line 130
    aput-byte v7, v6, v2

    move v7, v1

    :cond_2
    :goto_2
    if-ge v7, v2, :cond_57

    .line 133
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    const/4 v8, 0x7

    if-le v7, v1, :cond_3

    .line 134
    aput-byte v8, v6, v7

    .line 135
    :cond_3
    invoke-direct {v0, v7}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v8

    const/16 v9, 0x16

    const/4 v10, 0x3

    iget-object v11, v0, Ll/ܶ᩸᩻;->᩸:[I

    if-ne v8, v9, :cond_4

    .line 136
    aput v5, v11, v7

    add-int/lit8 v7, v7, 0x1

    if-ge v7, v2, :cond_2

    .line 137
    aput v10, v11, v7

    goto :goto_2

    :cond_4
    const/16 v5, 0x15

    const/16 v8, 0xe

    .line 141
    iget-object v12, v0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    if-eqz p4, :cond_6

    add-int/lit8 v14, v7, 0x1

    const/4 v15, 0x3

    if-ge v14, v2, :cond_5

    .line 255
    invoke-direct {v0, v7}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v13

    if-ne v13, v8, :cond_5

    invoke-direct {v0, v14}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v8

    if-ne v8, v5, :cond_5

    .line 419
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۠ܺۨ;

    invoke-interface {v5}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ۗ᩸᩻;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v8, "--"

    .line 141
    invoke-virtual {v5, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    const/4 v13, 0x7

    goto :goto_4

    :cond_5
    const/4 v13, 0x7

    goto :goto_3

    :cond_6
    const/4 v13, 0x7

    const/4 v15, 0x3

    :goto_3
    const/4 v5, 0x0

    :goto_4
    move v14, v7

    :goto_5
    const/16 v16, 0x1

    .line 144
    iget-object v10, v0, Ll/ܶ᩸᩻;->ۧ:[I

    if-ge v14, v2, :cond_e

    .line 145
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 146
    invoke-direct {v0, v14}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v9

    .line 147
    invoke-static {v9}, Ll/ܶ᩸᩻;->ۙ(I)Z

    move-result v18

    if-eqz v18, :cond_a

    .line 148
    aget v8, v10, v14

    if-ltz v8, :cond_9

    if-lt v8, v2, :cond_7

    goto :goto_6

    :cond_7
    const/16 v1, 0xf

    if-ne v9, v1, :cond_8

    if-nez v5, :cond_8

    move v1, v14

    goto :goto_a

    :cond_8
    add-int/lit8 v8, v8, 0x1

    move v14, v8

    goto :goto_7

    .line 149
    :cond_9
    :goto_6
    invoke-direct {v0, v7, v2}, Ll/ܶ᩸᩻;->ۙ(II)V

    return-void

    :cond_a
    const/16 v1, 0x16

    if-ne v9, v1, :cond_b

    goto :goto_9

    :cond_b
    const/16 v8, 0x10

    if-eq v9, v8, :cond_d

    const/16 v8, 0x14

    const/16 v1, 0x12

    if-eq v9, v8, :cond_d

    if-ne v9, v1, :cond_c

    goto :goto_8

    :cond_c
    add-int/lit8 v14, v14, 0x1

    :goto_7
    move/from16 v1, p1

    const/16 v9, 0x16

    goto :goto_5

    :cond_d
    :goto_8
    add-int/lit8 v1, v14, 0x1

    .line 161
    invoke-direct {v0, v7, v1}, Ll/ܶ᩸᩻;->ۙ(II)V

    :cond_e
    :goto_9
    const/4 v1, -0x1

    :goto_a
    const/16 v9, 0x9

    .line 166
    iget-boolean v8, v0, Ll/ܶ᩸᩻;->᩷:Z

    if-ltz v1, :cond_49

    .line 167
    aget v5, v10, v1

    .line 168
    invoke-direct {v0, v7}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v14

    if-ne v14, v9, :cond_38

    .line 419
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠ܺۨ;

    invoke-interface {v9}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/ۗ᩸᩻;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 259
    invoke-static {v9}, Ll/ۗ᩸᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_0

    goto/16 :goto_b

    :sswitch_0
    const-string v14, "@stylistic"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    goto/16 :goto_b

    :cond_f
    const/16 v9, 0x28

    goto/16 :goto_c

    :sswitch_1
    const-string v14, "@left-top"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    goto/16 :goto_b

    :cond_10
    const/16 v9, 0x27

    goto/16 :goto_c

    :sswitch_2
    const-string v14, "@swash"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    goto/16 :goto_b

    :cond_11
    const/16 v9, 0x26

    goto/16 :goto_c

    :sswitch_3
    const-string v14, "@scope"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    goto/16 :goto_b

    :cond_12
    const/16 v9, 0x25

    goto/16 :goto_c

    :sswitch_4
    const-string v14, "@media"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    goto/16 :goto_b

    :cond_13
    const/16 v9, 0x24

    goto/16 :goto_c

    :sswitch_5
    const-string v14, "@layer"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    goto/16 :goto_b

    :cond_14
    const/16 v9, 0x23

    goto/16 :goto_c

    :sswitch_6
    const-string v14, "@left-middle"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    goto/16 :goto_b

    :cond_15
    const/16 v9, 0x22

    goto/16 :goto_c

    :sswitch_7
    const-string v14, "@document"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_16

    goto/16 :goto_b

    :cond_16
    const/16 v9, 0x21

    goto/16 :goto_c

    :sswitch_8
    const-string v14, "@left-bottom"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    goto/16 :goto_b

    :cond_17
    const/16 v9, 0x20

    goto/16 :goto_c

    :sswitch_9
    const-string v14, "@top-right-corner"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_18

    goto/16 :goto_b

    :cond_18
    const/16 v9, 0x1f

    goto/16 :goto_c

    :sswitch_a
    const-string v14, "@character-variant"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_19

    goto/16 :goto_b

    :cond_19
    const/16 v9, 0x1e

    goto/16 :goto_c

    :sswitch_b
    const-string v14, "@counter-style"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1a

    goto/16 :goto_b

    :cond_1a
    const/16 v9, 0x1d

    goto/16 :goto_c

    :sswitch_c
    const-string v14, "@top-left-corner"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    goto/16 :goto_b

    :cond_1b
    const/16 v9, 0x1c

    goto/16 :goto_c

    :sswitch_d
    const-string v14, "@ornaments"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1c

    goto/16 :goto_b

    :cond_1c
    const/16 v9, 0x1b

    goto/16 :goto_c

    :sswitch_e
    const-string v14, "@page"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1d

    goto/16 :goto_b

    :cond_1d
    const/16 v9, 0x1a

    goto/16 :goto_c

    :sswitch_f
    const-string v14, "@-webkit-keyframes"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1e

    goto/16 :goto_b

    :cond_1e
    const/16 v9, 0x19

    goto/16 :goto_c

    :sswitch_10
    const-string v14, "@font-feature-values"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    goto/16 :goto_b

    :cond_1f
    const/16 v9, 0x18

    goto/16 :goto_c

    :sswitch_11
    const-string v14, "@container"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_20

    goto/16 :goto_b

    :cond_20
    const/16 v9, 0x17

    goto/16 :goto_c

    :sswitch_12
    const-string v14, "@starting-style"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_21

    goto/16 :goto_b

    :cond_21
    const/16 v9, 0x16

    goto/16 :goto_c

    :sswitch_13
    const-string v14, "@-moz-document"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_22

    goto/16 :goto_b

    :cond_22
    const/16 v9, 0x15

    goto/16 :goto_c

    :sswitch_14
    const-string v14, "@view-transition"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_23

    goto/16 :goto_b

    :cond_23
    const/16 v9, 0x14

    goto/16 :goto_c

    :sswitch_15
    const-string v14, "@bottom-right"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_24

    goto/16 :goto_b

    :cond_24
    const/16 v9, 0x13

    goto/16 :goto_c

    :sswitch_16
    const-string v14, "@font-palette-values"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_25

    goto/16 :goto_b

    :cond_25
    const/16 v9, 0x12

    goto/16 :goto_c

    :sswitch_17
    const-string v14, "@annotation"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_26

    goto/16 :goto_b

    :cond_26
    const/16 v9, 0x11

    goto/16 :goto_c

    :sswitch_18
    const-string v14, "@property"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_27

    goto/16 :goto_b

    :cond_27
    const/16 v9, 0x10

    goto/16 :goto_c

    :sswitch_19
    const-string v14, "@top-left"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_28

    goto/16 :goto_b

    :cond_28
    const/16 v9, 0xf

    goto/16 :goto_c

    :sswitch_1a
    const-string v14, "@bottom-left"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_29

    goto/16 :goto_b

    :cond_29
    const/16 v9, 0xe

    goto/16 :goto_c

    :sswitch_1b
    const-string v14, "@bottom-center"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2a

    goto/16 :goto_b

    :cond_2a
    const/16 v9, 0xd

    goto/16 :goto_c

    :sswitch_1c
    const-string v14, "@top-right"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2b

    goto/16 :goto_b

    :cond_2b
    const/16 v9, 0xc

    goto/16 :goto_c

    :sswitch_1d
    const-string v14, "@right-middle"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2c

    goto/16 :goto_b

    :cond_2c
    const/16 v9, 0xb

    goto/16 :goto_c

    :sswitch_1e
    const-string v14, "@bottom-right-corner"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2d

    goto/16 :goto_b

    :cond_2d
    const/16 v9, 0xa

    goto/16 :goto_c

    :sswitch_1f
    const-string v14, "@keyframes"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2e

    goto/16 :goto_b

    :cond_2e
    const/16 v9, 0x9

    goto/16 :goto_c

    :sswitch_20
    const-string v14, "@bottom-left-corner"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2f

    goto/16 :goto_b

    :cond_2f
    const/16 v9, 0x8

    goto/16 :goto_c

    :sswitch_21
    const-string v14, "@right-top"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_30

    goto :goto_b

    :cond_30
    const/4 v9, 0x7

    goto :goto_c

    :sswitch_22
    const-string v14, "@font-face"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_31

    goto :goto_b

    :cond_31
    const/4 v9, 0x6

    goto :goto_c

    :sswitch_23
    const-string v14, "@right-bottom"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_32

    goto :goto_b

    :cond_32
    const/4 v9, 0x5

    goto :goto_c

    :sswitch_24
    const-string v14, "@supports"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_33

    goto :goto_b

    :cond_33
    const/4 v9, 0x4

    goto :goto_c

    :sswitch_25
    const-string v14, "@position-try"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_34

    goto :goto_b

    :cond_34
    const/4 v9, 0x3

    goto :goto_c

    :sswitch_26
    const-string v14, "@top-center"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_35

    goto :goto_b

    :cond_35
    const/4 v9, 0x2

    goto :goto_c

    :sswitch_27
    const-string v14, "@-moz-keyframes"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_36

    goto :goto_b

    :cond_36
    const/4 v9, 0x1

    goto :goto_c

    :sswitch_28
    const-string v14, "@styleset"

    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_37

    goto :goto_b

    :cond_37
    const/4 v9, 0x0

    goto :goto_c

    :goto_b
    const/4 v9, -0x1

    :goto_c
    packed-switch v9, :pswitch_data_0

    add-int/lit8 v1, v5, 0x1

    .line 169
    invoke-direct {v0, v7, v1}, Ll/ܶ᩸᩻;->ۙ(II)V

    move/from16 v20, v15

    goto/16 :goto_17

    .line 223
    :cond_38
    :pswitch_0
    iget-object v9, v0, Ll/ܶ᩸᩻;->ۙ:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    iget-object v14, v0, Ll/ܶ᩸᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v14

    mul-int v14, v14, v3

    add-int/2addr v14, v9

    move v2, v7

    const/16 v9, 0x17

    :goto_d
    if-ge v2, v1, :cond_40

    .line 225
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 226
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ll/۠ܺۨ;

    invoke-interface/range {v17 .. v17}, Ll/۠ܺۨ;->ᩴ()I

    move-result v17

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ll/۠ܺۨ;

    invoke-interface/range {v18 .. v18}, Ll/۠ܺۨ;->᩸()I

    move-result v18

    sub-int v17, v17, v18

    add-int/lit8 v17, v17, 0x1

    add-int v17, v17, v14

    if-le v2, v7, :cond_3d

    add-int/lit8 v14, v2, -0x1

    move/from16 v18, v7

    .line 227
    invoke-direct {v0, v14}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v7

    if-eq v7, v9, :cond_3c

    invoke-direct {v0, v2}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v7

    if-eq v7, v9, :cond_3e

    .line 228
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠ܺۨ;

    invoke-interface {v7}, Ll/۠ܺۨ;->ᩴ()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۠ܺۨ;

    invoke-interface {v9}, Ll/۠ܺۨ;->᩸()I

    move-result v9

    :goto_e
    if-ge v7, v9, :cond_3e

    .line 405
    iget-object v14, v0, Ll/ܶ᩸᩻;->ܽ:Ljava/lang/CharSequence;

    move-object/from16 v19, v12

    invoke-interface {v14, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    move/from16 v20, v15

    const/16 v15, 0x2f

    if-ne v12, v15, :cond_3a

    add-int/lit8 v12, v7, 0x1

    if-ge v12, v9, :cond_3a

    invoke-interface {v14, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    const/16 v15, 0x2a

    if-ne v12, v15, :cond_3a

    add-int/lit8 v7, v7, 0x2

    const-string v12, "*/"

    .line 406
    invoke-static {v12, v14, v7}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v7

    if-ltz v7, :cond_3f

    if-lt v7, v9, :cond_39

    goto :goto_11

    :cond_39
    add-int/lit8 v7, v7, 0x1

    goto :goto_f

    .line 409
    :cond_3a
    invoke-interface {v14, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    invoke-static {v12}, Ll/ۗ᩸᩻;->ۙ(C)Z

    move-result v12

    if-eqz v12, :cond_3b

    goto :goto_10

    :cond_3b
    :goto_f
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v12, v19

    move/from16 v15, v20

    goto :goto_e

    :cond_3c
    move-object/from16 v19, v12

    move/from16 v20, v15

    :goto_10
    add-int/lit8 v17, v17, 0x1

    goto :goto_11

    :cond_3d
    move/from16 v18, v7

    :cond_3e
    move-object/from16 v19, v12

    move/from16 v20, v15

    :cond_3f
    :goto_11
    move/from16 v14, v17

    add-int/lit8 v2, v2, 0x1

    const/16 v9, 0x17

    move/from16 v7, v18

    move-object/from16 v12, v19

    move/from16 v15, v20

    goto/16 :goto_d

    :cond_40
    move/from16 v18, v7

    move/from16 v20, v15

    if-nez v8, :cond_41

    .line 230
    iget v2, v0, Ll/ܶ᩸᩻;->۫:I

    if-le v14, v2, :cond_41

    const/4 v2, 0x1

    goto :goto_12

    :cond_41
    const/4 v2, 0x0

    :goto_12
    move/from16 v7, v18

    :goto_13
    if-ge v7, v1, :cond_45

    .line 232
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 233
    invoke-direct {v0, v7}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v8

    invoke-static {v8}, Ll/ܶ᩸᩻;->ۙ(I)Z

    move-result v8

    if-eqz v8, :cond_42

    aget v8, v10, v7

    if-ltz v8, :cond_42

    move v7, v8

    goto :goto_15

    .line 234
    :cond_42
    invoke-direct {v0, v7}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v8

    const/16 v9, 0x17

    if-ne v8, v9, :cond_44

    .line 235
    aput v16, v11, v7

    add-int/lit8 v8, v7, 0x1

    if-ge v8, v1, :cond_44

    if-eqz v2, :cond_43

    const/4 v9, 0x3

    goto :goto_14

    :cond_43
    const/4 v9, 0x2

    .line 237
    :goto_14
    aput v9, v11, v8

    if-eqz v2, :cond_44

    .line 238
    aput-byte v13, v6, v8

    :cond_44
    :goto_15
    add-int/lit8 v7, v7, 0x1

    goto :goto_13

    :cond_45
    const/4 v2, 0x2

    .line 172
    aput v2, v11, v1

    add-int/lit8 v1, v1, 0x1

    if-ne v1, v5, :cond_46

    const/4 v2, 0x1

    goto :goto_16

    :cond_46
    const/4 v2, 0x3

    .line 173
    :goto_16
    aput v2, v11, v5

    .line 174
    aput v3, v4, v5

    if-ge v1, v5, :cond_47

    .line 176
    aput v20, v11, v1

    add-int/lit8 v2, v3, 0x1

    const/4 v7, 0x1

    .line 177
    invoke-direct {v0, v1, v5, v2, v7}, Ll/ܶ᩸᩻;->ۙ(IIIZ)V

    goto :goto_17

    :cond_47
    const/4 v1, 0x4

    .line 178
    aput-byte v1, v6, v5

    :goto_17
    add-int/lit8 v5, v5, 0x1

    move/from16 v1, p2

    if-ge v5, v1, :cond_48

    .line 181
    aput v20, v11, v5

    :cond_48
    move v7, v5

    goto/16 :goto_1f

    :cond_49
    move v1, v2

    move/from16 v18, v7

    move-object/from16 v19, v12

    move/from16 v20, v15

    if-eqz p4, :cond_4a

    add-int/lit8 v7, v18, 0x1

    if-ge v7, v14, :cond_4a

    move/from16 v2, v18

    .line 255
    invoke-direct {v0, v2}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v9

    const/16 v10, 0xe

    if-ne v9, v10, :cond_4b

    invoke-direct {v0, v7}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v7

    const/16 v9, 0x15

    if-ne v7, v9, :cond_4b

    const/4 v7, 0x1

    goto :goto_18

    :cond_4a
    move/from16 v2, v18

    :cond_4b
    const/4 v7, 0x0

    :goto_18
    if-eqz v7, :cond_4e

    add-int/lit8 v9, v2, 0x1

    const/4 v10, 0x1

    .line 186
    aput v10, v11, v9

    if-eqz v5, :cond_4c

    add-int/lit8 v9, v2, 0x2

    .line 189
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v12, v14, 0x1

    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    move-result v10

    invoke-direct {v0, v9, v10}, Ll/ܶ᩸᩻;->ۙ(II)V

    goto :goto_1b

    :cond_4c
    add-int/lit8 v9, v2, 0x2

    if-ge v9, v14, :cond_4f

    const/4 v10, 0x2

    .line 191
    aput v10, v11, v9

    :goto_19
    if-ge v9, v14, :cond_4f

    .line 246
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 247
    invoke-direct {v0, v9}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v10

    const/16 v12, 0x17

    if-ne v10, v12, :cond_4d

    const/4 v10, 0x1

    .line 248
    aput v10, v11, v9

    add-int/lit8 v10, v9, 0x1

    if-ge v10, v14, :cond_4d

    const/4 v12, 0x2

    .line 249
    aput v12, v11, v10

    goto :goto_1a

    :cond_4d
    const/4 v12, 0x2

    :goto_1a
    add-int/lit8 v9, v9, 0x1

    goto :goto_19

    .line 194
    :cond_4e
    invoke-direct {v0, v2}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v9

    const/16 v10, 0x9

    if-eq v9, v10, :cond_4f

    invoke-direct {v0, v2}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v9

    const/4 v10, 0x4

    if-eq v9, v10, :cond_4f

    invoke-direct {v0, v2}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v9

    const/4 v10, 0x5

    if-eq v9, v10, :cond_4f

    const-string v9, "Invalid CSS rule or declaration"

    .line 195
    invoke-direct {v0, v2, v9}, Ll/ܶ᩸᩻;->ۙ(ILjava/lang/String;)V

    .line 197
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    move-result v9

    add-int/lit8 v10, v14, 0x1

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-direct {v0, v2, v9}, Ll/ܶ᩸᩻;->ۙ(II)V

    :cond_4f
    :goto_1b
    if-ge v14, v1, :cond_52

    .line 199
    invoke-direct {v0, v14}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v9

    const/16 v10, 0x16

    if-ne v9, v10, :cond_52

    if-nez v5, :cond_50

    const/4 v2, 0x1

    .line 200
    aput v2, v11, v14

    :cond_50
    if-eqz v8, :cond_51

    if-eqz v7, :cond_51

    if-nez v5, :cond_51

    add-int/lit8 v2, v14, 0x1

    if-ne v2, v1, :cond_51

    .line 201
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_51

    invoke-direct {v0, v1}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v2

    const/16 v5, 0x10

    if-ne v2, v5, :cond_51

    .line 202
    iget-object v2, v0, Ll/ܶ᩸᩻;->֫:[Z

    const/4 v5, 0x1

    aput-boolean v5, v2, v14

    :cond_51
    add-int/lit8 v14, v14, 0x1

    if-ge v14, v1, :cond_56

    .line 204
    aput v20, v11, v14

    goto :goto_1e

    :cond_52
    if-nez v8, :cond_55

    if-eqz v7, :cond_55

    if-nez v5, :cond_55

    add-int/lit8 v7, v2, 0x2

    if-ge v7, v14, :cond_55

    if-ne v14, v1, :cond_55

    .line 209
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v1, v5, :cond_55

    invoke-direct {v0, v1}, Ll/ܶ᩸᩻;->᩷(I)I

    move-result v5

    const/16 v7, 0x10

    if-ne v5, v7, :cond_55

    move v5, v2

    :goto_1c
    if-gt v5, v14, :cond_54

    .line 212
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 213
    iget-object v7, v0, Ll/ܶ᩸᩻;->᩻:[Z

    aget-boolean v7, v7, v5

    if-eqz v7, :cond_53

    goto :goto_1d

    :cond_53
    add-int/lit8 v5, v5, 0x1

    goto :goto_1c

    :cond_54
    add-int/lit8 v5, v14, -0x1

    .line 215
    iget-object v7, v0, Ll/ܶ᩸᩻;->᩹:[Z

    const/4 v8, 0x1

    aput-boolean v8, v7, v5

    :cond_55
    :goto_1d
    if-ne v14, v2, :cond_56

    add-int/lit8 v14, v14, 0x1

    :cond_56
    :goto_1e
    move v7, v14

    :goto_1f
    const/4 v5, 0x1

    move v2, v1

    move/from16 v1, p1

    goto/16 :goto_2

    :cond_57
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x77ce4aaf -> :sswitch_28
        -0x61acd37d -> :sswitch_27
        -0x5e3113f3 -> :sswitch_26
        -0x5d484ca9 -> :sswitch_25
        -0x5206c53c -> :sswitch_24
        -0x4eed74c4 -> :sswitch_23
        -0x4c337325 -> :sswitch_22
        -0x4b3c2e1c -> :sswitch_21
        -0x44b95587 -> :sswitch_20
        -0x43de187b -> :sswitch_1f
        -0x3d5ffcb8 -> :sswitch_1e
        -0x3c84355a -> :sswitch_1d
        -0x3c03349c -> :sswitch_1c
        -0x3bbeb209 -> :sswitch_1b
        -0x3aa6ddd7 -> :sswitch_1a
        -0x2b3cb241 -> :sswitch_19
        -0x2a1661eb -> :sswitch_18
        -0x23836491 -> :sswitch_17
        -0x1a668e4e -> :sswitch_16
        -0x19de7bc6 -> :sswitch_15
        -0x19b992c3 -> :sswitch_14
        -0x17544b63 -> :sswitch_13
        -0x6ec8ddc -> :sswitch_12
        -0x6226bbf -> :sswitch_11
        -0x27f6329 -> :sswitch_10
        0x28ad8a7 -> :sswitch_f
        0x3ba42cf -> :sswitch_e
        0x4f1857f -> :sswitch_d
        0x11166a23 -> :sswitch_c
        0x1aed8260 -> :sswitch_b
        0x2370fda1 -> :sswitch_a
        0x26c838de -> :sswitch_9
        0x3d30f671 -> :sswitch_8
        0x4478915b -> :sswitch_7
        0x4f9a35db -> :sswitch_6
        0x7355fd11 -> :sswitch_5
        0x736597a4 -> :sswitch_4
        0x73b96614 -> :sswitch_3
        0x73c24952 -> :sswitch_2
        0x77773acf -> :sswitch_1
        0x7e3d8a30 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ۙ(ILjava/lang/String;)V
    .locals 1

    .line 115
    iget-boolean v0, p0, Ll/ܶ᩸᩻;->ܶ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܺۨ;

    invoke-interface {p1}, Ll/۠ܺۨ;->᩸()I

    move-result p1

    iget-object v0, p0, Ll/ܶ᩸᩻;->ܽ:Ljava/lang/CharSequence;

    invoke-static {p2, v0, p1}, Ll/ۢۚ᩻;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)Ll/ۚ᩸᩻;

    move-result-object p1

    throw p1
.end method

.method private ۙ(Ljava/lang/String;ILl/۠ܺۨ;Ll/۠ܺۨ;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    .line 295
    iget-object v3, v0, Ll/ܶ᩸᩻;->᩻:[Z

    aget-boolean v3, v3, p2

    iget-object v4, v0, Ll/ܶ᩸᩻;->ܺ:Ll/ۤ᩻ᩴ;

    if-eqz v3, :cond_0

    .line 296
    invoke-virtual {v4, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    .line 302
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 303
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v10

    iget-boolean v11, v0, Ll/ܶ᩸᩻;->᩷:Z

    const-string v12, "*/"

    if-ge v6, v10, :cond_9

    and-int/lit16 v10, v6, 0x3ff

    if-nez v10, :cond_1

    .line 304
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 305
    :cond_1
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 306
    invoke-static {v10}, Ll/ۗ᩸᩻;->ۙ(C)Z

    move-result v13

    if-eqz v13, :cond_2

    add-int/lit8 v6, v6, 0x1

    const/4 v9, 0x1

    goto :goto_0

    :cond_2
    const/16 v7, 0x2f

    if-ne v10, v7, :cond_8

    add-int/lit8 v7, v6, 0x1

    .line 307
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v7, v10, :cond_8

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v10, 0x2a

    if-ne v7, v10, :cond_8

    add-int/lit8 v7, v6, 0x2

    .line 309
    invoke-virtual {v1, v12, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v10

    if-gez v10, :cond_3

    const/4 v12, 0x1

    goto :goto_1

    :cond_3
    const/4 v12, 0x0

    :goto_1
    if-eqz v12, :cond_4

    .line 311
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v10

    goto :goto_2

    :cond_4
    add-int/lit8 v10, v10, 0x2

    :goto_2
    if-eqz v11, :cond_6

    if-nez v12, :cond_6

    if-ge v7, v10, :cond_5

    .line 398
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v11, 0x21

    if-ne v7, v11, :cond_5

    goto :goto_3

    .line 399
    :cond_5
    invoke-virtual {v1, v6, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ll/ۗ᩸᩻;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "@license"

    .line 400
    invoke-virtual {v7, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_6

    const-string v11, "@preserve"

    invoke-virtual {v7, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 313
    :cond_6
    :goto_3
    invoke-virtual {v3, v1, v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const/4 v6, 0x1

    const/4 v8, 0x1

    :cond_7
    const/4 v7, 0x1

    move v6, v10

    goto :goto_0

    .line 319
    :cond_8
    invoke-virtual {v4, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    .line 323
    :cond_9
    iget-object v6, v0, Ll/ܶ᩸᩻;->ᩴ:[B

    const/4 v10, 0x2

    if-nez v11, :cond_17

    if-eqz v7, :cond_17

    .line 324
    aget-byte v3, v6, p2

    and-int/lit8 v7, v3, 0x4

    if-eqz v7, :cond_16

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    goto :goto_4

    :cond_a
    const/4 v3, 0x0

    :goto_4
    const/4 v7, 0x0

    .line 359
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v7, v8, :cond_28

    .line 360
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    const-string v8, "/*"

    .line 361
    invoke-virtual {v1, v8, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v8

    if-gez v8, :cond_b

    .line 362
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v9

    goto :goto_6

    :cond_b
    move v9, v8

    :goto_6
    if-gez v8, :cond_d

    .line 363
    aget-byte v11, v6, p2

    and-int/2addr v11, v10

    if-eqz v11, :cond_c

    goto :goto_7

    :cond_c
    const/4 v11, 0x0

    goto :goto_8

    :cond_d
    :goto_7
    const/4 v11, 0x1

    .line 364
    :goto_8
    invoke-virtual {v1, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    if-eqz v3, :cond_e

    if-eqz v11, :cond_e

    const/4 v3, 0x2

    goto :goto_9

    :cond_e
    const/4 v3, 0x1

    :goto_9
    if-nez p3, :cond_f

    if-eqz v7, :cond_10

    :cond_f
    if-nez v2, :cond_11

    if-gez v8, :cond_11

    :cond_10
    const/4 v3, 0x0

    :cond_11
    if-gez v8, :cond_13

    if-eqz v2, :cond_12

    goto :goto_a

    :cond_12
    const/4 v7, 0x0

    goto :goto_b

    :cond_13
    :goto_a
    const/4 v7, 0x1

    .line 367
    :goto_b
    new-instance v11, Ll/ܽ᩸᩻;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    invoke-static {v9, v3, v5, v7, v11}, Ll/᩶۬ܶ;->ۙ(Ljava/lang/String;IZZLjava/lang/Runnable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    if-gez v8, :cond_14

    goto/16 :goto_10

    :cond_14
    add-int/lit8 v3, v8, 0x2

    .line 370
    invoke-virtual {v1, v12, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    if-gez v3, :cond_15

    .line 371
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v4, v8, v2, v1}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    :cond_15
    add-int/lit8 v7, v3, 0x2

    .line 373
    invoke-virtual {v4, v8, v7, v1}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    const/4 v3, 0x1

    goto :goto_5

    .line 329
    :cond_16
    invoke-virtual {v4, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    .line 332
    :cond_17
    iget-object v7, v0, Ll/ܶ᩸᩻;->᩸:[I

    aget v7, v7, p2

    const-string v12, "/**/"

    const-string v13, " "

    const/16 v14, 0x20

    if-eqz v11, :cond_1c

    if-eqz v8, :cond_18

    .line 334
    invoke-virtual {v4, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    :cond_18
    if-eqz v9, :cond_19

    if-nez v7, :cond_19

    if-eqz p3, :cond_19

    if-eqz v2, :cond_19

    .line 336
    invoke-virtual {v4, v14}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    return-void

    :cond_19
    if-nez v8, :cond_28

    .line 337
    invoke-direct {p0, v2}, Ll/ܶ᩸᩻;->ۙ(Ll/۠ܺۨ;)Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_28

    invoke-static/range {p3 .. p4}, Ll/ۖ᩸᩻;->ۙ(Ll/۠ܺۨ;Ll/۠ܺۨ;)Z

    move-result v1

    if-eqz v1, :cond_28

    :cond_1a
    if-eqz v9, :cond_1b

    move-object v12, v13

    .line 338
    :cond_1b
    invoke-virtual {v4, v12}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    :cond_1c
    if-eqz v2, :cond_28

    if-nez p3, :cond_1d

    goto/16 :goto_10

    :cond_1d
    const/4 v3, 0x3

    if-ne v7, v3, :cond_23

    .line 343
    aget-byte v2, v6, p2

    and-int/2addr v2, v3

    iget-object v6, v0, Ll/ܶ᩸᩻;->ۚ:Ljava/lang/String;

    if-ne v2, v3, :cond_22

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 380
    :goto_c
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v2, v7, :cond_22

    and-int/lit16 v7, v2, 0x3ff

    if-nez v7, :cond_1e

    .line 381
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 382
    :cond_1e
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0xa

    const/16 v9, 0xd

    if-eq v7, v9, :cond_1f

    if-ne v7, v8, :cond_21

    :cond_1f
    add-int/lit8 v3, v3, 0x1

    if-ne v3, v10, :cond_20

    .line 344
    invoke-virtual {v4, v6}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    goto :goto_d

    :cond_20
    if-ne v7, v9, :cond_21

    add-int/lit8 v7, v2, 0x1

    .line 385
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v7, v9, :cond_21

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v8, :cond_21

    move v2, v7

    :cond_21
    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    .line 345
    :cond_22
    :goto_d
    invoke-virtual {v4, v6}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    move-result-object v1

    iget-object v2, v0, Ll/ܶ᩸᩻;->ۙ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 346
    :goto_e
    iget-object v1, v0, Ll/ܶ᩸᩻;->ۤ:[I

    aget v1, v1, p2

    if-ge v5, v1, :cond_28

    iget-object v1, v0, Ll/ܶ᩸᩻;->ܳ:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    :cond_23
    if-eq v7, v10, :cond_27

    if-nez v7, :cond_24

    if-eqz v9, :cond_24

    goto :goto_f

    .line 349
    :cond_24
    invoke-direct {p0, v2}, Ll/ܶ᩸᩻;->ۙ(Ll/۠ܺۨ;)Z

    move-result v3

    if-nez v3, :cond_25

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_28

    invoke-static/range {p3 .. p4}, Ll/ۖ᩸᩻;->ۙ(Ll/۠ܺۨ;Ll/۠ܺۨ;)Z

    move-result v1

    if-eqz v1, :cond_28

    :cond_25
    if-eqz v9, :cond_26

    move-object v12, v13

    .line 350
    :cond_26
    invoke-virtual {v4, v12}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    return-void

    .line 348
    :cond_27
    :goto_f
    invoke-virtual {v4, v14}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    :cond_28
    :goto_10
    return-void
.end method

.method public static ۙ(I)Z
    .locals 1

    const/16 v0, 0xf

    if-eq p0, v0, :cond_1

    const/16 v0, 0x13

    if-eq p0, v0, :cond_1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_1

    const/16 v0, 0x11

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ۙ(Ll/۠ܺۨ;)Z
    .locals 4

    .line 392
    iget-object v0, p0, Ll/ܶ᩸᩻;->ܺ:Ll/ۤ᩻ᩴ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eqz p1, :cond_0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    add-int/lit8 v2, v1, -0x2

    .line 393
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x21

    if-ne v0, v1, :cond_0

    .line 394
    invoke-interface {p1}, Ll/۠ܺۨ;->getText()Ljava/lang/String;

    move-result-object p1

    const-string v0, "--"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ᩷(I)I
    .locals 1

    .line 418
    iget-object v0, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ܺۨ;

    invoke-interface {p1}, Ll/۠ܺۨ;->getType()I

    move-result p1

    return p1
.end method


# virtual methods
.method public final ۙ()V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v0

    .line 275
    :goto_0
    iget-object v4, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, p0, Ll/ܶ᩸᩻;->ܽ:Ljava/lang/CharSequence;

    if-ge v1, v5, :cond_3

    .line 276
    invoke-static {}, Ll/ᩳۚ᩻;->᩸()V

    .line 277
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ܺۨ;

    .line 278
    iget-object v5, p0, Ll/ܶ᩸᩻;->֫:[Z

    aget-boolean v5, v5, v1

    if-eqz v5, :cond_0

    .line 279
    invoke-interface {v4}, Ll/۠ܺۨ;->᩸()I

    move-result v5

    invoke-static {v2, v5, v6}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2, v1, v3, v0}, Ll/ܶ᩸᩻;->ۙ(Ljava/lang/String;ILl/۠ܺۨ;Ll/۠ܺۨ;)V

    .line 280
    invoke-interface {v4}, Ll/۠ܺۨ;->ᩴ()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 283
    :cond_0
    invoke-interface {v4}, Ll/۠ܺۨ;->᩸()I

    move-result v5

    invoke-static {v2, v5, v6}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 284
    invoke-direct {p0, v2, v1, v3, v4}, Ll/ܶ᩸᩻;->ۙ(Ljava/lang/String;ILl/۠ܺۨ;Ll/۠ܺۨ;)V

    .line 285
    iget-object v2, p0, Ll/ܶ᩸᩻;->ܺ:Ll/ۤ᩻ᩴ;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    iget-boolean v3, p0, Ll/ܶ᩸᩻;->᩷:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Ll/ܶ᩸᩻;->ۙ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ll/ۤ᩻ᩴ;->append(Ljava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 286
    :cond_1
    invoke-interface {v4}, Ll/۠ܺۨ;->᩸()I

    move-result v3

    invoke-interface {v4}, Ll/۠ܺۨ;->ᩴ()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v2, v3, v5, v6}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    .line 287
    iget-object v3, p0, Ll/ܶ᩸᩻;->᩹:[Z

    aget-boolean v3, v3, v1

    if-eqz v3, :cond_2

    const/16 v3, 0x3b

    invoke-virtual {v2, v3}, Ll/ۤ᩻ᩴ;->append(C)Ll/ۤ᩻ᩴ;

    .line 288
    :cond_2
    invoke-interface {v4}, Ll/۠ܺۨ;->ᩴ()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    move-object v3, v4

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 8
    :cond_3
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v2, v1, v6}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 291
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {p0, v1, v2, v3, v0}, Ll/ܶ᩸᩻;->ۙ(Ljava/lang/String;ILl/۠ܺۨ;Ll/۠ܺۨ;)V

    return-void
.end method

.method public final ۙ(Ll/֫᩸᩻;)V
    .locals 5

    .line 119
    iget-object v0, p0, Ll/ܶ᩸᩻;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 120
    sget-object v0, Ll/֫᩸᩻;->᩶:Ll/֫᩸᩻;

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Ll/ܶ᩸᩻;->ᩴ:[B

    const/4 v0, 0x4

    aput-byte v0, p1, v2

    return-void

    .line 123
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v3, p0, Ll/ܶ᩸᩻;->᩸:[I

    const/4 v4, 0x1

    aput v4, v3, v1

    aput v4, v3, v2

    .line 124
    sget-object v1, Ll/֫᩸᩻;->᩶:Ll/֫᩸᩻;

    if-eq p1, v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sget-object v1, Ll/֫᩸᩻;->ܿ:Ll/֫᩸᩻;

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-direct {p0, v2, v0, v2, v4}, Ll/ܶ᩸᩻;->ۙ(IIIZ)V

    :cond_2
    return-void
.end method
