.class public final Ll/ۨۘܽ;
.super Ll/ۤܰܽ;
.source "0B0D"


# virtual methods
.method public final ۙ([J)Ljava/lang/Object;
    .locals 11

    .line 905
    new-instance v7, Ljava/util/GregorianCalendar;

    const/4 v0, 0x0

    aget-wide v0, p1, v0

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_5

    const/4 v0, 0x1

    .line 906
    aget-wide v0, p1, v0

    long-to-int v3, v0

    int-to-long v4, v3

    cmp-long v6, v0, v4

    if-nez v6, :cond_4

    const/4 v0, 0x2

    .line 907
    aget-wide v0, p1, v0

    long-to-int v4, v0

    int-to-long v5, v4

    cmp-long v8, v0, v5

    if-nez v8, :cond_3

    const/4 v0, 0x3

    .line 908
    aget-wide v0, p1, v0

    long-to-int v5, v0

    int-to-long v8, v5

    cmp-long v6, v0, v8

    if-nez v6, :cond_2

    const/4 v0, 0x4

    .line 909
    aget-wide v0, p1, v0

    long-to-int v6, v0

    int-to-long v8, v6

    cmp-long v10, v0, v8

    if-nez v10, :cond_1

    const/4 v0, 0x5

    .line 910
    aget-wide v0, p1, v0

    long-to-int p1, v0

    int-to-long v8, p1

    cmp-long v10, v0, v8

    if-nez v10, :cond_0

    move-object v0, v7

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, p1

    .line 911
    invoke-direct/range {v0 .. v6}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    return-object v7

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ljava/lang/Object;)[J
    .locals 17

    .line 901
    move-object/from16 v0, p1

    check-cast v0, Ljava/util/Calendar;

    const/4 v1, 0x1

    .line 917
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    int-to-long v2, v2

    const/4 v4, 0x2

    .line 918
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    int-to-long v5, v5

    const/4 v7, 0x5

    .line 919
    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    move-result v8

    int-to-long v8, v8

    const/16 v10, 0xb

    .line 920
    invoke-virtual {v0, v10}, Ljava/util/Calendar;->get(I)I

    move-result v10

    int-to-long v10, v10

    const/16 v12, 0xc

    .line 921
    invoke-virtual {v0, v12}, Ljava/util/Calendar;->get(I)I

    move-result v12

    int-to-long v12, v12

    const/16 v14, 0xd

    .line 922
    invoke-virtual {v0, v14}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v14, v0

    const/4 v0, 0x6

    new-array v0, v0, [J

    const/16 v16, 0x0

    aput-wide v2, v0, v16

    aput-wide v5, v0, v1

    aput-wide v8, v0, v4

    const/4 v1, 0x3

    aput-wide v10, v0, v1

    const/4 v1, 0x4

    aput-wide v12, v0, v1

    aput-wide v14, v0, v7

    return-object v0
.end method
