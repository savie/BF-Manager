.class public final Ll/ۧ֫᩻;
.super Ljava/lang/Object;
.source "M6OA"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۙ:Ll/᩻ۧ᩻;

.field public final ۚ:[Ll/ۚ֫᩻;

.field public ۤ:I

.field public final ۧ:[I

.field public final ۫:Ll/ۤ᩻ᩴ;

.field public final ܳ:[Ll/ۚ֫᩻;

.field public final ܶ:[I

.field public final ܺ:I

.field public final ܽ:Ljava/lang/String;

.field public final ᩴ:Ljava/lang/String;

.field public ᩷:I

.field public final ᩸:[Z

.field public final ᩻:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ILl/᩻ۧ᩻;Ll/ۤ᩻ᩴ;)V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/ۧ֫᩻;->᩻:Ljava/lang/CharSequence;

    .line 27
    iput-object p2, p0, Ll/ۧ֫᩻;->֫:Ljava/util/ArrayList;

    .line 28
    iput-object p3, p0, Ll/ۧ֫᩻;->ܽ:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Ll/ۧ֫᩻;->ᩴ:Ljava/lang/String;

    .line 30
    iput p5, p0, Ll/ۧ֫᩻;->ܺ:I

    .line 32
    iput-object p6, p0, Ll/ۧ֫᩻;->ۙ:Ll/᩻ۧ᩻;

    .line 33
    iput-object p7, p0, Ll/ۧ֫᩻;->۫:Ll/ۤ᩻ᩴ;

    .line 34
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/ۚ֫᩻;

    iput-object p1, p0, Ll/ۧ֫᩻;->ܳ:[Ll/ۚ֫᩻;

    .line 35
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ll/ۚ֫᩻;

    iput-object p1, p0, Ll/ۧ֫᩻;->ۚ:[Ll/ۚ֫᩻;

    .line 36
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p3, 0x1

    add-int/2addr p1, p3

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۧ֫᩻;->ܶ:[I

    .line 37
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۧ֫᩻;->ۧ:[I

    .line 38
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ۧ֫᩻;->᩸:[Z

    const/4 p1, 0x0

    .line 53
    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-ge p1, p4, :cond_6

    .line 54
    invoke-virtual {p6}, Ll/᩻ۧ᩻;->ۙ()V

    .line 55
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/֫֫᩻;

    .line 56
    invoke-static {p4}, Ll/֫֫᩻;->᩸(Ll/֫֫᩻;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result p5

    .line 57
    invoke-static {p4}, Ll/֫֫᩻;->᩻(Ll/֫֫᩻;)I

    move-result p7

    const/4 v0, 0x0

    :goto_1
    invoke-static {p4}, Ll/֫֫᩻;->᩷(Ll/֫֫᩻;)I

    move-result v1

    if-ge p7, v1, :cond_5

    add-int/lit8 v1, v0, 0x1

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    .line 58
    invoke-virtual {p6}, Ll/᩻ۧ᩻;->ۙ()V

    .line 59
    :cond_0
    iget-object v0, p0, Ll/ۧ֫᩻;->᩻:Ljava/lang/CharSequence;

    invoke-static {v0, p7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    const/16 v2, 0xd

    if-eq v0, v2, :cond_3

    const/16 v2, 0xa

    if-ne v0, v2, :cond_1

    goto :goto_3

    :cond_1
    const v2, 0xfeff

    if-eq v0, v2, :cond_4

    const/16 v2, 0x9

    if-ne v0, v2, :cond_2

    .line 61
    iget v2, p0, Ll/ۧ֫᩻;->ܺ:I

    goto :goto_2

    :cond_2
    const/4 v2, 0x1

    :goto_2
    add-int/2addr p5, v2

    goto :goto_4

    .line 60
    :cond_3
    :goto_3
    iget-object v2, p0, Ll/ۧ֫᩻;->᩸:[Z

    aput-boolean p3, v2, p1

    .line 62
    :cond_4
    :goto_4
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    move-result v0

    add-int/2addr p7, v0

    move v0, v1

    goto :goto_1

    .line 64
    :cond_5
    iget-object p4, p0, Ll/ۧ֫᩻;->ܶ:[I

    add-int/lit8 p7, p1, 0x1

    aget p1, p4, p1

    add-int/2addr p1, p5

    aput p1, p4, p7

    move p1, p7

    goto :goto_0

    .line 69
    :cond_6
    iget-object p1, p0, Ll/ۧ֫᩻;->֫:Ljava/util/ArrayList;

    new-instance p4, Ljava/util/ArrayDeque;

    invoke-direct {p4}, Ljava/util/ArrayDeque;-><init>()V

    const/4 p5, 0x0

    .line 70
    :goto_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p7

    if-ge p5, p7, :cond_e

    .line 71
    iget-object p7, p0, Ll/ۧ֫᩻;->ۙ:Ll/᩻ۧ᩻;

    invoke-virtual {p7}, Ll/᩻ۧ᩻;->ۙ()V

    .line 72
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ll/֫֫᩻;

    .line 73
    iget-object v0, p0, Ll/ۧ֫᩻;->ۚ:[Ll/ۚ֫᩻;

    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ֫᩻;

    aput-object v1, v0, p5

    .line 74
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 75
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ֫᩻;

    iget-boolean v1, v0, Ll/ۚ֫᩻;->᩸:Z

    .line 149
    iget-object v2, p0, Ll/ۧ֫᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֫᩻;

    .line 150
    invoke-static {v2}, Ll/֫֫᩻;->۫(Ll/֫֫᩻;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-static {v2}, Ll/֫֫᩻;->ᩴ(Ll/֫֫᩻;)I

    move-result v2

    if-ltz v2, :cond_7

    goto :goto_6

    .line 75
    :cond_7
    iget-object v2, p0, Ll/ۧ֫᩻;->᩸:[Z

    aget-boolean v2, v2, p5

    if-eqz v2, :cond_8

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v2, 0x1

    :goto_7
    or-int/2addr v1, v2

    iput-boolean v1, v0, Ll/ۚ֫᩻;->᩸:Z

    .line 76
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ֫᩻;

    iget-boolean v1, v0, Ll/ۚ֫᩻;->۫:Z

    invoke-static {p7}, Ll/֫֫᩻;->֫(Ll/֫֫᩻;)Z

    move-result v2

    or-int/2addr v1, v2

    iput-boolean v1, v0, Ll/ۚ֫᩻;->۫:Z

    .line 78
    :cond_a
    invoke-static {p7}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v0

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_c

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_c

    const/16 v1, 0x2d

    if-ne v0, v1, :cond_b

    goto :goto_8

    .line 83
    :cond_b
    invoke-static {p7}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result p7

    invoke-static {p7}, Ll/ۧ֫᩻;->᩷(I)Z

    move-result p7

    if-eqz p7, :cond_d

    .line 84
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Ll/ۚ֫᩻;

    .line 85
    iput p5, p7, Ll/ۚ֫᩻;->ۙ:I

    .line 86
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 87
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ֫᩻;

    iget-boolean v1, v0, Ll/ۚ֫᩻;->᩸:Z

    iget-boolean v2, p7, Ll/ۚ֫᩻;->᩸:Z

    or-int/2addr v1, v2

    iput-boolean v1, v0, Ll/ۚ֫᩻;->᩸:Z

    .line 88
    invoke-virtual {p4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ֫᩻;

    iget-boolean v1, v0, Ll/ۚ֫᩻;->۫:Z

    iget-boolean p7, p7, Ll/ۚ֫᩻;->۫:Z

    or-int/2addr p7, v1

    iput-boolean p7, v0, Ll/ۚ֫᩻;->۫:Z

    goto :goto_9

    .line 79
    :cond_c
    :goto_8
    new-instance v0, Ll/ۚ֫᩻;

    invoke-static {p7}, Ll/֫֫᩻;->ۚ(Ll/֫֫᩻;)I

    move-result v1

    invoke-direct {v0, p5, v1}, Ll/ۚ֫᩻;-><init>(II)V

    .line 80
    invoke-static {p7}, Ll/֫֫᩻;->֫(Ll/֫֫᩻;)Z

    move-result p7

    iput-boolean p7, v0, Ll/ۚ֫᩻;->۫:Z

    .line 81
    iget-object p7, p0, Ll/ۧ֫᩻;->ܳ:[Ll/ۚ֫᩻;

    aput-object v0, p7, p5

    .line 82
    invoke-virtual {p4, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_d
    :goto_9
    add-int/lit8 p5, p5, 0x1

    goto/16 :goto_5

    .line 42
    :cond_e
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, p3

    :goto_a
    if-ltz p1, :cond_11

    .line 43
    invoke-virtual {p6}, Ll/᩻ۧ᩻;->ۙ()V

    .line 44
    iget-object p3, p0, Ll/ۧ֫᩻;->ۧ:[I

    aput p1, p3, p1

    add-int/lit8 p3, p1, 0x1

    .line 45
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-ge p3, p4, :cond_10

    iget-object p4, p0, Ll/ۧ֫᩻;->᩸:[Z

    aget-boolean p4, p4, p1

    if-nez p4, :cond_10

    .line 149
    iget-object p4, p0, Ll/ۧ֫᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/֫֫᩻;

    .line 150
    invoke-static {p4}, Ll/֫֫᩻;->۫(Ll/֫֫᩻;)Z

    move-result p5

    if-nez p5, :cond_10

    invoke-static {p4}, Ll/֫֫᩻;->ᩴ(Ll/֫֫᩻;)I

    move-result p4

    if-ltz p4, :cond_f

    goto :goto_b

    .line 45
    :cond_f
    invoke-direct {p0, p3}, Ll/ۧ֫᩻;->ۙ(I)Z

    move-result p4

    if-nez p4, :cond_10

    .line 46
    iget-object p4, p0, Ll/ۧ֫᩻;->ۧ:[I

    aget p3, p4, p3

    aput p3, p4, p1

    :cond_10
    :goto_b
    add-int/lit8 p1, p1, -0x1

    goto :goto_a

    :cond_11
    return-void
.end method

.method private ۙ(Ljava/lang/CharSequence;II)V
    .locals 6

    sub-int v0, p3, p2

    .line 176
    iget-object v1, p0, Ll/ۧ֫᩻;->۫:Ll/ۤ᩻ᩴ;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/high16 v3, 0x100000

    sub-int/2addr v3, v2

    if-gt v0, v3, :cond_6

    .line 179
    invoke-virtual {v1, p2, p3, p1}, Ll/ۤ᩻ᩴ;->ۙ(IILjava/lang/CharSequence;)Ll/ۤ᩻ᩴ;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge p2, p3, :cond_5

    add-int/lit8 v2, v1, 0x1

    and-int/lit16 v1, v1, 0x3ff

    if-nez v1, :cond_0

    .line 182
    iget-object v1, p0, Ll/ۧ֫᩻;->ۙ:Ll/᩻ۧ᩻;

    invoke-virtual {v1}, Ll/᩻ۧ᩻;->ۙ()V

    .line 183
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    const/16 v3, 0xa

    if-eq v1, v3, :cond_3

    const/16 v3, 0xd

    if-ne v1, v3, :cond_1

    goto :goto_2

    :cond_1
    const v3, 0xfeff

    if-eq v1, v3, :cond_4

    .line 185
    iget v3, p0, Ll/ۧ֫᩻;->᩷:I

    const/16 v4, 0x9

    if-ne v1, v4, :cond_2

    iget v4, p0, Ll/ۧ֫᩻;->ܺ:I

    rem-int v5, v3, v4

    sub-int/2addr v4, v5

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    :goto_1
    add-int/2addr v3, v4

    iput v3, p0, Ll/ۧ֫᩻;->᩷:I

    goto :goto_3

    .line 184
    :cond_3
    :goto_2
    iput v0, p0, Ll/ۧ֫᩻;->᩷:I

    iput v0, p0, Ll/ۧ֫᩻;->ۤ:I

    .line 186
    :cond_4
    :goto_3
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr p2, v1

    move v1, v2

    goto :goto_0

    :cond_5
    return-void

    .line 177
    :cond_6
    sget-object p1, Ll/ۙ֫᩻;->ܿ:Ll/ۙ֫᩻;

    const-string p2, "Formatted source length limit exceeded"

    invoke-static {p1, p2}, Ll/ܶۧ᩻;->ۙ(Ll/ۙ֫᩻;Ljava/lang/String;)Ll/᩷֫᩻;

    move-result-object p1

    throw p1
.end method

.method private ۙ(I)Z
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    iget-object v0, p0, Ll/ۧ֫᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֫᩻;

    .line 156
    invoke-static {v0}, Ll/֫֫᩻;->֫(Ll/֫֫᩻;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Ll/֫֫᩻;->۫(Ll/֫֫᩻;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v1

    invoke-static {v1}, Ll/ۧ֫᩻;->᩷(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 158
    :cond_1
    invoke-static {v0}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v1

    const/16 v2, 0x11

    if-ne v1, v2, :cond_2

    goto :goto_0

    .line 159
    :cond_2
    iget-object v1, p0, Ll/ۧ֫᩻;->ۚ:[Ll/ۚ֫᩻;

    aget-object v1, v1, p1

    .line 160
    invoke-static {v0}, Ll/֫֫᩻;->ۧ(Ll/֫֫᩻;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_3

    if-eqz v1, :cond_4

    iget-boolean v0, v1, Ll/ۚ֫᩻;->۫:Z

    if-nez v0, :cond_4

    iget v0, v1, Ll/ۚ֫᩻;->ܳ:I

    add-int/2addr v0, v2

    if-ne p1, v0, :cond_4

    :cond_3
    return v2

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ᩷(I)Z
    .locals 1

    const/16 v0, 0x1f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x30

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2e

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


# virtual methods
.method public final ۙ(Z)V
    .locals 19

    move-object/from16 v0, p0

    .line 95
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 97
    :goto_0
    iget-object v4, v0, Ll/ۧ֫᩻;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    iget-object v6, v0, Ll/ۧ֫᩻;->ۙ:Ll/᩻ۧ᩻;

    iget-object v7, v0, Ll/ۧ֫᩻;->᩻:Ljava/lang/CharSequence;

    const/4 v8, 0x1

    if-ge v2, v5, :cond_17

    .line 98
    invoke-virtual {v6}, Ll/᩻ۧ᩻;->ۙ()V

    .line 99
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫֫᩻;

    .line 100
    iget-object v9, v0, Ll/ۧ֫᩻;->ۚ:[Ll/ۚ֫᩻;

    aget-object v9, v9, v2

    if-nez v9, :cond_0

    const/4 v10, 0x0

    goto :goto_1

    .line 102
    :cond_0
    iget v10, v9, Ll/ۚ֫᩻;->ᩴ:I

    .line 103
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۫֫᩻;

    invoke-static {v11}, Ll/۫֫᩻;->᩷(Ll/۫֫᩻;)I

    move-result v11

    .line 102
    :goto_2
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 104
    invoke-static {v5}, Ll/֫֫᩻;->ۚ(Ll/֫֫᩻;)I

    move-result v11

    add-int/2addr v11, v10

    .line 105
    invoke-static {v5}, Ll/֫֫᩻;->֫(Ll/֫֫᩻;)Z

    move-result v12

    if-nez v12, :cond_3

    invoke-static {v5}, Ll/֫֫᩻;->ۙ(Ll/֫֫᩻;)Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-static {v5}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v12

    invoke-static {v12}, Ll/ۧ֫᩻;->᩷(I)Z

    move-result v12

    if-nez v12, :cond_3

    if-eqz v9, :cond_2

    invoke-static {v5}, Ll/֫֫᩻;->ۚ(Ll/֫֫᩻;)I

    move-result v12

    iget v13, v9, Ll/ۚ֫᩻;->ۤ:I

    add-int/2addr v13, v8

    if-le v12, v13, :cond_3

    :cond_2
    const/4 v12, 0x1

    goto :goto_3

    :cond_3
    const/4 v12, 0x0

    :goto_3
    if-eqz v9, :cond_5

    .line 107
    iget-boolean v13, v9, Ll/ۚ֫᩻;->᩷:Z

    if-eqz v13, :cond_5

    iget v13, v9, Ll/ۚ֫᩻;->ܳ:I

    add-int/2addr v13, v8

    if-eq v2, v13, :cond_4

    invoke-static {v5}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v13

    invoke-static {v13}, Ll/ۧ֫᩻;->᩷(I)Z

    move-result v13

    if-nez v13, :cond_4

    invoke-static {v5}, Ll/֫֫᩻;->ۚ(Ll/֫֫᩻;)I

    move-result v13

    iget v14, v9, Ll/ۚ֫᩻;->ۤ:I

    add-int/2addr v14, v8

    if-ne v13, v14, :cond_5

    add-int/lit8 v13, v2, -0x1

    .line 108
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֫֫᩻;

    invoke-static {v13}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v13

    const/16 v14, 0xf

    if-eq v13, v14, :cond_4

    if-ne v13, v8, :cond_5

    :cond_4
    const/4 v8, 0x1

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    .line 109
    :goto_4
    invoke-static {v5}, Ll/֫֫᩻;->֫(Ll/֫֫᩻;)Z

    move-result v13

    iget-object v14, v0, Ll/ۧ֫᩻;->ܶ:[I

    iget-object v15, v0, Ll/ۧ֫᩻;->ۧ:[I

    if-nez v13, :cond_7

    if-nez v8, :cond_6

    invoke-direct {v0, v2}, Ll/ۧ֫᩻;->ۙ(I)Z

    move-result v8

    if-eqz v8, :cond_7

    iget v8, v0, Ll/ۧ֫᩻;->᩷:I

    invoke-static {v5}, Ll/֫֫᩻;->᩸(Ll/֫֫᩻;)Ljava/lang/String;

    move-result-object v13

    .line 110
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    add-int/2addr v13, v8

    aget v8, v15, v2

    add-int/lit8 v8, v8, 0x1

    .line 164
    aget v8, v14, v8

    aget v16, v14, v2

    sub-int v8, v8, v16

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ll/֫֫᩻;

    invoke-static/range {v16 .. v16}, Ll/֫֫᩻;->᩸(Ll/֫֫᩻;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    sub-int v8, v8, v16

    add-int/2addr v8, v13

    const/16 v13, 0x64

    if-le v8, v13, :cond_7

    :cond_6
    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    const/4 v8, 0x0

    .line 111
    :goto_5
    invoke-static {v5}, Ll/֫֫᩻;->ᩴ(Ll/֫֫᩻;)I

    move-result v13

    move-object/from16 v16, v1

    iget-object v1, v0, Ll/ۧ֫᩻;->ܽ:Ljava/lang/String;

    if-ltz v13, :cond_d

    .line 112
    invoke-static {v5}, Ll/֫֫᩻;->ᩴ(Ll/֫֫᩻;)I

    move-result v8

    invoke-static {v3, v8, v7}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    const/16 v8, 0x43

    if-eqz p1, :cond_9

    if-eqz v2, :cond_8

    const/4 v13, 0x1

    if-ne v2, v13, :cond_9

    const/4 v13, 0x0

    .line 113
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֫֫᩻;

    invoke-static {v13}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v13

    if-eq v13, v8, :cond_8

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    move-object/from16 v18, v4

    move-object/from16 v17, v7

    goto :goto_9

    :cond_9
    :goto_6
    if-eqz v2, :cond_c

    const/4 v13, 0x1

    if-ne v2, v13, :cond_a

    const/4 v13, 0x0

    .line 114
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/֫֫᩻;

    invoke-static {v13}, Ll/֫֫᩻;->ܺ(Ll/֫֫᩻;)I

    move-result v13

    if-ne v13, v8, :cond_a

    goto :goto_7

    .line 115
    :cond_a
    invoke-static {v5}, Ll/֫֫᩻;->ܳ(Ll/֫֫᩻;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/4 v8, 0x2

    goto :goto_8

    :cond_b
    const/4 v8, 0x1

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v8, 0x0

    :goto_8
    new-instance v13, Ll/ܳ֫᩻;

    invoke-direct {v13, v6}, Ll/ܳ֫᩻;-><init>(Ll/᩻ۧ᩻;)V

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v18, v4

    const/4 v4, 0x1

    .line 114
    invoke-static {v3, v8, v4, v7, v13}, Ll/᩶۬ܶ;->ۙ(Ljava/lang/String;IZZLjava/lang/Runnable;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    .line 117
    :goto_9
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v0, v3, v8, v4}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    add-int/2addr v11, v12

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v11, :cond_10

    .line 169
    invoke-virtual {v6}, Ll/᩻ۧ᩻;->ۙ()V

    .line 170
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v0, v1, v8, v4}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    add-int/lit8 v3, v3, 0x1

    const/4 v8, 0x0

    goto :goto_a

    :cond_d
    move-object/from16 v18, v4

    move-object/from16 v17, v7

    .line 119
    invoke-static {v5}, Ll/֫֫᩻;->۫(Ll/֫֫᩻;)Z

    move-result v3

    if-nez v3, :cond_f

    if-eqz v8, :cond_e

    goto :goto_b

    .line 123
    :cond_e
    invoke-static {v5}, Ll/֫֫᩻;->᩸(Ll/֫֫᩻;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Ll/֫֫᩻;->᩸(Ll/֫֫᩻;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v3}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    goto :goto_d

    :cond_f
    :goto_b
    const/4 v3, 0x0

    .line 120
    iget-object v4, v0, Ll/ۧ֫᩻;->ᩴ:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    invoke-direct {v0, v4, v3, v7}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    add-int/2addr v11, v12

    const/4 v4, 0x0

    :goto_c
    if-ge v4, v11, :cond_10

    .line 169
    invoke-virtual {v6}, Ll/᩻ۧ᩻;->ۙ()V

    .line 170
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    invoke-direct {v0, v1, v3, v7}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x0

    goto :goto_c

    .line 172
    :cond_10
    iput v11, v0, Ll/ۧ֫᩻;->ۤ:I

    .line 125
    :goto_d
    iget-object v1, v0, Ll/ۧ֫᩻;->ܳ:[Ll/ۚ֫᩻;

    aget-object v1, v1, v2

    if-eqz v1, :cond_14

    .line 127
    iget-boolean v3, v1, Ll/ۚ֫᩻;->۫:Z

    if-eqz v9, :cond_11

    iget-boolean v4, v9, Ll/ۚ֫᩻;->۫:Z

    if-eqz v4, :cond_11

    const/4 v4, 0x1

    goto :goto_e

    :cond_11
    const/4 v4, 0x0

    :goto_e
    or-int/2addr v3, v4

    iput-boolean v3, v1, Ll/ۚ֫᩻;->۫:Z

    .line 129
    iget v3, v0, Ll/ۧ֫᩻;->ۤ:I

    invoke-static {v5}, Ll/֫֫᩻;->ۚ(Ll/֫֫᩻;)I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v1, Ll/ۚ֫᩻;->ᩴ:I

    .line 130
    iget-boolean v3, v1, Ll/ۚ֫᩻;->۫:Z

    if-nez v3, :cond_13

    iget v3, v1, Ll/ۚ֫᩻;->ۙ:I

    add-int/lit8 v4, v2, 0x1

    if-le v3, v4, :cond_13

    iget-boolean v4, v1, Ll/ۚ֫᩻;->᩸:Z

    if-nez v4, :cond_12

    iget v4, v0, Ll/ۧ֫᩻;->᩷:I

    aget v3, v15, v3

    add-int/lit8 v3, v3, 0x1

    .line 164
    aget v3, v14, v3

    aget v6, v14, v2

    sub-int/2addr v3, v6

    move-object/from16 v7, v18

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֫᩻;

    invoke-static {v6}, Ll/֫֫᩻;->᩸(Ll/֫֫᩻;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v3, v6

    add-int/2addr v3, v4

    const/16 v4, 0x64

    if-le v3, v4, :cond_13

    :cond_12
    const/4 v3, 0x1

    goto :goto_f

    :cond_13
    const/4 v3, 0x0

    .line 131
    :goto_f
    iput-boolean v3, v1, Ll/ۚ֫᩻;->᩷:Z

    .line 133
    :cond_14
    invoke-static {v5}, Ll/֫֫᩻;->ۤ(Ll/֫֫᩻;)I

    move-result v1

    if-eqz v1, :cond_15

    .line 134
    new-instance v1, Ll/۫֫᩻;

    invoke-static {v5}, Ll/֫֫᩻;->ۤ(Ll/֫֫᩻;)I

    move-result v3

    iget v4, v0, Ll/ۧ֫᩻;->ۤ:I

    invoke-static {v5}, Ll/֫֫᩻;->ۚ(Ll/֫֫᩻;)I

    move-result v6

    sub-int/2addr v4, v6

    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-direct {v1, v3, v4}, Ll/۫֫᩻;-><init>(II)V

    move-object/from16 v4, v16

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto :goto_10

    :cond_15
    move-object/from16 v4, v16

    .line 136
    :goto_10
    invoke-static {v5}, Ll/֫֫᩻;->᩻(Ll/֫֫᩻;)I

    move-result v1

    invoke-static {v5}, Ll/֫֫᩻;->᩷(Ll/֫֫᩻;)I

    move-result v3

    move-object/from16 v8, v17

    invoke-direct {v0, v8, v1, v3}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    .line 137
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫֫᩻;

    invoke-static {v1}, Ll/۫֫᩻;->ۙ(Ll/۫֫᩻;)I

    move-result v1

    invoke-static {v5}, Ll/֫֫᩻;->᩷(Ll/֫֫᩻;)I

    move-result v3

    if-ne v1, v3, :cond_16

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 138
    :cond_16
    invoke-static {v5}, Ll/֫֫᩻;->᩷(Ll/֫֫᩻;)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    move-object v1, v4

    goto/16 :goto_0

    :cond_17
    move-object v8, v7

    move-object v7, v4

    if-eqz p1, :cond_18

    .line 140
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {v0, v8, v3, v1}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    return-void

    .line 8
    :cond_18
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-static {v3, v1, v8}, Ll/ᩳۚۤ;->ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 142
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    .line 143
    new-instance v4, Ll/ܳ֫᩻;

    invoke-direct {v4, v6}, Ll/ܳ֫᩻;-><init>(Ll/᩻ۧ᩻;)V

    const/4 v5, 0x0

    .line 142
    invoke-static {v1, v2, v3, v5, v4}, Ll/᩶۬ܶ;->ۙ(Ljava/lang/String;IZZLjava/lang/Runnable;)Ljava/lang/String;

    move-result-object v1

    .line 144
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {v0, v1, v5, v2}, Ll/ۧ֫᩻;->ۙ(Ljava/lang/CharSequence;II)V

    return-void
.end method
