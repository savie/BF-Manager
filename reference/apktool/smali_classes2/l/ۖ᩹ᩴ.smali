.class public final Ll/ۖ᩹ᩴ;
.super Ljava/lang/Object;
.source "Q983"


# static fields
.field public static final synthetic ۙ:I

.field public static final ۤ:Ljava/util/WeakHashMap;

.field public static final ᩷:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 25
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5dc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    const-wide/16 v1, 0x32

    .line 26
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/ۖ᩹ᩴ;->᩷:J

    .line 28
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ۖ᩹ᩴ;->ۤ:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 9

    const-string v0, "INTERNAL:ArscTranslationItem"

    .line 239
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xc8

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    .line 245
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 58
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x2000

    if-le v4, v5, :cond_0

    goto/16 :goto_6

    .line 253
    :cond_0
    invoke-static {v0}, Ll/ۡۧᩴ;->ᩴ(Ljava/lang/String;)Ll/ܺۧᩴ;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_1

    goto :goto_1

    .line 269
    :cond_1
    :try_start_0
    sget-object v6, Ll/ۖ᩹ᩴ;->ۤ:Ljava/util/WeakHashMap;

    move-object v0, v6

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    :try_start_1
    invoke-virtual {v6, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/ref/WeakReference;

    if-nez v7, :cond_2

    move-object v7, v5

    goto :goto_0

    .line 271
    :cond_2
    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩵ܶᩴ;

    :goto_0
    if-eqz v7, :cond_3

    .line 272
    invoke-virtual {v7}, Ll/᩵ܶᩴ;->ۤ()Z

    move-result v8

    if-nez v8, :cond_4

    .line 273
    :cond_3
    invoke-static {v4}, Ll/᩵ܶᩴ;->᩷(Ll/ܺۧᩴ;)Ll/᩵ܶᩴ;

    move-result-object v7

    .line 274
    new-instance v8, Ljava/lang/ref/WeakReference;

    invoke-direct {v8, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v6, v4, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    :cond_4
    monitor-exit v0

    move-object v5, v7

    goto :goto_1

    :catchall_0
    move-exception v4

    .line 277
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v4
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    nop

    :goto_1
    if-eqz v5, :cond_b

    .line 62
    invoke-virtual {v5}, Ll/᩵ܶᩴ;->۫()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_6

    .line 65
    :cond_5
    sget-wide v6, Ll/ۖ᩹ᩴ;->᩷:J

    .line 224
    invoke-static {v5, p0, v1, v6, v7}, Ll/ۖ᩹ᩴ;->ۙ(Ll/᩵ܶᩴ;Ljava/lang/CharSequence;IJ)Ll/֨ܶᩴ;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_5

    .line 228
    :cond_6
    instance-of v0, v3, Landroid/text/Spannable;

    if-eqz v0, :cond_7

    check-cast v3, Landroid/text/Spannable;

    goto :goto_2

    .line 229
    :cond_7
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v3, v0

    .line 201
    :goto_2
    invoke-virtual {p0}, Ll/֨ܶᩴ;->ۙ()I

    move-result v0

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v0, v1, :cond_a

    .line 128
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ll/ۡ᩹ᩴ;

    .line 127
    invoke-interface {v3, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۡ᩹ᩴ;

    .line 129
    array-length v1, v0

    :goto_3
    if-ge v2, v1, :cond_8

    aget-object v4, v0, v2

    .line 130
    invoke-interface {v3, v4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 143
    :cond_8
    new-instance v0, Ll/᩶ܶᩴ;

    invoke-direct {v0}, Ll/᩶ܶᩴ;-><init>()V

    invoke-virtual {v0, p0}, Ll/᩶ܶᩴ;->ۙ(Ll/֨ܶᩴ;)V

    .line 206
    :goto_4
    invoke-virtual {v0}, Ll/᩶ܶᩴ;->ᩴ()Z

    move-result p0

    if-eqz p0, :cond_9

    .line 207
    invoke-virtual {v0}, Ll/᩶ܶᩴ;->ۤ()Ll/ۧ᩻ᩴ;

    move-result-object p0

    .line 208
    new-instance v1, Ll/ۡ᩹ᩴ;

    .line 209
    invoke-virtual {p0}, Ll/ۧ᩻ᩴ;->ܽ()I

    move-result v2

    invoke-virtual {p0}, Ll/ۧ᩻ᩴ;->ۚ()I

    move-result p0

    invoke-direct {v1, v2, p0}, Ll/ۡ᩹ᩴ;-><init>(II)V

    .line 210
    invoke-virtual {v0}, Ll/᩶ܶᩴ;->᩷()I

    move-result p0

    invoke-virtual {v0}, Ll/᩶ܶᩴ;->ۙ()I

    move-result v2

    const/16 v4, 0x11

    invoke-interface {v3, v1, p0, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_4

    :cond_9
    :goto_5
    return-object v3

    .line 202
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Syntax store and text lengths differ"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    :goto_6
    return-object v3
.end method

.method public static ۙ(Ll/᩵ܶᩴ;Ljava/lang/CharSequence;IJ)Ll/֨ܶᩴ;
    .locals 3

    .line 174
    instance-of v0, p1, Ll/ۡ᩶᩸;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۡ᩶᩸;

    .line 175
    invoke-interface {p1}, Ll/ۡ᩶᩸;->ܽۙ()Ll/ܳܿ᩸;

    move-result-object p1

    .line 176
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۖ᩹ᩴ;->ۙ(Ll/᩵ܶᩴ;Ljava/lang/CharSequence;IJ)Ll/֨ܶᩴ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    invoke-virtual {p1}, Ll/ܳܿ᩸;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 175
    :try_start_1
    invoke-virtual {p1}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0

    :cond_0
    if-ltz p2, :cond_3

    .line 239
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 180
    invoke-virtual {p0}, Ll/᩵ܶᩴ;->۫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    .line 183
    :cond_1
    new-instance v0, Ll/֨᩹ᩴ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 253
    new-instance v2, Ll/ܶܺᩴ;

    .line 254
    invoke-direct {v2, p0, p1, v0, p2}, Ll/ܶܺᩴ;-><init>(Ll/᩵ܶᩴ;Ljava/lang/CharSequence;Ll/֨᩹ᩴ;I)V

    const p0, 0x7fffffff

    .line 432
    :try_start_2
    invoke-virtual {v2, p0, p3, p4, v1}, Ll/ܶܺᩴ;->ۙ(IJLl/᩺᩻ᩴ;)Ll/ܽܺᩴ;

    move-result-object p0

    .line 193
    sget-object p1, Ll/ܽܺᩴ;->ܿ:Ll/ܽܺᩴ;

    if-ne p0, p1, :cond_2

    invoke-virtual {v2}, Ll/ܶܺᩴ;->۫()Ll/֨ܶᩴ;

    move-result-object p0
    :try_end_2
    .catch Ll/ۚܺᩴ; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catch_0
    :cond_2
    :goto_1
    return-object v1

    .line 237
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Negative syntax highlight prefix length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
