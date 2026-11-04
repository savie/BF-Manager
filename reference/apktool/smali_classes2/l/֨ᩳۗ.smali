.class public final Ll/֨ᩳۗ;
.super Ljava/lang/Object;
.source "KAQ1"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ֡:Ljava/lang/String;

.field public final ۟:Ll/֫֨ۗ;

.field public ܰ:Ljava/lang/String;

.field public ܿ:Ll/֨ᩳۗ;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֫ۖۗ;Ll/֫֨ۗ;Z)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p2, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    .line 28
    invoke-direct {p0, p1, p2, p3}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;Z)V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩳۗ;ZZ)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x2e

    if-eqz p2, :cond_4

    if-eqz p4, :cond_0

    const/16 v0, 0x24

    :cond_0
    if-eqz p3, :cond_2

    if-eqz p4, :cond_1

    .line 213
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object p0

    .line 230
    iget-object p3, p2, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    .line 213
    iget-object p2, p2, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    const/4 p4, 0x1

    invoke-static {p0, p3, p2, p4, p4}, Ll/֨ᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩳۗ;ZZ)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 191
    :cond_1
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    if-eqz p4, :cond_3

    .line 193
    invoke-virtual {p2}, Ll/֨ᩳۗ;->᩺()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 226
    :cond_3
    iget-object p0, p2, Ll/֨ᩳۗ;->ܰ:Ljava/lang/String;

    .line 0
    :goto_0
    invoke-static {v0, p0, p1}, Ll/۟ܺ᩹;->ۙ(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 197
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    return-object p1

    .line 0
    :cond_5
    invoke-static {v0, p0, p1}, Ll/۟ܺ᩹;->ۙ(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/֨ᩳۗ;
    .locals 0

    .line 43
    invoke-static {p1}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;
    .locals 2

    if-eqz p1, :cond_4

    .line 54
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    sget-object p1, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/֫֨ۗ;->᩺()Z

    move-result v0

    if-nez v0, :cond_3

    .line 61
    invoke-virtual {p1}, Ll/֫֨ۗ;->ۛ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/֫֨ۗ;->᩷(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p1

    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۙۢۗ;->ۙ(Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v0

    if-eqz v0, :cond_2

    return-object v0

    .line 37
    :cond_2
    invoke-virtual {p0}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۘۗ;->۬()Z

    move-result v0

    .line 38
    new-instance v1, Ll/֨ᩳۗ;

    invoke-direct {v1, p0, p1, v0}, Ll/֨ᩳۗ;-><init>(Ll/֫ۖۗ;Ll/֫֨ۗ;Z)V

    .line 39
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object p0

    invoke-virtual {p0, v1}, Ll/ۙۢۗ;->ۙ(Ll/֨ᩳۗ;)Ll/֨ᩳۗ;

    move-result-object p0

    return-object p0

    .line 59
    :cond_3
    new-instance p0, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not class type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p0

    .line 52
    :cond_4
    new-instance p0, Ll/۠ۧ᩵;

    const-string p1, "Null class type"

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p0
.end method

.method private ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;Z)V
    .locals 6

    .line 152
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x2e

    .line 155
    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    const-string v1, ""

    goto :goto_0

    .line 160
    :cond_0
    invoke-virtual {p2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v1, v3

    .line 161
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    move-object v1, v2

    :goto_0
    const/4 v2, 0x0

    if-eqz p3, :cond_2

    const/16 p3, 0x24

    .line 166
    invoke-virtual {p2, p3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p3

    if-lez p3, :cond_2

    .line 167
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v5, v3

    if-eq p3, v5, :cond_2

    .line 168
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 169
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 170
    invoke-virtual {p2, v4, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 172
    :cond_1
    iput-object v2, p0, Ll/֨ᩳۗ;->֡:Ljava/lang/String;

    .line 173
    invoke-static {p1, v0}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/֨ᩳۗ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    add-int/2addr p3, v3

    .line 174
    invoke-virtual {p2, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-nez v3, :cond_3

    .line 179
    iput-object v1, p0, Ll/֨ᩳۗ;->֡:Ljava/lang/String;

    .line 180
    iput-object v2, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    .line 182
    :cond_3
    iput-object p2, p0, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    .line 201
    iget-object p1, p0, Ll/֨ᩳۗ;->֡:Ljava/lang/String;

    iget-object p3, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    invoke-static {p1, p2, p3, v4, v4}, Ll/֨ᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩳۗ;ZZ)Ljava/lang/String;

    move-result-object p1

    .line 183
    iput-object p1, p0, Ll/֨ᩳۗ;->ܰ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 15
    check-cast p1, Ll/֨ᩳۗ;

    invoke-virtual {p0, p1}, Ll/֨ᩳۗ;->ۙ(Ll/֨ᩳۗ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 314
    :cond_0
    instance-of v0, p1, Ll/֨ᩳۗ;

    if-eqz v0, :cond_1

    .line 315
    check-cast p1, Ll/֨ᩳۗ;

    iget-object p1, p1, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    iget-object v0, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getType()Ll/֫֨ۗ;
    .locals 1

    .line 296
    iget-object v0, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 306
    iget-object v0, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/֨ᩳۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/֨ᩳۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ(Ll/֨ᩳۗ;)I
    .locals 1

    .line 249
    iget-object v0, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {p1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p1

    .line 322
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 5

    .line 130
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/֨ᩳۗ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    invoke-virtual {p0}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    .line 230
    iget-object v1, p0, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    .line 209
    iget-object v2, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Ll/֨ᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩳۗ;ZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 226
    :cond_0
    iget-object v0, p0, Ll/֨ᩳۗ;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 2

    .line 282
    iget-object v0, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;Z)V

    const/4 p1, 0x0

    .line 283
    iput-object p1, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)V
    .locals 3

    .line 287
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    iget-object v1, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;Z)V

    .line 288
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    return-void
.end method

.method public final ۛ()Z
    .locals 1

    .line 278
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 235
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    if-eqz v0, :cond_0

    .line 236
    invoke-virtual {v0}, Ll/֨ᩳۗ;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 238
    :cond_0
    iget-object v0, p0, Ll/֨ᩳۗ;->֡:Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    .line 239
    :cond_1
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Package is null for not inner class"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 239
    throw v0
.end method

.method public final ۨ()Z
    .locals 1

    .line 140
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/֨ᩳۗ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۫()Ljava/lang/String;
    .locals 1

    .line 230
    iget-object v0, p0, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 112
    invoke-virtual {p0}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    invoke-virtual {v0}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 115
    :cond_0
    invoke-virtual {p0}, Ll/֨ᩳۗ;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Ll/֨ᩳۗ;
    .locals 1

    .line 270
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    if-eqz v0, :cond_1

    .line 271
    invoke-virtual {v0}, Ll/֨ᩳۗ;->᩵()Ll/֨ᩳۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 272
    :cond_0
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷(Ll/֫ۖۗ;)V
    .locals 2

    .line 292
    iget-object v0, p0, Ll/֨ᩳۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {p0}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;Z)V

    return-void
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 2

    .line 253
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    if-nez v0, :cond_0

    .line 230
    iget-object v0, p0, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    return-object v0

    .line 256
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    invoke-virtual {v1}, Ll/֨ᩳۗ;->᩸()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 230
    iget-object v1, p0, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 1

    .line 230
    iget-object v0, p0, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩺()Ljava/lang/String;
    .locals 5

    .line 205
    iget-object v0, p0, Ll/֨ᩳۗ;->֡:Ljava/lang/String;

    iget-object v1, p0, Ll/֨ᩳۗ;->᩶:Ljava/lang/String;

    iget-object v2, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Ll/֨ᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/֨ᩳۗ;ZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ll/֨ᩳۗ;
    .locals 1

    .line 263
    iget-object v0, p0, Ll/֨ᩳۗ;->ܿ:Ll/֨ᩳۗ;

    return-object v0
.end method
