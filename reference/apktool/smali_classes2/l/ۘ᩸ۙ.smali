.class public final Ll/ۘ᩸ۙ;
.super Ljava/lang/Object;
.source "RB0P"


# instance fields
.field public ۙ:I

.field public ۤ:Ll/ۖ᩸ۙ;

.field public ܳ:I

.field public final ᩴ:Ll/ۖ᩸ۙ;

.field public ᩷:Ll/ۖ᩸ۙ;

.field public ᩸:I


# direct methods
.method public constructor <init>(Ll/ۖ᩸ۙ;)V
    .locals 1

    .line 643
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 604
    iput v0, p0, Ll/ۘ᩸ۙ;->ܳ:I

    .line 644
    iput-object p1, p0, Ll/ۘ᩸ۙ;->ᩴ:Ll/ۖ᩸ۙ;

    .line 645
    iput-object p1, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    return-void
.end method

.method private ᩴ()Z
    .locals 3

    .line 736
    iget-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    invoke-virtual {v0}, Ll/ۖ᩸ۙ;->ۙ()Ll/ۙᩴۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙᩴۙ;->۫()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 740
    :cond_0
    iget v0, p0, Ll/ۘ᩸ۙ;->᩸:I

    const v2, 0xfe0f

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private ᩸()V
    .locals 1

    const/4 v0, 0x1

    .line 703
    iput v0, p0, Ll/ۘ᩸ۙ;->ܳ:I

    .line 704
    iget-object v0, p0, Ll/ۘ᩸ۙ;->ᩴ:Ll/ۖ᩸ۙ;

    iput-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    const/4 v0, 0x0

    .line 705
    iput v0, p0, Ll/ۘ᩸ۙ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final ۙ(I)I
    .locals 4

    .line 653
    iget-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    invoke-virtual {v0, p1}, Ll/ۖ᩸ۙ;->ۙ(I)Ll/ۖ᩸ۙ;

    move-result-object v0

    .line 654
    iget v1, p0, Ll/ۘ᩸ۙ;->ܳ:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    if-nez v0, :cond_0

    .line 687
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->᩸()V

    goto :goto_2

    .line 689
    :cond_0
    iput v3, p0, Ll/ۘ᩸ۙ;->ܳ:I

    .line 690
    iput-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    .line 691
    iput v2, p0, Ll/ۘ᩸ۙ;->ۙ:I

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 657
    iput-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    .line 658
    iget v0, p0, Ll/ۘ᩸ۙ;->ۙ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۘ᩸ۙ;->ۙ:I

    goto :goto_0

    :cond_2
    const v0, 0xfe0e

    if-ne p1, v0, :cond_3

    .line 662
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->᩸()V

    goto :goto_2

    :cond_3
    const v0, 0xfe0f

    if-ne p1, v0, :cond_4

    :goto_0
    const/4 v2, 0x2

    goto :goto_2

    .line 665
    :cond_4
    iget-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    invoke-virtual {v0}, Ll/ۖ᩸ۙ;->ۙ()Ll/ۙᩴۙ;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 666
    iget v0, p0, Ll/ۘ᩸ۙ;->ۙ:I

    if-ne v0, v2, :cond_6

    .line 667
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 668
    iget-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    iput-object v0, p0, Ll/ۘ᩸ۙ;->ۤ:Ll/ۖ᩸ۙ;

    .line 670
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->᩸()V

    goto :goto_1

    .line 672
    :cond_5
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->᩸()V

    goto :goto_2

    .line 675
    :cond_6
    iget-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    iput-object v0, p0, Ll/ۘ᩸ۙ;->ۤ:Ll/ۖ᩸ۙ;

    .line 677
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->᩸()V

    :goto_1
    const/4 v2, 0x3

    goto :goto_2

    .line 680
    :cond_7
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->᩸()V

    .line 697
    :goto_2
    iput p1, p0, Ll/ۘ᩸ۙ;->᩸:I

    return v2
.end method

.method public final ۙ()Ll/ۙᩴۙ;
    .locals 1

    .line 720
    iget-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    invoke-virtual {v0}, Ll/ۖ᩸ۙ;->ۙ()Ll/ۙᩴۙ;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ()Z
    .locals 2

    .line 731
    iget v0, p0, Ll/ۘ᩸ۙ;->ܳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll/ۘ᩸ۙ;->᩷:Ll/ۖ᩸ۙ;

    invoke-virtual {v0}, Ll/ۖ᩸ۙ;->ۙ()Ll/ۙᩴۙ;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۘ᩸ۙ;->ۙ:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 732
    invoke-direct {p0}, Ll/ۘ᩸ۙ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ll/ۙᩴۙ;
    .locals 1

    .line 713
    iget-object v0, p0, Ll/ۘ᩸ۙ;->ۤ:Ll/ۖ᩸ۙ;

    invoke-virtual {v0}, Ll/ۖ᩸ۙ;->ۙ()Ll/ۙᩴۙ;

    move-result-object v0

    return-object v0
.end method
