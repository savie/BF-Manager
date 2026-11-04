.class public final Ll/ۖ۫᩻;
.super Ljava/lang/Object;
.source "M6OO"


# instance fields
.field public ֫:I

.field public ۙ:Z

.field public final ۚ:I

.field public final ۤ:I

.field public ۫:Z

.field public ܳ:I

.field public ᩴ:[I

.field public ᩷:I

.field public final ᩸:I


# direct methods
.method public constructor <init>(ILl/۟ܺۨ;)V
    .locals 2

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 15
    iput v0, p0, Ll/ۖ۫᩻;->֫:I

    .line 16
    iput v0, p0, Ll/ۖ۫᩻;->᩷:I

    .line 23
    iput p1, p0, Ll/ۖ۫᩻;->ۤ:I

    .line 115
    iget-object v1, p2, Ll/ۖܺۨ;->᩷:Ll/۟ܺۨ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1}, Ll/ۖܺۨ;->᩷()I

    move-result v0

    :goto_0
    iput v0, p0, Ll/ۖ۫᩻;->᩸:I

    .line 322
    iget-object v0, p2, Ll/۟ܺۨ;->᩸:Ll/۠ܺۨ;

    .line 25
    invoke-interface {v0}, Ll/۠ܺۨ;->ۤ()I

    move-result v0

    iput v0, p0, Ll/ۖ۫᩻;->ۚ:I

    const/16 v0, 0x39

    if-ne p1, v0, :cond_1

    .line 115
    iget-object p1, p2, Ll/ۖܺۨ;->᩷:Ll/۟ܺۨ;

    .line 27
    instance-of p1, p1, Ll/ܳܳ᩻;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Ll/ۖ۫᩻;->۫:Z

    return-void
.end method


# virtual methods
.method public final ۙ(I)I
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۖ۫᩻;->ᩴ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۙ(ILjava/util/List;)I
    .locals 2

    const/4 v0, 0x0

    .line 60
    :goto_0
    iget v1, p0, Ll/ۖ۫᩻;->ܳ:I

    if-ge v0, v1, :cond_1

    .line 61
    iget-object v1, p0, Ll/ۖ۫᩻;->ᩴ:[I

    aget v1, v1, v0

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܺۨ;

    invoke-interface {v1}, Ll/۠ܺۨ;->getType()I

    move-result v1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Ll/ۖ۫᩻;->ᩴ:[I

    aget p1, p1, v0

    return p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ۙ(Ll/۠ܺۨ;)V
    .locals 8

    .line 31
    invoke-interface {p1}, Ll/۠ܺۨ;->getType()I

    move-result v0

    const/4 v1, 0x1

    .line 32
    iget v2, p0, Ll/ۖ۫᩻;->ۤ:I

    if-eq v2, v1, :cond_6

    const/16 v1, 0x88

    const/16 v3, 0x12

    if-eq v2, v3, :cond_5

    const/16 v4, 0x19

    if-eq v2, v4, :cond_4

    const/16 v4, 0x1e

    const/16 v5, 0x5e

    if-eq v2, v4, :cond_3

    const/16 v4, 0x22

    const/16 v6, 0x5b

    const/16 v7, 0x5c

    if-eq v2, v4, :cond_2

    const/16 v4, 0x29

    if-eq v2, v4, :cond_1

    const/16 v4, 0x2f

    if-eq v2, v4, :cond_3

    const/16 v4, 0x36

    if-eq v2, v4, :cond_0

    const/16 v4, 0x40

    if-eq v2, v4, :cond_5

    const/16 v4, 0x8

    if-eq v2, v4, :cond_3

    const/16 v4, 0x9

    if-eq v2, v4, :cond_3

    const/16 v4, 0xe

    if-eq v2, v4, :cond_3

    const/16 v4, 0xf

    if-eq v2, v4, :cond_5

    const/16 v4, 0x32

    if-eq v2, v4, :cond_3

    const/16 v4, 0x33

    if-eq v2, v4, :cond_3

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    packed-switch v2, :pswitch_data_2

    goto/16 :goto_2

    :pswitch_0
    if-eq v0, v6, :cond_7

    if-ne v0, v7, :cond_a

    goto :goto_0

    :pswitch_1
    const/16 v1, 0x11

    if-eq v0, v1, :cond_7

    const/16 v1, 0x26

    if-ne v0, v1, :cond_a

    goto :goto_0

    :pswitch_2
    if-ne v0, v3, :cond_a

    goto :goto_0

    :cond_0
    :pswitch_3
    if-ne v0, v7, :cond_a

    goto :goto_0

    :cond_1
    :pswitch_4
    if-eq v0, v1, :cond_7

    const/16 v1, 0x5f

    if-ne v0, v1, :cond_a

    goto :goto_0

    :cond_2
    const/16 v1, 0x2b

    if-eq v0, v1, :cond_7

    if-eq v0, v6, :cond_7

    if-eq v0, v7, :cond_7

    if-ne v0, v5, :cond_a

    goto :goto_0

    :cond_3
    :pswitch_5
    if-ne v0, v5, :cond_a

    goto :goto_0

    :cond_4
    const/16 v1, 0xa

    if-eq v0, v1, :cond_7

    const/16 v1, 0x15

    if-ne v0, v1, :cond_a

    goto :goto_0

    :cond_5
    :pswitch_6
    if-eq v0, v1, :cond_7

    const/16 v1, 0x85

    if-ne v0, v1, :cond_a

    goto :goto_0

    :cond_6
    const/16 v1, 0x5d

    if-ne v0, v1, :cond_a

    .line 52
    :cond_7
    :goto_0
    :pswitch_7
    iget-object v0, p0, Ll/ۖ۫᩻;->ᩴ:[I

    const/4 v1, 0x2

    if-nez v0, :cond_8

    new-array v0, v1, [I

    iput-object v0, p0, Ll/ۖ۫᩻;->ᩴ:[I

    goto :goto_1

    .line 53
    :cond_8
    iget v1, p0, Ll/ۖ۫᩻;->ܳ:I

    array-length v2, v0

    if-ne v1, v2, :cond_9

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۖ۫᩻;->ᩴ:[I

    .line 54
    :cond_9
    :goto_1
    iget-object v0, p0, Ll/ۖ۫᩻;->ᩴ:[I

    iget v1, p0, Ll/ۖ۫᩻;->ܳ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۖ۫᩻;->ܳ:I

    invoke-interface {p1}, Ll/۠ܺۨ;->ۤ()I

    move-result p1

    aput p1, v0, v1

    :cond_a
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3a
        :pswitch_4
        :pswitch_7
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x42
        :pswitch_5
        :pswitch_6
        :pswitch_3
    .end packed-switch
.end method
