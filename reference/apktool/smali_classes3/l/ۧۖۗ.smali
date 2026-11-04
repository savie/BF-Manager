.class public final Ll/ۧۖۗ;
.super Ljava/lang/Object;
.source "0ISU"


# instance fields
.field public final ۙ:I

.field public ۤ:I

.field public ᩷:I

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 18
    const-class v0, Ll/ۧۖۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll/ۧۖۗ;->ۙ:I

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Ll/ۧۖۗ;->ۤ:I

    const/4 p1, 0x0

    .line 31
    iput p1, p0, Ll/ۧۖۗ;->᩷:I

    return-void
.end method

.method private ۙ(Z)Ll/֫֨ۗ;
    .locals 8

    .line 66
    iget v0, p0, Ll/ۧۖۗ;->ۤ:I

    iput v0, p0, Ll/ۧۖۗ;->᩷:I

    :cond_0
    const/16 v0, 0x2e

    if-eqz p1, :cond_1

    .line 194
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 196
    invoke-direct {p0}, Ll/ۧۖۗ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 198
    :cond_1
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    const/16 v2, 0x3c

    const/16 v3, 0x3b

    if-eq v1, v2, :cond_3

    if-ne v1, v3, :cond_0

    .line 204
    :cond_3
    iget-object v2, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/16 v7, 0x2f

    if-ne v1, v3, :cond_7

    if-eqz p1, :cond_6

    .line 75
    iget p1, p0, Ll/ۧۖۗ;->᩷:I

    if-ne p1, v6, :cond_4

    goto :goto_0

    :cond_4
    move v5, p1

    .line 76
    :goto_0
    iget p1, p0, Ll/ۧۖۗ;->ۤ:I

    if-lt v5, p1, :cond_5

    goto :goto_1

    .line 79
    :cond_5
    invoke-virtual {v2, v5, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 207
    :goto_1
    invoke-virtual {v4, v7, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 209
    :cond_6
    invoke-direct {p0}, Ll/ۧۖۗ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    .line 211
    :goto_2
    invoke-static {p1}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 75
    :cond_7
    iget v1, p0, Ll/ۧۖۗ;->᩷:I

    if-ne v1, v6, :cond_8

    goto :goto_3

    :cond_8
    move v5, v1

    .line 76
    :goto_3
    iget v1, p0, Ll/ۧۖۗ;->ۤ:I

    if-lt v5, v1, :cond_9

    goto :goto_4

    .line 79
    :cond_9
    invoke-virtual {v2, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    :goto_4
    if-nez p1, :cond_a

    .line 216
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    .line 218
    :cond_a
    invoke-virtual {v4, v7, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    .line 249
    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    const/16 v2, 0x2a

    .line 252
    invoke-direct {p0, v2}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 253
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    .line 254
    invoke-static {}, Ll/֫֨ۗ;->ᩳ()Ll/֫֨ۗ;

    move-result-object v2

    goto :goto_6

    :cond_c
    const/16 v2, 0x2b

    .line 255
    invoke-direct {p0, v2}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 256
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    .line 257
    invoke-virtual {p0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v2

    sget-object v4, Ll/۫֨ۗ;->֡:Ll/۫֨ۗ;

    invoke-static {v2, v4}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/۫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v2

    goto :goto_6

    :cond_d
    const/16 v2, 0x2d

    .line 258
    invoke-direct {p0, v2}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 259
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    .line 260
    invoke-virtual {p0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v2

    sget-object v4, Ll/۫֨ۗ;->۟:Ll/۫֨ۗ;

    invoke-static {v2, v4}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/۫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v2

    goto :goto_6

    .line 262
    :cond_e
    invoke-virtual {p0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v2

    :goto_6
    if-eqz v2, :cond_f

    .line 265
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    const/16 v4, 0x3e

    if-eqz v2, :cond_10

    .line 267
    invoke-direct {p0, v4}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 221
    :cond_10
    invoke-direct {p0, v4}, Ll/ۧۖۗ;->ۙ(C)V

    .line 223
    invoke-static {p1, v1}, Ll/֫֨ۗ;->ۙ(Ljava/lang/String;Ljava/util/List;)Ll/֫֨ۗ;

    move-result-object p1

    .line 224
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v1

    if-nez v1, :cond_11

    .line 225
    invoke-direct {p0, v3}, Ll/ۧۖۗ;->ۙ(C)V

    return-object p1

    .line 228
    :cond_11
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    .line 229
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    const/4 v1, 0x1

    .line 231
    invoke-direct {p0, v1}, Ll/ۧۖۗ;->ۙ(Z)Ll/֫֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_14

    .line 236
    :goto_7
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 237
    invoke-static {p1, v2}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    .line 238
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    .line 239
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    .line 240
    invoke-direct {p0, v1}, Ll/ۧۖۗ;->ۙ(Z)Ll/֫֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_12

    goto :goto_7

    .line 242
    :cond_12
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected inner type found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/ۧۖۗ;->᩸()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 242
    throw p1

    .line 245
    :cond_13
    invoke-static {p1, v2}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    return-object p1

    .line 233
    :cond_14
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No inner type found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/ۧۖۗ;->᩸()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 233
    throw p1
.end method

.method public static ۙ(Ll/ۨᩳۗ;)Ll/ۧۖۗ;
    .locals 1

    .line 45
    sget-object v0, Ll/᩻᩶ۗ;->֫:Ll/᩻᩶ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p0

    check-cast p0, Ll/ܰ᩶ۗ;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object p0, v0

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p0}, Ll/ܰ᩶ۗ;->ۙ()Ljava/lang/String;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_1

    return-object v0

    .line 40
    :cond_1
    new-instance v0, Ll/ۧۖۗ;

    invoke-direct {v0, p0}, Ll/ۧۖۗ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private ۙ(C)V
    .locals 4

    .line 112
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    move-result v0

    if-ne p1, v0, :cond_0

    return-void

    .line 114
    :cond_0
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Consume wrong char: \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "\' != \'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "\', sign: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    invoke-direct {p0}, Ll/ۧۖۗ;->᩸()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 115
    throw v1
.end method

.method private ܳ()C
    .locals 2

    .line 53
    iget v0, p0, Ll/ۧۖۗ;->ۤ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۧۖۗ;->ۤ:I

    .line 54
    iget v1, p0, Ll/ۧۖۗ;->ۙ:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 57
    :cond_0
    iget-object v1, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0
.end method

.method private ᩴ()Ljava/lang/String;
    .locals 3

    .line 86
    iget v0, p0, Ll/ۧۖۗ;->᩷:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 90
    :cond_0
    iget v1, p0, Ll/ۧۖۗ;->ۤ:I

    add-int/lit8 v1, v1, 0x1

    if-lt v0, v1, :cond_1

    const-string v0, ""

    return-object v0

    .line 94
    :cond_1
    iget-object v2, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private ᩷(C)Z
    .locals 3

    .line 61
    iget v0, p0, Ll/ۧۖۗ;->ۤ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 62
    iget v2, p0, Ll/ۧۖۗ;->ۙ:I

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ᩸()Ljava/lang/String;
    .locals 3

    .line 365
    iget v0, p0, Ll/ۧۖۗ;->ۤ:I

    iget-object v1, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v0, v2, :cond_0

    return-object v1

    .line 368
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at position "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۧۖۗ;->ۤ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " (\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۧۖۗ;->ۤ:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 373
    iget v0, p0, Ll/ۧۖۗ;->ۤ:I

    const/4 v1, -0x1

    iget-object v2, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    if-ne v0, v1, :cond_0

    return-object v2

    .line 376
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    iget v3, p0, Ll/ۧۖۗ;->᩷:I

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۧۖۗ;->᩷:I

    iget v3, p0, Ll/ۧۖۗ;->ۤ:I

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۧۖۗ;->ۤ:I

    .line 0
    invoke-static {v1, v2, v0}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 6

    const/16 v0, 0x3c

    .line 278
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v1

    if-nez v1, :cond_0

    .line 279
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 281
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 282
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    :goto_0
    const/16 v0, 0x3e

    .line 284
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    .line 66
    :cond_1
    iget v2, p0, Ll/ۧۖۗ;->ۤ:I

    iput v2, p0, Ll/ۧۖۗ;->᩷:I

    :cond_2
    const/16 v0, 0x3a

    .line 100
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 130
    invoke-direct {p0}, Ll/ۧۖۗ;->ᩴ()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 103
    :cond_3
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    move-result v3

    if-nez v3, :cond_2

    .line 105
    iput v2, p0, Ll/ۧۖۗ;->ۤ:I

    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_a

    .line 291
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    .line 120
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 121
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    .line 306
    :cond_4
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 309
    :cond_5
    invoke-virtual {p0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 313
    sget-object v5, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-virtual {v4, v5}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 314
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 315
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 317
    :cond_6
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    :cond_7
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 321
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    :cond_8
    if-nez v4, :cond_5

    .line 294
    invoke-static {v2, v3}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;Ljava/util/List;)Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 311
    :cond_9
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Unexpected end of signature"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 311
    throw v0

    .line 289
    :cond_a
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Failed to parse generic types map"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 289
    throw v0

    .line 296
    :cond_b
    :goto_2
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    return-object v1
.end method

.method public final ۙ(I)Ljava/util/List;
    .locals 3

    const/16 v0, 0x28

    .line 328
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    const/16 v0, 0x29

    .line 329
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 330
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    .line 331
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    .line 333
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    add-int/lit8 p1, p1, 0xa

    .line 336
    :cond_1
    invoke-virtual {p0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 340
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v2, p1, :cond_2

    .line 344
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 345
    invoke-direct {p0, v0}, Ll/ۧۖۗ;->ۙ(C)V

    return-object v1

    .line 342
    :cond_2
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Arguments count limit reached: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 342
    throw p1

    .line 338
    :cond_3
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Unexpected end of signature"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 338
    throw p1
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ۧۖۗ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ll/֫֨ۗ;
    .locals 5

    .line 134
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    const/16 v2, 0x4c

    if-eq v0, v2, :cond_5

    const/16 v2, 0x54

    if-eq v0, v2, :cond_1

    const/16 v1, 0x5b

    if-eq v0, v1, :cond_0

    .line 163
    invoke-static {v0}, Ll/֫֨ۗ;->ۙ(C)Ll/֫֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_6

    return-object v1

    .line 156
    :cond_0
    invoke-virtual {p0}, Ll/ۧۖۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v0

    invoke-static {v0}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    return-object v0

    .line 143
    :cond_1
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    .line 66
    iget v2, p0, Ll/ۧۖۗ;->ۤ:I

    iput v2, p0, Ll/ۧۖۗ;->᩷:I

    :cond_2
    const/16 v3, 0x3b

    .line 100
    invoke-direct {p0, v3}, Ll/ۧۖۗ;->᩷(C)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 130
    invoke-direct {p0}, Ll/ۧۖۗ;->ᩴ()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 103
    :cond_3
    invoke-direct {p0}, Ll/ۧۖۗ;->ܳ()C

    move-result v4

    if-nez v4, :cond_2

    .line 105
    iput v2, p0, Ll/ۧۖۗ;->ۤ:I

    :goto_0
    if-eqz v1, :cond_6

    .line 147
    invoke-direct {p0, v3}, Ll/ۧۖۗ;->ۙ(C)V

    const-string v0, ")"

    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 151
    invoke-static {v1}, Ll/֫֨ۗ;->ۙ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v0

    return-object v0

    .line 149
    :cond_4
    new-instance v0, Ll/۠ۧ᩵;

    const-string v2, "Bad name for type variable: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 149
    throw v0

    :cond_5
    const/4 v1, 0x0

    .line 137
    invoke-direct {p0, v1}, Ll/ۧۖۗ;->ۙ(Z)Ll/֫֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_6

    return-object v1

    .line 169
    :cond_6
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t parse type: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/ۧۖۗ;->᩸()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", unexpected: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 169
    throw v1

    :cond_7
    return-object v1
.end method
