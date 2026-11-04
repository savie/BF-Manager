.class public abstract Ll/᩶ۨۨ;
.super Ljava/lang/Object;
.source "S4VX"


# static fields
.field public static final ۤ:Ll/᩶ۨۨ;

.field public static final ᩷:Ll/᩶ۨۨ;


# instance fields
.field public final ۙ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 268
    new-instance v0, Ll/ۘۨۨ;

    const/4 v1, 0x1

    .line 94
    invoke-direct {v0, v1}, Ll/᩶ۨۨ;-><init>(Z)V

    .line 268
    sput-object v0, Ll/᩶ۨۨ;->᩷:Ll/᩶ۨۨ;

    .line 273
    new-instance v0, Ll/ܰۨۨ;

    const/4 v1, 0x0

    .line 201
    invoke-direct {v0, v1}, Ll/᩶ۨۨ;-><init>(Z)V

    .line 273
    sput-object v0, Ll/᩶ۨۨ;->ۤ:Ll/᩶ۨۨ;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 333
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 334
    iput-boolean p1, p0, Ll/᩶ۨۨ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public abstract ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1292
    invoke-static {p1}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {p2}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p3, :cond_4

    .line 1295
    iget-boolean v0, p0, Ll/᩶ۨۨ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 1296
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    :cond_0
    const/4 v0, 0x0

    .line 1299
    invoke-virtual {p0, p1, p2, v0}, Ll/᩶ۨۨ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    goto :goto_2

    .line 1303
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    .line 1304
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    mul-int/lit8 v4, v4, 0x10

    .line 1306
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v4

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, -0x1

    :goto_0
    if-eq v1, v2, :cond_3

    .line 1308
    invoke-virtual {v5, p1, v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v0, v1, v3

    add-int/2addr v4, v2

    if-nez v4, :cond_2

    goto :goto_1

    .line 1313
    :cond_2
    invoke-virtual {p0, p1, p2, v0}, Ll/᩶ۨۨ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    goto :goto_0

    .line 1315
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {v5, p1, v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1316
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_4
    :goto_2
    return-object p1
.end method

.method public final ۙ(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 3

    if-eqz p2, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 602
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 603
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_1

    goto :goto_1

    .line 606
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v0

    iget-boolean v2, p0, Ll/᩶ۨۨ;->ۙ:Z

    invoke-static {v1, v0, p2, p1, v2}, Ll/ۗۨۨ;->ۙ(IILjava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    if-ne p2, p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1407
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 1408
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_1

    goto :goto_1

    .line 1411
    :cond_1
    iget-boolean v2, p0, Ll/᩶ۨۨ;->ۙ:Z

    invoke-static {v0, v1, p2, p1, v2}, Ll/ۗۨۨ;->ۙ(IILjava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    if-ne p2, p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v0
.end method
