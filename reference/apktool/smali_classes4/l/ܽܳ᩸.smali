.class public final Ll/ܽܳ᩸;
.super Ljava/lang/Object;
.source "D6JB"


# static fields
.field public static final ۙ:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    const-string v10, ".tbz"

    const-string v11, ".tar.lz4"

    const-string v0, ".tar"

    const-string v1, ".tar.gz"

    const-string v2, ".taz"

    const-string v3, ".tgz"

    const-string v4, ".tar.xz"

    const-string v5, ".txz"

    const-string v6, ".tar.zst"

    const-string v7, ".tar.zstd"

    const-string v8, ".tar.bz2"

    const-string v9, ".tbz2"

    .line 7
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܽܳ᩸;->ۙ:[Ljava/lang/String;

    return-void
.end method

.method public static ۙ(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-ltz p0, :cond_4

    .line 94
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, p0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 97
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    add-int v2, p0, v1

    .line 98
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x41

    if-lt v2, v3, :cond_1

    const/16 v3, 0x5a

    if-gt v2, v3, :cond_1

    add-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    :cond_1
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_1
    return v0
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xc

    if-ge v1, v2, :cond_1

    .line 71
    sget-object v2, Ll/ܽܳ᩸;->ۙ:[Ljava/lang/String;

    aget-object v2, v2, v1

    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-static {v3, p0, v2}, Ll/ܽܳ᩸;->ۙ(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static ᩷(Ljava/lang/String;)Ll/ܺܳ᩸;
    .locals 15

    const/16 v0, 0x2e

    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ltz v0, :cond_d

    .line 32
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ne v0, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    .line 0
    invoke-static {v2, p0}, Ll/᩷᩶᩻;->ۙ(ILjava/lang/String;)C

    move-result v4

    const/16 v5, 0x5a

    const/16 v6, 0x41

    const/16 v7, 0x7a

    const/4 v8, 0x0

    const/16 v9, 0x30

    if-lt v4, v9, :cond_9

    const/16 v10, 0x39

    if-gt v4, v10, :cond_9

    const-string v11, ".zip"

    const/4 v12, 0x3

    if-ne v3, v12, :cond_4

    move v13, v1

    .line 80
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v13, v14, :cond_1

    .line 81
    invoke-virtual {p0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v9, :cond_4

    if-gt v14, v10, :cond_4

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v13, v9, :cond_2

    add-int/lit8 v13, v0, 0x2

    invoke-virtual {p0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v13, v9, :cond_2

    if-eq v4, v9, :cond_4

    :cond_2
    add-int/lit8 v13, v0, -0x4

    .line 41
    invoke-static {v13, p0, v11}, Ll/ܽܳ᩸;->ۙ(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 42
    new-instance v1, Ll/ܺܳ᩸;

    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ll/᩻ܳ᩸;->֡:Ll/᩻ܳ᩸;

    invoke-direct {v1, p0, v0}, Ll/ܺܳ᩸;-><init>(Ljava/lang/String;Ll/᩻ܳ᩸;)V

    return-object v1

    :cond_3
    add-int/lit8 v13, v0, -0x3

    const-string v14, ".7z"

    .line 44
    invoke-static {v13, p0, v14}, Ll/ܽܳ᩸;->ۙ(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_4

    .line 45
    new-instance v1, Ll/ܺܳ᩸;

    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ll/᩻ܳ᩸;->᩶:Ll/᩻ܳ᩸;

    invoke-direct {v1, p0, v0}, Ll/ܺܳ᩸;-><init>(Ljava/lang/String;Ll/᩻ܳ᩸;)V

    return-object v1

    :cond_4
    if-lt v3, v12, :cond_d

    .line 49
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-lt v1, v6, :cond_5

    if-gt v1, v5, :cond_5

    add-int/lit8 v1, v1, 0x20

    int-to-char v1, v1

    :cond_5
    if-ne v1, v7, :cond_d

    add-int/lit8 v1, v0, 0x2

    move v5, v1

    .line 80
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_7

    .line 81
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v9, :cond_6

    if-gt v6, v10, :cond_6

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    const/4 v2, 0x0

    :cond_7
    if-eqz v2, :cond_d

    .line 50
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v9, :cond_8

    if-ne v3, v12, :cond_d

    if-eq v4, v9, :cond_d

    .line 51
    :cond_8
    new-instance v1, Ll/ܺܳ᩸;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ll/᩻ܳ᩸;->֡:Ll/᩻ܳ᩸;

    invoke-direct {v1, p0, v0}, Ll/ܺܳ᩸;-><init>(Ljava/lang/String;Ll/᩻ܳ᩸;)V

    return-object v1

    :cond_9
    const/4 v2, 0x6

    if-lt v3, v2, :cond_d

    const-string v2, "part"

    .line 53
    invoke-static {v1, p0, v2}, Ll/ܽܳ᩸;->ۙ(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    add-int/lit8 v1, v0, 0x5

    .line 54
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_c

    .line 55
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v6, :cond_a

    if-gt v2, v5, :cond_a

    add-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    :cond_a
    const/16 v3, 0x61

    if-lt v2, v3, :cond_d

    if-le v2, v7, :cond_b

    goto :goto_3

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 60
    :cond_c
    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 61
    invoke-static {p0}, Ll/ܽܳ᩸;->ۙ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 62
    new-instance v0, Ll/ܺܳ᩸;

    sget-object v1, Ll/᩻ܳ᩸;->ܿ:Ll/᩻ܳ᩸;

    invoke-direct {v0, p0, v1}, Ll/ܺܳ᩸;-><init>(Ljava/lang/String;Ll/᩻ܳ᩸;)V

    return-object v0

    :cond_d
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method
