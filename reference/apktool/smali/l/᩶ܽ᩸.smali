.class public final Ll/᩶ܽ᩸;
.super Ljava/lang/Object;
.source "DBK8"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final ܰ:Ll/۬ۛ᩸;

.field public ܿ:Z

.field public ᩶:I


# direct methods
.method public constructor <init>(Ll/۬ۛ᩸;Ll/ᩳ۬᩸;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/᩶ܽ᩸;->ܰ:Ll/۬ۛ᩸;

    .line 23
    invoke-direct {p0, p2}, Ll/᩶ܽ᩸;->ۙ(Ljava/lang/CharSequence;)Z

    move-result p2

    iput-boolean p2, p0, Ll/᩶ܽ᩸;->ܿ:Z

    invoke-virtual {p1, p2}, Ll/۬ۛ᩸;->ۙ(Z)V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I
    .locals 2

    .line 111
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    :goto_0
    if-gt p2, v0, :cond_1

    .line 113
    invoke-static {p0, p1, p2}, Ll/᩶ܽ᩸;->᩷(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/2addr p0, p2

    return p0

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۙ(IZ)J
    .locals 2

    int-to-long v0, p0

    const/4 p0, 0x1

    shl-long/2addr v0, p0

    int-to-long p0, p1

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static ۙ(Ll/᩺ۜ᩸;Ll/۬ۛ᩸;)V
    .locals 2

    .line 16
    new-instance v0, Ll/᩶ܽ᩸;

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/᩶ܽ᩸;-><init>(Ll/۬ۛ᩸;Ll/ᩳ۬᩸;)V

    .line 17
    new-instance p1, Ll/ܰܽ᩸;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ll/ܰܽ᩸;-><init>(I)V

    invoke-virtual {p0, p1}, Ll/᩺ۜ᩸;->ۙ(Ljava/util/function/Predicate;)V

    .line 18
    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private ۙ(Ljava/lang/CharSequence;)Z
    .locals 13

    .line 48
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_1e

    add-int/lit8 v4, v2, 0x1

    .line 51
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x3c

    if-eq v5, v6, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    if-ne v4, v0, :cond_2

    .line 52
    invoke-static {v0, v1}, Ll/᩶ܽ᩸;->ۙ(IZ)J

    move-result-wide v4

    goto/16 :goto_a

    .line 53
    :cond_2
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v7, 0x3f

    const-string v8, "?>"

    if-ne v5, v7, :cond_3

    add-int/lit8 v2, v2, 0x2

    .line 55
    invoke-static {v8, p1, v2}, Ll/᩶ܽ᩸;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v2

    goto/16 :goto_5

    :cond_3
    const/16 v7, 0x21

    const/16 v9, 0x3e

    if-ne v5, v7, :cond_11

    add-int/lit8 v4, v2, 0x2

    const-string v5, "--"

    .line 57
    invoke-static {v5, p1, v4}, Ll/᩶ܽ᩸;->᩷(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v5

    const-string v7, "-->"

    if-eqz v5, :cond_4

    add-int/lit8 v2, v2, 0x4

    .line 58
    invoke-static {v7, p1, v2}, Ll/᩶ܽ᩸;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v2

    goto/16 :goto_5

    :cond_4
    const-string v5, "[CDATA["

    .line 59
    invoke-static {v5, p1, v4}, Ll/᩶ܽ᩸;->᩷(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v5

    if-eqz v5, :cond_5

    add-int/lit8 v2, v2, 0x9

    const-string v4, "]]>"

    .line 60
    invoke-static {v4, p1, v2}, Ll/᩶ܽ᩸;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v2

    goto/16 :goto_5

    :cond_5
    const-string v5, "DOCTYPE"

    .line 61
    invoke-static {v5, p1, v4}, Ll/᩶ܽ᩸;->᩷(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v4

    if-eqz v4, :cond_10

    add-int/lit8 v2, v2, 0x9

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 122
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v10

    const/4 v11, -0x1

    if-ge v2, v10, :cond_f

    .line 123
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eqz v4, :cond_6

    if-ne v10, v4, :cond_e

    const/4 v4, 0x0

    goto :goto_3

    :cond_6
    const/16 v12, 0x27

    if-eq v10, v12, :cond_d

    const/16 v12, 0x22

    if-ne v10, v12, :cond_7

    goto :goto_2

    :cond_7
    if-ne v10, v6, :cond_8

    const-string v12, "<!--"

    .line 128
    invoke-static {v12, p1, v2}, Ll/᩶ܽ᩸;->᩷(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v12

    if-eqz v12, :cond_8

    add-int/lit8 v2, v2, 0x4

    .line 129
    invoke-static {v7, p1, v2}, Ll/᩶ܽ᩸;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v2

    if-gez v2, :cond_9

    goto :goto_4

    :cond_8
    if-ne v10, v6, :cond_a

    const-string v12, "<?"

    .line 132
    invoke-static {v12, p1, v2}, Ll/᩶ܽ᩸;->᩷(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v12

    if-eqz v12, :cond_a

    add-int/lit8 v2, v2, 0x2

    .line 133
    invoke-static {v8, p1, v2}, Ll/᩶ܽ᩸;->ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v2

    if-gez v2, :cond_9

    goto :goto_4

    :cond_9
    add-int/lit8 v2, v2, -0x1

    goto :goto_3

    :cond_a
    const/16 v11, 0x5b

    if-ne v10, v11, :cond_b

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_b
    const/16 v11, 0x5d

    if-ne v10, v11, :cond_c

    if-lez v5, :cond_c

    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    :cond_c
    if-ne v10, v9, :cond_e

    if-nez v5, :cond_e

    add-int/lit8 v11, v2, 0x1

    goto :goto_4

    :cond_d
    :goto_2
    move v4, v10

    :cond_e
    :goto_3
    add-int/2addr v2, v3

    goto :goto_1

    :cond_f
    :goto_4
    move v2, v11

    :goto_5
    if-gez v2, :cond_0

    .line 88
    invoke-static {v0, v1}, Ll/᩶ܽ᩸;->ۙ(IZ)J

    move-result-wide v4

    goto/16 :goto_a

    .line 64
    :cond_10
    invoke-static {v0, v1}, Ll/᩶ܽ᩸;->ۙ(IZ)J

    move-result-wide v4

    goto/16 :goto_a

    :cond_11
    const/4 v2, 0x1

    move v6, v4

    move v7, v6

    move v8, v5

    :goto_6
    const/4 v10, 0x6

    if-ge v6, v0, :cond_1a

    if-ne v6, v4, :cond_12

    move v8, v5

    goto :goto_7

    .line 72
    :cond_12
    invoke-interface {p1, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    :goto_7
    const/16 v11, 0x61

    const/16 v12, 0x3a

    if-lt v8, v11, :cond_13

    const/16 v11, 0x7a

    if-le v8, v11, :cond_16

    :cond_13
    const/16 v11, 0x41

    if-lt v8, v11, :cond_14

    const/16 v11, 0x5a

    if-le v8, v11, :cond_16

    :cond_14
    const/16 v11, 0x30

    if-lt v8, v11, :cond_15

    const/16 v11, 0x39

    if-le v8, v11, :cond_16

    :cond_15
    const/16 v11, 0x24

    if-eq v8, v11, :cond_16

    const/16 v11, 0x5f

    if-eq v8, v11, :cond_16

    const/16 v11, 0x2d

    if-eq v8, v11, :cond_16

    if-eq v8, v12, :cond_16

    const/16 v11, 0x2e

    if-eq v8, v11, :cond_16

    const/16 v11, 0xb7

    if-lt v8, v11, :cond_1a

    :cond_16
    if-ne v8, v12, :cond_17

    add-int/lit8 v7, v6, 0x1

    const/4 v2, 0x1

    goto :goto_8

    :cond_17
    sub-int v11, v6, v7

    if-ge v11, v10, :cond_18

    const-string v10, "vector"

    .line 80
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v8, v10, :cond_19

    :cond_18
    const/4 v2, 0x0

    :cond_19
    :goto_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_1a
    if-ne v6, v0, :cond_1b

    .line 84
    invoke-static {v0, v1}, Ll/᩶ܽ᩸;->ۙ(IZ)J

    move-result-wide v4

    goto :goto_a

    :cond_1b
    if-eqz v2, :cond_1d

    sub-int p1, v6, v7

    if-ne p1, v10, :cond_1d

    const/16 p1, 0x20

    if-le v8, p1, :cond_1c

    const/16 p1, 0x2f

    if-eq v8, p1, :cond_1c

    if-ne v8, v9, :cond_1d

    :cond_1c
    const/4 p1, 0x1

    goto :goto_9

    :cond_1d
    const/4 p1, 0x0

    .line 85
    :goto_9
    invoke-static {v6, p1}, Ll/᩶ܽ᩸;->ۙ(IZ)J

    move-result-wide v4

    goto :goto_a

    .line 90
    :cond_1e
    invoke-static {v0, v1}, Ll/᩶ܽ᩸;->ۙ(IZ)J

    move-result-wide v4

    :goto_a
    ushr-long v6, v4, v3

    long-to-int p1, v6

    .line 42
    iput p1, p0, Ll/᩶ܽ᩸;->᩶:I

    const-wide/16 v6, 0x1

    and-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-eqz p1, :cond_1f

    return v3

    :cond_1f
    return v1
.end method

.method public static ᩷(Ljava/lang/String;Ljava/lang/CharSequence;I)Z
    .locals 4

    .line 103
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 104
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    add-int v1, p2, v0

    .line 105
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_1

    :goto_1
    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 32
    iget p3, p0, Ll/᩶ܽ᩸;->᩶:I

    if-le p2, p3, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    invoke-direct {p0, p1}, Ll/᩶ܽ᩸;->ۙ(Ljava/lang/CharSequence;)Z

    move-result p1

    .line 34
    iget-boolean p2, p0, Ll/᩶ܽ᩸;->ܿ:Z

    if-eq p1, p2, :cond_1

    .line 35
    iput-boolean p1, p0, Ll/᩶ܽ᩸;->ܿ:Z

    .line 36
    iget-object p2, p0, Ll/᩶ܽ᩸;->ܰ:Ll/۬ۛ᩸;

    invoke-virtual {p2, p1}, Ll/۬ۛ᩸;->ۙ(Z)V

    :cond_1
    :goto_0
    return-void
.end method
