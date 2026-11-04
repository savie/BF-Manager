.class public final Ll/᩸۫ܺ;
.super Ljava/lang/Object;
.source "P1U8"

# interfaces
.implements Ll/ۚ۫ܺ;


# instance fields
.field public final ۙ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    iput-object p1, p0, Ll/᩸۫ܺ;->ۙ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/֫۫ܺ;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/᩸۫ܺ;->ۙ:Ljava/lang/Object;

    return-void
.end method

.method private varargs ۙ([Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 156
    array-length v0, p1

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    .line 157
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 158
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_1

    .line 161
    :cond_0
    iget-object v5, p0, Ll/᩸۫ܺ;->ۙ:Ljava/lang/Object;

    check-cast v5, Landroid/content/res/Resources;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v2

    const/4 v1, 0x1

    aput-object v4, v6, v1

    const v1, 0x7f120341

    invoke-virtual {v5, v1, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private ۤ(Ll/ܳ᩹ۙ;)Ljava/lang/String;
    .locals 3

    .line 137
    iget-object v0, p0, Ll/᩸۫ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    .line 138
    iget v1, p1, Ll/ܳ᩹ۙ;->۬:I

    iget p1, p1, Ll/ܳ᩹ۙ;->۬:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    const v1, 0x7f120345

    .line 139
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    and-int/lit8 v2, p1, 0x4

    if-eqz v2, :cond_1

    const v2, 0x7f120348

    .line 142
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩸۫ܺ;->ۙ([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    and-int/lit8 v2, p1, 0x8

    if-eqz v2, :cond_2

    const v2, 0x7f120347

    .line 145
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/᩸۫ܺ;->ۙ([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    and-int/lit16 p1, p1, 0x440

    if-eqz p1, :cond_3

    const p1, 0x7f120346

    .line 149
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩸۫ܺ;->ۙ([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1
.end method

.method private ᩷(Ll/ܳ᩹ۙ;)Ljava/lang/String;
    .locals 7

    .line 115
    iget-object v0, p1, Ll/ܳ᩹ۙ;->֡:Ljava/lang/String;

    iget-object v1, p1, Ll/ܳ᩹ۙ;->᩶:Ljava/lang/String;

    .line 116
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, ""

    if-nez v2, :cond_2

    const-string v2, "und"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    .line 120
    invoke-static {}, Ll/ۜۨۙ;->ۙ()Ljava/util/Locale;

    move-result-object v2

    .line 121
    invoke-virtual {v0, v2}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 127
    :try_start_0
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v4

    .line 128
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :cond_2
    :goto_0
    move-object v0, v3

    .line 106
    :goto_1
    invoke-direct {p0, p1}, Ll/᩸۫ܺ;->ۤ(Ll/ܳ᩹ۙ;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩸۫ܺ;->ۙ([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 107
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 111
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    move-object v1, v3

    :cond_3
    move-object p1, v1

    :cond_4
    return-object p1
.end method


# virtual methods
.method public ۙ(Ll/ܳ᩹ۙ;)Ljava/lang/String;
    .locals 13

    .line 46
    iget-object v0, p0, Ll/᩸۫ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    .line 169
    iget-object v1, p1, Ll/ܳ᩹ۙ;->᩷ۙ:Ljava/lang/String;

    iget v2, p1, Ll/ܳ᩹ۙ;->᩸:I

    iget v3, p1, Ll/ܳ᩹ۙ;->ᩴ:I

    iget v4, p1, Ll/ܳ᩹ۙ;->᩺:I

    iget v5, p1, Ll/ܳ᩹ۙ;->֫ۙ:I

    iget-object v6, p1, Ll/ܳ᩹ۙ;->ܳ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۡ᩹ۙ;->ᩴ(Ljava/lang/String;)I

    move-result v1

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, -0x1

    if-eq v1, v9, :cond_0

    goto :goto_2

    .line 173
    :cond_0
    invoke-static {v6}, Ll/ۡ᩹ۙ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 176
    :cond_1
    invoke-static {v6}, Ll/ۡ᩹ۙ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    if-ne v5, v9, :cond_6

    if-eq v4, v9, :cond_3

    goto :goto_1

    :cond_3
    if-ne v3, v9, :cond_5

    .line 182
    iget v1, p1, Ll/ܳ᩹ۙ;->ۤۙ:I

    if-eq v1, v9, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, -0x1

    goto :goto_2

    :cond_5
    :goto_0
    const/4 v1, 0x1

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v1, 0x2

    :goto_2
    const/4 v6, 0x0

    const v10, 0x49742400    # 1000000.0f

    const v11, 0x7f120342

    const-string v12, ""

    if-ne v1, v8, :cond_a

    .line 50
    invoke-direct {p0, p1}, Ll/᩸۫ܺ;->ۤ(Ll/ܳ᩹ۙ;)Ljava/lang/String;

    move-result-object v1

    if-eq v5, v9, :cond_8

    if-ne v4, v9, :cond_7

    goto :goto_3

    .line 74
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v3, v5, v6

    aput-object v4, v5, v7

    const v3, 0x7f120344

    invoke-virtual {v0, v3, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_8
    :goto_3
    move-object v3, v12

    :goto_4
    if-ne v2, v9, :cond_9

    goto :goto_5

    :cond_9
    int-to-float v2, v2

    div-float/2addr v2, v10

    .line 81
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-array v4, v7, [Ljava/lang/Object;

    aput-object v2, v4, v6

    invoke-virtual {v0, v11, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 50
    :goto_5
    filled-new-array {v1, v3, v12}, [Ljava/lang/String;

    move-result-object v1

    .line 49
    invoke-direct {p0, v1}, Ll/᩸۫ܺ;->ۙ([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_a
    if-ne v1, v7, :cond_12

    .line 54
    invoke-direct {p0, p1}, Ll/᩸۫ܺ;->᩷(Ll/ܳ᩹ۙ;)Ljava/lang/String;

    move-result-object v1

    if-eq v3, v9, :cond_10

    if-ge v3, v7, :cond_b

    goto :goto_6

    :cond_b
    if-eq v3, v7, :cond_f

    if-eq v3, v8, :cond_e

    const/4 v4, 0x6

    if-eq v3, v4, :cond_d

    const/4 v4, 0x7

    if-eq v3, v4, :cond_d

    const/16 v4, 0x8

    if-eq v3, v4, :cond_c

    const v3, 0x7f12034d

    .line 100
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_c
    const v3, 0x7f12034f

    .line 98
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_d
    const v3, 0x7f12034e

    .line 96
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_e
    const v3, 0x7f12034c

    .line 93
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_f
    const v3, 0x7f120343

    .line 91
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_10
    :goto_6
    move-object v3, v12

    :goto_7
    if-ne v2, v9, :cond_11

    goto :goto_8

    :cond_11
    int-to-float v2, v2

    div-float/2addr v2, v10

    .line 81
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-array v4, v7, [Ljava/lang/Object;

    aput-object v2, v4, v6

    invoke-virtual {v0, v11, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 56
    :goto_8
    filled-new-array {v1, v3, v12}, [Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-direct {p0, v1}, Ll/᩸۫ܺ;->ۙ([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    .line 58
    :cond_12
    invoke-direct {p0, p1}, Ll/᩸۫ܺ;->᩷(Ll/ܳ᩹ۙ;)Ljava/lang/String;

    move-result-object v1

    .line 60
    :goto_9
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_13

    return-object v1

    .line 63
    :cond_13
    iget-object p1, p1, Ll/ܳ᩹ۙ;->֡:Ljava/lang/String;

    if-eqz p1, :cond_15

    .line 64
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    new-array v1, v7, [Ljava/lang/Object;

    aput-object p1, v1, v6

    const p1, 0x7f120351

    .line 66
    invoke-virtual {v0, p1, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_15
    :goto_a
    const p1, 0x7f120350

    .line 65
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ll/᩶ܳܺ;)V
    .locals 1

    .line 15
    iget-object v0, p0, Ll/᩸۫ܺ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/֫۫ܺ;

    invoke-virtual {p1, v0}, Ll/ۘܳܺ;->᩷(Ll/ۧ۫ܺ;)V

    return-void
.end method
