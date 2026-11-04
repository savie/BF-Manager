.class public final Ll/ۤۨۨ;
.super Ljava/io/Reader;
.source "B2YE"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x33aef9076e3a9d04L


# instance fields
.field public ֡:I

.field public final ܰ:Ljava/lang/CharSequence;

.field public ܿ:I

.field public final ᩶:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 138
    :goto_0
    iput-object p1, p0, Ll/ۤۨۨ;->ܰ:Ljava/lang/CharSequence;

    const p1, 0x7fffffff

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۤۨۨ;->᩶:Ljava/lang/Integer;

    const/4 p1, 0x0

    .line 142
    iput p1, p0, Ll/ۤۨۨ;->ܿ:I

    .line 143
    iput p1, p0, Ll/ۤۨۨ;->֡:I

    return-void
.end method

.method private ۙ()I
    .locals 2

    .line 165
    iget-object v0, p0, Ll/ۤۨۨ;->ܰ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/ۤۨۨ;->᩶:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const v1, 0x7fffffff

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 151
    iput v0, p0, Ll/ۤۨۨ;->ܿ:I

    .line 152
    iput v0, p0, Ll/ۤۨۨ;->֡:I

    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 175
    iget p1, p0, Ll/ۤۨۨ;->ܿ:I

    iput p1, p0, Ll/ۤۨۨ;->֡:I

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 2

    .line 196
    iget v0, p0, Ll/ۤۨۨ;->ܿ:I

    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 199
    :cond_0
    iget v0, p0, Ll/ۤۨۨ;->ܿ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۤۨۨ;->ܿ:I

    iget-object v1, p0, Ll/ۤۨۨ;->ܰ:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    return v0
.end method

.method public final read([CII)I
    .locals 5

    .line 214
    invoke-static {p1, p2, p3}, Ll/ۙ᩵ۨ;->ۙ([CII)V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 218
    :cond_0
    iget v1, p0, Ll/ۤۨۨ;->ܿ:I

    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v2

    const/4 v3, -0x1

    if-lt v1, v2, :cond_1

    return v3

    .line 222
    :cond_1
    iget-object v1, p0, Ll/ۤۨۨ;->ܰ:Ljava/lang/CharSequence;

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 223
    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v0

    iget v2, p0, Ll/ۤۨۨ;->ܿ:I

    sub-int/2addr v0, v2

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 224
    check-cast v1, Ljava/lang/String;

    iget v0, p0, Ll/ۤۨۨ;->ܿ:I

    add-int v2, v0, p3

    invoke-virtual {v1, v0, v2, p1, p2}, Ljava/lang/String;->getChars(II[CI)V

    .line 225
    iget p1, p0, Ll/ۤۨۨ;->ܿ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۤۨۨ;->ܿ:I

    return p3

    .line 228
    :cond_2
    instance-of v2, v1, Ljava/lang/StringBuilder;

    if-eqz v2, :cond_3

    .line 229
    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v0

    iget v2, p0, Ll/ۤۨۨ;->ܿ:I

    sub-int/2addr v0, v2

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 230
    check-cast v1, Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۤۨۨ;->ܿ:I

    add-int v2, v0, p3

    invoke-virtual {v1, v0, v2, p1, p2}, Ljava/lang/StringBuilder;->getChars(II[CI)V

    .line 231
    iget p1, p0, Ll/ۤۨۨ;->ܿ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۤۨۨ;->ܿ:I

    return p3

    .line 234
    :cond_3
    instance-of v2, v1, Ljava/lang/StringBuffer;

    if-eqz v2, :cond_4

    .line 235
    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v0

    iget v2, p0, Ll/ۤۨۨ;->ܿ:I

    sub-int/2addr v0, v2

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 236
    check-cast v1, Ljava/lang/StringBuffer;

    iget v0, p0, Ll/ۤۨۨ;->ܿ:I

    add-int v2, v0, p3

    invoke-virtual {v1, v0, v2, p1, p2}, Ljava/lang/StringBuffer;->getChars(II[CI)V

    .line 237
    iget p1, p0, Ll/ۤۨۨ;->ܿ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۤۨۨ;->ܿ:I

    return p3

    :cond_4
    const/4 v1, 0x0

    :goto_0
    if-ge v0, p3, :cond_6

    .line 243
    invoke-virtual {p0}, Ll/ۤۨۨ;->read()I

    move-result v2

    if-ne v2, v3, :cond_5

    goto :goto_1

    :cond_5
    add-int v4, p2, v0

    int-to-char v2, v2

    .line 247
    aput-char v2, p1, v4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v1
.end method

.method public final ready()Z
    .locals 2

    .line 260
    iget v0, p0, Ll/ۤۨۨ;->ܿ:I

    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final reset()V
    .locals 1

    .line 269
    iget v0, p0, Ll/ۤۨۨ;->֡:I

    iput v0, p0, Ll/ۤۨۨ;->ܿ:I

    return-void
.end method

.method public final skip(J)J
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 283
    iget v2, p0, Ll/ۤۨۨ;->ܿ:I

    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v3

    if-lt v2, v3, :cond_0

    return-wide v0

    .line 286
    :cond_0
    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v0

    int-to-long v0, v0

    iget v2, p0, Ll/ۤۨۨ;->ܿ:I

    int-to-long v2, v2

    add-long/2addr v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    .line 287
    iget p1, p0, Ll/ۤۨۨ;->ܿ:I

    sub-int p1, p2, p1

    .line 288
    iput p2, p0, Ll/ۤۨۨ;->ܿ:I

    int-to-long p1, p1

    return-wide p1

    .line 281
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Number of characters to skip is less than zero: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/᩻ۗ᩹;->ۙ(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 281
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 298
    iget-object v0, p0, Ll/ۤۨۨ;->ܰ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 309
    invoke-direct {p0}, Ll/ۤۨۨ;->ۙ()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
