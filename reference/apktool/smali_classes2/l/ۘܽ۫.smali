.class public final Ll/ۘܽ۫;
.super Ljava/lang/Object;
.source "195F"


# instance fields
.field public ۙ:I

.field public ۤ:Ljava/lang/String;

.field public ᩷:I

.field public ᩸:I


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 6

    .line 1748
    iget-object v0, p0, Ll/ۘܽ۫;->ۤ:Ljava/lang/String;

    const-string v1, "\n"

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "\r\n"

    .line 1768
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "\r"

    if-eqz v3, :cond_1

    .line 1769
    iget v3, p0, Ll/ۘܽ۫;->᩷:I

    goto :goto_0

    .line 1770
    :cond_1
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1771
    iget v3, p0, Ll/ۘܽ۫;->ۙ:I

    goto :goto_0

    .line 1773
    :cond_2
    iget v3, p0, Ll/ۘܽ۫;->᩸:I

    .line 1753
    :goto_0
    iget v5, p0, Ll/ۘܽ۫;->᩸:I

    if-le v5, v3, :cond_3

    move-object v0, v1

    move v3, v5

    .line 1757
    :cond_3
    iget v1, p0, Ll/ۘܽ۫;->᩷:I

    if-le v1, v3, :cond_4

    move v3, v1

    goto :goto_1

    :cond_4
    move-object v2, v0

    .line 1761
    :goto_1
    iget v0, p0, Ll/ۘܽ۫;->ۙ:I

    if-le v0, v3, :cond_5

    return-object v4

    :cond_5
    return-object v2
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 1735
    iget-object v0, p0, Ll/ۘܽ۫;->ۤ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1736
    iput-object p1, p0, Ll/ۘܽ۫;->ۤ:Ljava/lang/String;

    :cond_0
    const-string v0, "\r\n"

    .line 1738
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1739
    iget p1, p0, Ll/ۘܽ۫;->᩷:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۘܽ۫;->᩷:I

    return-void

    :cond_1
    const-string v0, "\r"

    .line 1740
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1741
    iget p1, p0, Ll/ۘܽ۫;->ۙ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۘܽ۫;->ۙ:I

    return-void

    .line 1743
    :cond_2
    iget p1, p0, Ll/ۘܽ۫;->᩸:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۘܽ۫;->᩸:I

    return-void
.end method
