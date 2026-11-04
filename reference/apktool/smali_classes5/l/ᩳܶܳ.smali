.class public final Ll/ᩳܶܳ;
.super Ljava/lang/Object;
.source "66CT"


# instance fields
.field public final ۙ:[Ll/۟ܶܳ;

.field public final ۤ:[I

.field public final ᩷:[I

.field public final ᩸:[Z


# direct methods
.method public constructor <init>([I[Ljava/lang/String;[Z)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_3

    array-length v0, p1

    array-length v1, p3

    if-ne v0, v1, :cond_3

    .line 17
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Ll/ᩳܶܳ;->ۤ:[I

    .line 18
    invoke-virtual {p3}, [Z->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Z

    iput-object p3, p0, Ll/ᩳܶܳ;->᩸:[Z

    .line 19
    array-length p3, p1

    new-array p3, p3, [I

    iput-object p3, p0, Ll/ᩳܶܳ;->᩷:[I

    .line 20
    array-length p3, p1

    new-array p3, p3, [Ll/۟ܶܳ;

    iput-object p3, p0, Ll/ᩳܶܳ;->ۙ:[Ll/۟ܶܳ;

    const/4 p3, 0x0

    .line 21
    :goto_0
    array-length v0, p1

    if-ge p3, v0, :cond_2

    .line 22
    aget v0, p1, p3

    const/4 v1, -0x1

    if-lt v0, v1, :cond_1

    if-ge v0, p3, :cond_1

    .line 23
    iget-object v1, p0, Ll/ᩳܶܳ;->᩷:[I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    aget v0, v1, v0

    add-int/lit8 v0, v0, 0x1

    :goto_1
    aput v0, v1, p3

    .line 24
    iget-object v0, p0, Ll/ᩳܶܳ;->ۙ:[Ll/۟ܶܳ;

    aget-object v1, p2, p3

    invoke-static {v1}, Ll/۟ܶܳ;->ۙ(Ljava/lang/String;)Ll/۟ܶܳ;

    move-result-object v1

    aput-object v1, v0, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 22
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid parent index"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void

    .line 16
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Mismatched node arrays"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ۙ(I)Ljava/util/ArrayList;
    .locals 5

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    add-int/lit8 v1, p1, 0x1

    .line 45
    :goto_0
    iget-object v2, p0, Ll/ᩳܶܳ;->ۤ:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Ll/ᩳܶܳ;->᩷:[I

    aget v4, v3, v1

    aget v3, v3, p1

    if-le v4, v3, :cond_1

    .line 46
    aget v2, v2, v1

    if-ne v2, p1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method
