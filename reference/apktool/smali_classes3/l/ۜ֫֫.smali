.class public final Ll/ۜ֫֫;
.super Ljava/lang/Object;
.source "Q6MT"


# static fields
.field public static final ۤ:Ll/ۜ֫֫;

.field public static final ᩸:Ll/ۜ֫֫;


# instance fields
.field public final ۙ:J

.field public final ᩷:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 306
    new-instance v0, Ll/ۜ֫֫;

    const-wide/32 v1, 0x10000000

    invoke-direct {v0, v1, v2, v1, v2}, Ll/ۜ֫֫;-><init>(JJ)V

    sput-object v0, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    .line 309
    new-instance v0, Ll/ۜ֫֫;

    const-wide/32 v1, 0x3b9aca00

    const-wide/32 v3, 0x20000000

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۜ֫֫;-><init>(JJ)V

    sput-object v0, Ll/ۜ֫֫;->᩸:Ll/ۜ֫֫;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 3

    .line 318
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    cmp-long v2, p3, v0

    if-lez v2, :cond_0

    const-wide v0, 0x1fffffffffffffffL

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 324
    iput-wide p1, p0, Ll/ۜ֫֫;->᩷:J

    .line 325
    iput-wide p3, p0, Ll/ۜ֫֫;->ۙ:J

    return-void

    .line 322
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid image decode limits"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;
    .locals 1

    .line 335
    sget-object v0, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "image/x-tga"

    .line 336
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    const-string p2, "image/jpeg"

    .line 337
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    const-string p2, "image/png"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-object p0

    :cond_2
    :goto_1
    sget-object p1, Ll/ۜ֫֫;->᩸:Ll/ۜ֫֫;

    return-object p1
.end method

.method public final ۙ(II)V
    .locals 3

    if-lez p1, :cond_1

    if-lez p2, :cond_1

    const v0, 0xf4240

    if-gt p1, v0, :cond_0

    if-gt p2, v0, :cond_0

    int-to-long v0, p1

    int-to-long p1, p2

    mul-long v0, v0, p1

    .line 343
    iget-wide p1, p0, Ll/ۜ֫֫;->᩷:J

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    return-void

    .line 345
    :cond_0
    new-instance p1, Ll/ۢ֫֫;

    const-string p2, "Image dimensions exceed safe decode limits"

    .line 454
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 345
    throw p1

    .line 342
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid image dimensions"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
