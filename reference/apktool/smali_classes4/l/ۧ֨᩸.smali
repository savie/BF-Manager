.class public final Ll/ۧ֨᩸;
.super Ljava/lang/Object;
.source "P7QH"

# interfaces
.implements Lbin/mt/plugin/api/editor/BufferedText;
.implements Ll/ۨܶۤ;


# instance fields
.field public ܰ:Ll/ᩳ۬᩸;

.field public final synthetic ܿ:Ll/᩻֨᩸;

.field public ᩶:Ll/᩻᩷ᩴ;


# direct methods
.method public constructor <init>(Ll/᩻֨᩸;)V
    .locals 1

    .line 410
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ֨᩸;->ܿ:Ll/᩻֨᩸;

    .line 411
    invoke-static {p1}, Ll/᩻֨᩸;->ۙ(Ll/᩻֨᩸;)Ll/᩺ۜ᩸;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ֨᩸;->ܰ:Ll/ᩳ۬᩸;

    .line 412
    new-instance v0, Ll/᩻᩷ᩴ;

    invoke-direct {v0, p1}, Ll/᩻᩷ᩴ;-><init>(Ll/ᩳ۬᩸;)V

    iput-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 541
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0, p1}, Ll/᩻᩷ᩴ;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final count(IIC)I
    .locals 1

    .line 508
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩷ᩴ;->count(IIC)I

    move-result p1

    return p1
.end method

.method public final findLineEnd(I)I
    .locals 2

    .line 518
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/16 v1, 0xa

    invoke-virtual {v0, v1, p1}, Ll/᩻᩷ᩴ;->indexOf(CI)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 520
    iget-object p1, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {p1}, Ll/᩻᩷ᩴ;->length()I

    move-result p1

    :cond_0
    return p1
.end method

.method public final findLineStart(I)I
    .locals 3

    .line 513
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/4 v1, 0x0

    const/16 v2, 0xa

    .line 116
    invoke-virtual {v0, v2, v1, p1}, Ll/᩻᩷ᩴ;->lastIndexOf(CII)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final getChars(II[CI)V
    .locals 1

    .line 536
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩻᩷ᩴ;->getChars(II[CI)V

    return-void
.end method

.method public final indexOf(C)I
    .locals 2

    .line 417
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/᩻᩷ᩴ;->indexOf(CI)I

    move-result p1

    return p1
.end method

.method public final indexOf(CI)I
    .locals 1

    .line 422
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/᩻᩷ᩴ;->indexOf(CI)I

    move-result p1

    return p1
.end method

.method public final indexOf(CII)I
    .locals 1

    .line 427
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩷ᩴ;->indexOf(CII)I

    move-result p1

    return p1
.end method

.method public final indexOf(Ljava/lang/String;)I
    .locals 2

    .line 432
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 433
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {v0, p1, v1}, Ll/᩻᩷ᩴ;->indexOf(CI)I

    move-result p1

    return p1

    .line 435
    :cond_0
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result p1

    return p1
.end method

.method public final indexOf(Ljava/lang/String;I)I
    .locals 2

    .line 440
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 441
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {v0, p1, p2}, Ll/᩻᩷ᩴ;->indexOf(CI)I

    move-result p1

    return p1

    .line 443
    :cond_0
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method

.method public final indexOf(Ljava/lang/String;II)I
    .locals 2

    .line 448
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 449
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩷ᩴ;->indexOf(CII)I

    move-result p1

    return p1

    .line 451
    :cond_0
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-static {v0, p1, p2, p3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(C)I
    .locals 3

    .line 456
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0}, Ll/᩻᩷ᩴ;->length()I

    move-result v1

    const/4 v2, 0x0

    .line 116
    invoke-virtual {v0, p1, v2, v1}, Ll/᩻᩷ᩴ;->lastIndexOf(CII)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(CI)I
    .locals 2

    .line 461
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    add-int/lit8 p2, p2, 0x1

    const/4 v1, 0x0

    .line 116
    invoke-virtual {v0, p1, v1, p2}, Ll/᩻᩷ᩴ;->lastIndexOf(CII)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(CII)I
    .locals 1

    .line 466
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩷ᩴ;->lastIndexOf(CII)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/String;)I
    .locals 3

    .line 471
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 472
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    iget-object v1, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v1}, Ll/᩻᩷ᩴ;->length()I

    move-result v1

    .line 116
    invoke-virtual {v0, p1, v2, v1}, Ll/᩻᩷ᩴ;->lastIndexOf(CII)I

    move-result p1

    return p1

    .line 474
    :cond_0
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0}, Ll/᩻᩷ᩴ;->length()I

    move-result v1

    .line 36
    invoke-static {v0, p1, v2, v1}, Ll/ܽۚܺ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/String;I)I
    .locals 3

    .line 479
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 480
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    add-int/2addr p2, v2

    .line 116
    invoke-virtual {v0, p1, v1, p2}, Ll/᩻᩷ᩴ;->lastIndexOf(CII)I

    move-result p1

    return p1

    .line 482
    :cond_0
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    add-int/2addr p2, v2

    .line 36
    invoke-static {v0, p1, v1, p2}, Ll/ܽۚܺ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/String;II)I
    .locals 2

    .line 487
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 488
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {v0, p1, p2, p3}, Ll/᩻᩷ᩴ;->lastIndexOf(CII)I

    move-result p1

    return p1

    .line 490
    :cond_0
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-static {v0, p1, p2, p3}, Ll/ܽۚܺ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 546
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0}, Ll/᩻᩷ᩴ;->length()I

    move-result v0

    return v0
.end method

.method public final matcher(Lbin/mt/plugin/api/regex/Pattern;)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 526
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/regex/Matcher;

    move-result-object p1

    return-object p1
.end method

.method public final matcher(Ljava/lang/String;)Lbin/mt/plugin/api/regex/Matcher;
    .locals 1

    .line 531
    invoke-static {p1}, Ll/ܿܶۤ;->ۙ(Ljava/lang/String;)Ll/ܿܶۤ;

    move-result-object p1

    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {p1, v0}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object p1

    return-object p1
.end method

.method public final reset()V
    .locals 2

    .line 495
    iget-object v0, p0, Ll/ۧ֨᩸;->ܿ:Ll/᩻֨᩸;

    invoke-static {v0}, Ll/᩻֨᩸;->ۤ(Ll/᩻֨᩸;)V

    .line 496
    invoke-static {v0}, Ll/᩻֨᩸;->ۙ(Ll/᩻֨᩸;)Ll/᩺ۜ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 497
    iget-object v1, p0, Ll/ۧ֨᩸;->ܰ:Ll/ᩳ۬᩸;

    if-eq v0, v1, :cond_0

    .line 499
    new-instance v1, Ll/᩻᩷ᩴ;

    invoke-direct {v1, v0}, Ll/᩻᩷ᩴ;-><init>(Ll/ᩳ۬᩸;)V

    iput-object v1, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    .line 500
    iput-object v0, p0, Ll/ۧ֨᩸;->ܰ:Ll/ᩳ۬᩸;

    return-void

    .line 502
    :cond_0
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0}, Ll/᩻᩷ᩴ;->reset()V

    return-void
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 552
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/᩻᩷ᩴ;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 546
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    invoke-virtual {v0}, Ll/᩻᩷ᩴ;->length()I

    move-result v0

    .line 552
    iget-object v1, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ll/᩻᩷ᩴ;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    .line 558
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()Ljava/lang/CharSequence;
    .locals 1

    .line 563
    iget-object v0, p0, Ll/ۧ֨᩸;->᩶:Ll/᩻᩷ᩴ;

    return-object v0
.end method
