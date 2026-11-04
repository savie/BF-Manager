.class public final Ll/᩹᩹ܳ;
.super Ljava/lang/Object;
.source "AIU7"


# instance fields
.field public final ۙ:[I

.field public final ۤ:[I

.field public final ۫:Ljava/util/ArrayList;

.field public final ܳ:[I

.field public final ᩴ:[I

.field public final ᩷:Ljava/util/BitSet;

.field public final ᩸:[I


# direct methods
.method public constructor <init>([I)V
    .locals 7

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩹᩹ܳ;->۫:Ljava/util/ArrayList;

    .line 16
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p0, Ll/᩹᩹ܳ;->᩷:Ljava/util/BitSet;

    .line 19
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Ll/᩹᩹ܳ;->ܳ:[I

    .line 20
    array-length v0, p1

    new-array v0, v0, [I

    iput-object v0, p0, Ll/᩹᩹ܳ;->ۤ:[I

    .line 21
    array-length v0, p1

    new-array v0, v0, [I

    iput-object v0, p0, Ll/᩹᩹ܳ;->᩸:[I

    .line 22
    array-length v0, p1

    new-array v0, v0, [I

    iput-object v0, p0, Ll/᩹᩹ܳ;->ۙ:[I

    .line 23
    array-length v0, p1

    new-array v0, v0, [I

    iput-object v0, p0, Ll/᩹᩹ܳ;->ᩴ:[I

    .line 24
    array-length v0, p1

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 25
    :goto_0
    array-length v2, p1

    const/4 v3, 0x1

    if-ge v1, v2, :cond_3

    .line 26
    aget v2, p1, v1

    const/4 v4, -0x1

    if-lt v2, v4, :cond_2

    if-ge v2, v1, :cond_2

    .line 27
    iget-object v4, p0, Ll/᩹᩹ܳ;->ۤ:[I

    if-gez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    aget v2, v4, v2

    add-int/2addr v2, v3

    :goto_1
    aput v2, v4, v1

    .line 28
    aget v2, p1, v1

    if-ltz v2, :cond_1

    .line 29
    aget v4, v0, v2

    add-int/2addr v4, v3

    aput v4, v0, v2

    .line 30
    iget-object v2, p0, Ll/᩹᩹ܳ;->ᩴ:[I

    aget v3, p1, v1

    aput v1, v2, v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 26
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid parent index"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 v1, 0x0

    .line 34
    :goto_2
    array-length v2, p1

    if-ge v1, v2, :cond_7

    .line 35
    aget v2, p1, v1

    if-gez v2, :cond_4

    goto :goto_4

    .line 37
    :cond_4
    iget-object v4, p0, Ll/᩹᩹ܳ;->᩸:[I

    aget v5, v4, v2

    aget v6, v0, v2

    if-le v6, v3, :cond_5

    const/4 v6, 0x1

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    add-int/2addr v5, v6

    const/4 v6, 0x7

    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    aput v5, v4, v1

    .line 38
    iget-object v4, p0, Ll/᩹᩹ܳ;->ۙ:[I

    aget v5, v4, v2

    aput v5, v4, v1

    .line 39
    aget v4, p1, v2

    if-ltz v4, :cond_6

    .line 40
    iget-object v5, p0, Ll/᩹᩹ܳ;->᩸:[I

    aget v6, v5, v2

    aget v5, v5, v4

    if-le v6, v5, :cond_6

    invoke-virtual {p0, v2}, Ll/᩹᩹ܳ;->᩷(I)Z

    move-result v2

    if-nez v2, :cond_6

    .line 41
    iget-object v2, p0, Ll/᩹᩹ܳ;->ۙ:[I

    aget v5, v2, v1

    iget-object v6, p0, Ll/᩹᩹ܳ;->᩸:[I

    aget v4, v6, v4

    shl-int v4, v3, v4

    or-int/2addr v4, v5

    aput v4, v2, v1

    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 44
    :cond_7
    invoke-direct {p0}, Ll/᩹᩹ܳ;->ۙ()V

    return-void
.end method

.method private ۙ()V
    .locals 5

    .line 79
    iget-object v0, p0, Ll/᩹᩹ܳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    .line 81
    :goto_0
    iget-object v3, p0, Ll/᩹᩹ܳ;->ܳ:[I

    array-length v3, v3

    if-ge v1, v3, :cond_2

    .line 82
    iget-object v3, p0, Ll/᩹᩹ܳ;->ۤ:[I

    aget v4, v3, v1

    if-le v4, v2, :cond_0

    goto :goto_1

    .line 84
    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object v2, p0, Ll/᩹᩹ܳ;->᩷:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_1

    aget v2, v3, v1

    goto :goto_1

    :cond_1
    const v2, 0x7fffffff

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ۙ(I)Z
    .locals 1

    .line 56
    iget-object v0, p0, Ll/᩹᩹ܳ;->᩷:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method

.method public final ۤ(I)V
    .locals 2

    .line 74
    iget-object v0, p0, Ll/᩹᩹ܳ;->ܳ:[I

    aget p1, v0, p1

    :goto_0
    if-ltz p1, :cond_0

    iget-object v1, p0, Ll/᩹᩹ܳ;->᩷:Ljava/util/BitSet;

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->clear(I)V

    aget p1, v0, p1

    goto :goto_0

    .line 75
    :cond_0
    invoke-direct {p0}, Ll/᩹᩹ܳ;->ۙ()V

    return-void
.end method

.method public final ᩷(I)Z
    .locals 2

    .line 52
    iget-object v0, p0, Ll/᩹᩹ܳ;->ܳ:[I

    aget v0, v0, p1

    if-ltz v0, :cond_1

    iget-object v1, p0, Ll/᩹᩹ܳ;->ᩴ:[I

    aget v0, v1, v0

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ᩸(I)V
    .locals 5

    add-int/lit8 v0, p1, 0x1

    .line 48
    iget-object v1, p0, Ll/᩹᩹ܳ;->ܳ:[I

    array-length v2, v1

    if-ge v0, v2, :cond_3

    aget v2, v1, v0

    if-ne v2, p1, :cond_3

    .line 61
    iget-object v2, p0, Ll/᩹᩹ܳ;->᩷:Ljava/util/BitSet;

    invoke-virtual {v2, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 62
    invoke-virtual {v2, p1}, Ljava/util/BitSet;->clear(I)V

    goto :goto_1

    .line 64
    :cond_0
    invoke-virtual {v2, p1}, Ljava/util/BitSet;->set(I)V

    .line 66
    :goto_0
    array-length v3, v1

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Ll/᩹᩹ܳ;->ۤ:[I

    aget v4, v3, v0

    aget v3, v3, p1

    if-le v4, v3, :cond_2

    add-int/lit8 v3, v0, 0x1

    .line 48
    array-length v4, v1

    if-ge v3, v4, :cond_1

    aget v4, v1, v3

    if-ne v4, v0, :cond_1

    .line 67
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->set(I)V

    :cond_1
    move v0, v3

    goto :goto_0

    .line 69
    :cond_2
    :goto_1
    invoke-direct {p0}, Ll/᩹᩹ܳ;->ۙ()V

    :cond_3
    return-void
.end method
