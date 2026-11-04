.class public final Ll/ۨۧ᩵;
.super Ljava/lang/Object;
.source "74MB"


# static fields
.field public static final ۤ:Ll/ۨۧ᩵;

.field public static final synthetic ᩷:I


# instance fields
.field public final ۙ:Ll/ۡۘۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 17
    new-instance v0, Ll/ۨۧ᩵;

    new-instance v1, Ll/ۛۘۗ;

    invoke-direct {v1}, Ll/ۛۘۗ;-><init>()V

    invoke-direct {v0, v1}, Ll/ۨۧ᩵;-><init>(Ll/ۛۘۗ;)V

    sput-object v0, Ll/ۨۧ᩵;->ۤ:Ll/ۨۧ᩵;

    return-void
.end method

.method public constructor <init>(Ll/ۛۘۗ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Ll/ۛۘۗ;->ۗ()Ll/ۡۘۗ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۧ᩵;->ۙ:Ll/ۡۘۗ;

    return-void
.end method

.method public static ۙ(D)Ljava/lang/String;
    .locals 3

    .line 497
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Double.NaN"

    return-object p0

    :cond_0
    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    cmpl-double v2, p0, v0

    if-nez v2, :cond_1

    const-string p0, "Double.NEGATIVE_INFINITY"

    return-object p0

    :cond_1
    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    cmpl-double v2, p0, v0

    if-nez v2, :cond_2

    const-string p0, "Double.POSITIVE_INFINITY"

    return-object p0

    :cond_2
    const-wide/16 v0, 0x1

    cmpl-double v2, p0, v0

    if-nez v2, :cond_3

    const-string p0, "Double.MIN_VALUE"

    return-object p0

    :cond_3
    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpl-double v2, p0, v0

    if-nez v2, :cond_4

    const-string p0, "Double.MAX_VALUE"

    return-object p0

    :cond_4
    const-wide/high16 v0, 0x10000000000000L

    cmpl-double v2, p0, v0

    if-nez v2, :cond_5

    const-string p0, "Double.MIN_NORMAL"

    return-object p0

    .line 515
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x64

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(F)Ljava/lang/String;
    .locals 1

    .line 519
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Float.NaN"

    return-object p0

    :cond_0
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    cmpl-float v0, p0, v0

    if-nez v0, :cond_1

    const-string p0, "Float.NEGATIVE_INFINITY"

    return-object p0

    :cond_1
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpl-float v0, p0, v0

    if-nez v0, :cond_2

    const-string p0, "Float.POSITIVE_INFINITY"

    return-object p0

    :cond_2
    const/4 v0, 0x1

    cmpl-float v0, p0, v0

    if-nez v0, :cond_3

    const-string p0, "Float.MIN_VALUE"

    return-object p0

    :cond_3
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, p0, v0

    if-nez v0, :cond_4

    const-string p0, "Float.MAX_VALUE"

    return-object p0

    :cond_4
    const/high16 v0, 0x800000

    cmpl-float v0, p0, v0

    if-nez v0, :cond_5

    const-string p0, "Float.MIN_NORMAL"

    return-object p0

    .line 537
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x66

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_4

    const/16 v0, 0xd

    if-eq p0, v0, :cond_3

    const/16 v0, 0x22

    if-eq p0, v0, :cond_2

    const/16 v0, 0x27

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5c

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    const-string p0, "\\n"

    return-object p0

    :pswitch_1
    const-string p0, "\\t"

    return-object p0

    :pswitch_2
    const-string p0, "\\b"

    return-object p0

    :cond_0
    const-string p0, "\\\\"

    return-object p0

    :cond_1
    const-string p0, "\'"

    return-object p0

    :cond_2
    const-string p0, "\\\""

    return-object p0

    :cond_3
    const-string p0, "\\r"

    return-object p0

    :cond_4
    const-string p0, "\\f"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private ۙ(JIZ)Ljava/lang/String;
    .locals 7

    .line 412
    iget-object v0, p0, Ll/ۨۧ᩵;->ۙ:Ll/ۡۘۗ;

    invoke-virtual {v0}, Ll/ۡۘۗ;->ۙ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 413
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v2, 0x0

    const-string v4, "0x"

    cmp-long v5, p1, v2

    if-gez v5, :cond_0

    .line 416
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p4

    .line 417
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    mul-int/lit8 v3, p3, 0x2

    sub-int v3, p4, v3

    invoke-virtual {v0, v3, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 v0, 0x1

    goto :goto_1

    .line 0
    :cond_0
    invoke-static {v4, v0}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 425
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    move v0, p4

    move-object p4, v6

    :goto_1
    const/16 v2, 0x8

    if-ne p3, v2, :cond_3

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v5, p1, v3

    if-eqz v5, :cond_2

    .line 427
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, p1, v3

    if-ltz v5, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    if-eqz v0, :cond_9

    if-ne p3, v2, :cond_4

    .line 434
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x4c

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 436
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    if-eq p3, v1, :cond_8

    const/4 p2, 0x2

    if-eq p3, p2, :cond_7

    const/4 p2, 0x4

    if-eq p3, p2, :cond_6

    if-ne p3, v2, :cond_5

    const-string p2, "(long) "

    goto :goto_2

    .line 452
    :cond_5
    new-instance p1, Ll/۠ۧ᩵;

    const-string p2, "Unexpected number type length: "

    .line 0
    invoke-static {p3, p2}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 452
    throw p1

    :cond_6
    const-string p2, "(int) "

    goto :goto_2

    :cond_7
    const-string p2, "(short) "

    goto :goto_2

    :cond_8
    const-string p2, "(byte) "

    .line 0
    :goto_2
    invoke-static {p1, p2, p4}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_9
    return-object p4
.end method

.method public static ۙ(ZC)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x27

    if-ne p1, v0, :cond_0

    const-string p0, "\'\\\'\'"

    return-object p0

    .line 92
    :cond_0
    invoke-static {p1}, Ll/ۨۧ᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\'"

    if-eqz v1, :cond_1

    .line 94
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 99
    :cond_1
    sget-object v1, Ll/۬֫᩵;->ۤ:Ljava/util/regex/Pattern;

    const/16 v1, 0x20

    if-gt v1, p1, :cond_2

    const/16 v1, 0x7e

    if-gt p1, v1, :cond_2

    .line 100
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 102
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p0, :cond_3

    const-string p0, "(char) "

    .line 0
    invoke-static {p0, p1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object p1
.end method

.method public static ۙ()Ll/ۨۧ᩵;
    .locals 1

    .line 22
    sget-object v0, Ll/ۨۧ᩵;->ۤ:Ll/ۨۧ᩵;

    return-object v0
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 136
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 139
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_1

    const/16 v4, 0x24

    if-eq v3, v4, :cond_1

    const/16 v4, 0x2a

    if-eq v3, v4, :cond_2

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_1

    const/16 v4, 0x5b

    if-eq v3, v4, :cond_0

    const/16 v4, 0x5d

    if-eq v3, v4, :cond_2

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_1

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3c

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3e

    if-eq v3, v4, :cond_2

    const/16 v4, 0x3f

    if-eq v3, v4, :cond_2

    .line 162
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/16 v3, 0x41

    .line 152
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v3, 0x5f

    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 166
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۙ(JZ)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 457
    invoke-direct {p0, p1, p2, v0, p3}, Ll/ۨۧ᩵;->ۙ(JIZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 48
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "\"\""

    return-object p1

    .line 52
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x22

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_8

    .line 41
    invoke-virtual {p1, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result v5

    .line 60
    invoke-static {v5}, Ll/ۨۧ᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 62
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_1
    const/4 v6, 0x1

    const/16 v7, 0x20

    if-ge v5, v7, :cond_2

    const/4 v7, 0x1

    goto :goto_4

    :cond_2
    const/16 v8, 0x7f

    if-ge v5, v8, :cond_3

    const/4 v7, 0x0

    goto :goto_4

    .line 82
    :cond_3
    sget-object v8, Ll/۬֫᩵;->ۤ:Ljava/util/regex/Pattern;

    .line 105
    invoke-static {v5}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_2

    .line 108
    :cond_4
    invoke-static {v5}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v8

    if-eqz v8, :cond_5

    if-ne v5, v7, :cond_6

    goto :goto_1

    .line 112
    :cond_5
    invoke-static {v5}, Ljava/lang/Character;->getType(I)I

    move-result v7

    if-eqz v7, :cond_6

    const/16 v8, 0xf

    if-eq v7, v8, :cond_6

    const/16 v8, 0x10

    if-eq v7, v8, :cond_6

    const/16 v8, 0x12

    if-eq v7, v8, :cond_6

    const/16 v8, 0x13

    if-eq v7, v8, :cond_6

    :goto_1
    const/4 v7, 0x1

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v7, 0x0

    :goto_3
    xor-int/2addr v7, v6

    :goto_4
    if-eqz v7, :cond_7

    const-string v7, "\\u"

    .line 66
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v7, v6, v3

    const-string v7, "%04x"

    invoke-static {v7, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 68
    :cond_7
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 43
    :goto_5
    invoke-static {v5}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_0

    .line 55
    :cond_8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۤ(JZ)Ljava/lang/String;
    .locals 3

    .line 485
    iget-object v0, p0, Ll/ۨۧ᩵;->ۙ:Ll/ۡۘۗ;

    sget-object v1, Ll/ۡۘۗ;->᩶:Ll/ۡۘۗ;

    if-ne v0, v1, :cond_1

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const-string p1, "Long.MAX_VALUE"

    return-object p1

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    const-string p1, "Long.MIN_VALUE"

    return-object p1

    :cond_1
    const/16 v0, 0x8

    .line 493
    invoke-direct {p0, p1, p2, v0, p3}, Ll/ۨۧ᩵;->ۙ(JIZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(JZ)Ljava/lang/String;
    .locals 2

    .line 473
    iget-object v0, p0, Ll/ۨۧ᩵;->ۙ:Ll/ۡۘۗ;

    sget-object v1, Ll/ۡۘۗ;->᩶:Ll/ۡۘۗ;

    if-ne v0, v1, :cond_2

    long-to-int v0, p1

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Integer.MAX_VALUE"

    return-object p1

    :cond_1
    const-string p1, "Integer.MIN_VALUE"

    return-object p1

    :cond_2
    :goto_0
    const/4 v0, 0x4

    .line 481
    invoke-direct {p0, p1, p2, v0, p3}, Ll/ۨۧ᩵;->ۙ(JIZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩸(JZ)Ljava/lang/String;
    .locals 2

    .line 461
    iget-object v0, p0, Ll/ۨۧ᩵;->ۙ:Ll/ۡۘۗ;

    sget-object v1, Ll/ۡۘۗ;->᩶:Ll/ۡۘۗ;

    if-ne v0, v1, :cond_2

    long-to-int v0, p1

    int-to-short v0, v0

    const/16 v1, -0x8000

    if-eq v0, v1, :cond_1

    const/16 v1, 0x7fff

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Short.MAX_VALUE"

    return-object p1

    :cond_1
    const-string p1, "Short.MIN_VALUE"

    return-object p1

    :cond_2
    :goto_0
    const/4 v0, 0x2

    .line 469
    invoke-direct {p0, p1, p2, v0, p3}, Ll/ۨۧ᩵;->ۙ(JIZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
