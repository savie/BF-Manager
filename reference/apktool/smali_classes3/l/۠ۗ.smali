.class public final Ll/۠ۗ;
.super Ljava/lang/Object;
.source "85M9"


# static fields
.field public static final ۙ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۠ۗ;->ۙ:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۙ()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Ll/۠ۗ;->ۙ:Ljava/lang/Object;

    return-object v0
.end method

.method public static final ۙ(Ll/ۖۗ;I)Ljava/lang/Object;
    .locals 2

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    iget-object v0, p0, Ll/ۖۗ;->᩶:[I

    iget v1, p0, Ll/ۖۗ;->ܿ:I

    invoke-static {v1, p1, v0}, Ll/ۜۗ;->ۙ(II[I)I

    move-result p1

    if-ltz p1, :cond_1

    .line 245
    iget-object p0, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aget-object p0, p0, p1

    sget-object p1, Ll/۠ۗ;->ۙ:Ljava/lang/Object;

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final ۙ(Ll/ۖۗ;)V
    .locals 8

    .line 332
    iget v0, p0, Ll/ۖۗ;->ܿ:I

    .line 334
    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    .line 335
    iget-object v2, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    .line 337
    aget-object v6, v2, v4

    .line 338
    sget-object v7, Ll/۠ۗ;->ۙ:Ljava/lang/Object;

    if-eq v6, v7, :cond_1

    if-eq v4, v5, :cond_0

    .line 340
    aget v7, v1, v4

    aput v7, v1, v5

    .line 341
    aput-object v6, v2, v5

    const/4 v6, 0x0

    .line 342
    aput-object v6, v2, v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 347
    :cond_2
    iput-boolean v3, p0, Ll/ۖۗ;->ܰ:Z

    .line 348
    iput v5, p0, Ll/ۖۗ;->ܿ:I

    return-void
.end method

.method public static final ۤ(Ll/ۖۗ;I)V
    .locals 3

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Ll/ۖۗ;->᩶:[I

    iget v1, p0, Ll/ۖۗ;->ܿ:I

    invoke-static {v1, p1, v0}, Ll/ۜۗ;->ۙ(II[I)I

    move-result p1

    if-ltz p1, :cond_0

    .line 266
    iget-object v0, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aget-object v1, v0, p1

    sget-object v2, Ll/۠ۗ;->ۙ:Ljava/lang/Object;

    if-eq v1, v2, :cond_0

    .line 267
    aput-object v2, v0, p1

    const/4 p1, 0x1

    .line 268
    iput-boolean p1, p0, Ll/ۖۗ;->ܰ:Z

    :cond_0
    return-void
.end method

.method public static final ᩷(Ll/ۖۗ;I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "<this>"

    .line 10
    invoke-static {p0, v1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    iget-object v1, p0, Ll/ۖۗ;->᩶:[I

    iget v2, p0, Ll/ۖۗ;->ܿ:I

    invoke-static {v2, p1, v1}, Ll/ۜۗ;->ۙ(II[I)I

    move-result p1

    if-ltz p1, :cond_1

    .line 245
    iget-object p0, p0, Ll/ۖۗ;->֡:[Ljava/lang/Object;

    aget-object p0, p0, p1

    sget-object p1, Ll/۠ۗ;->ۙ:Ljava/lang/Object;

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    return-object v0
.end method
