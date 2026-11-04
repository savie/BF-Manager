.class public final Ll/ᩳۡۛ;
.super Ljava/lang/Object;
.source "Q9CF"


# instance fields
.field public final ۙ:Ll/ۙۖۛ;

.field public final ۤ:Ljava/lang/String;

.field public final ᩷:[Ljava/lang/Object;

.field public final ᩸:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ۙۖۛ;[Ljava/lang/Object;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Ll/ᩳۡۛ;->᩸:Ljava/lang/String;

    .line 69
    iput-object p2, p0, Ll/ᩳۡۛ;->ۤ:Ljava/lang/String;

    .line 70
    iput-object p3, p0, Ll/ᩳۡۛ;->ۙ:Ll/ۙۖۛ;

    .line 71
    iput-object p4, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    return-void
.end method

.method private ۙ(Ljava/lang/StringBuilder;)Z
    .locals 6

    .line 191
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/16 v1, 0x4000

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    goto :goto_1

    .line 194
    :cond_0
    iget-object v0, p0, Ll/ᩳۡۛ;->᩸:Ljava/lang/String;

    .line 195
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " : "

    .line 196
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ᩳۡۛ;->ۤ:Ljava/lang/String;

    .line 197
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    .line 198
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳۡۛ;->ۙ:Ll/ۙۖۛ;

    .line 199
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 201
    iget-object v0, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    .line 202
    instance-of v5, v4, Ll/ᩳۡۛ;

    if-eqz v5, :cond_1

    .line 206
    check-cast v4, Ll/ᩳۡۛ;

    invoke-direct {v4, p1}, Ll/ᩳۡۛ;->ۙ(Ljava/lang/StringBuilder;)Z

    move-result v4

    if-nez v4, :cond_2

    :goto_1
    return v2

    .line 210
    :cond_1
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 150
    :cond_0
    instance-of v1, p1, Ll/ᩳۡۛ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 153
    :cond_1
    check-cast p1, Ll/ᩳۡۛ;

    .line 154
    iget-object v1, p0, Ll/ᩳۡۛ;->᩸:Ljava/lang/String;

    iget-object v3, p1, Ll/ᩳۡۛ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ᩳۡۛ;->ۤ:Ljava/lang/String;

    iget-object v3, p1, Ll/ᩳۡۛ;->ۤ:Ljava/lang/String;

    .line 155
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ᩳۡۛ;->ۙ:Ll/ۙۖۛ;

    iget-object v3, p1, Ll/ᩳۡۛ;->ۙ:Ll/ۙۖۛ;

    .line 156
    invoke-virtual {v1, v3}, Ll/ۙۖۛ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    iget-object p1, p1, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    .line 159
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 164
    iget-object v0, p0, Ll/ᩳۡۛ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/ᩳۡۛ;->ۤ:Ljava/lang/String;

    .line 165
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Ll/ᩳۡۛ;->ۙ:Ll/ۙۖۛ;

    .line 166
    invoke-virtual {v1}, Ll/ۙۖۛ;->hashCode()I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    .line 169
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    const/16 v2, 0x18

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    invoke-direct {p0, v0}, Ll/ᩳۡۛ;->ۙ(Ljava/lang/StringBuilder;)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x3ffd

    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    const-string v1, "..."

    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(I)Ljava/lang/Object;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۙ()Ll/ۙۖۛ;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ᩳۡۛ;->ۙ:Ll/ۙۖۛ;

    return-object v0
.end method

.method public final ۤ()[Ljava/lang/Object;
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ᩳۡۛ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method

.method public final ᩷(I)I
    .locals 6

    add-int/lit8 p1, p1, -0x1

    const/4 v0, 0x0

    if-gtz p1, :cond_0

    return v0

    .line 231
    :cond_0
    iget-object v1, p0, Ll/ᩳۡۛ;->᩷:[Ljava/lang/Object;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 232
    instance-of v5, v4, Ll/ᩳۡۛ;

    if-eqz v5, :cond_1

    .line 234
    check-cast v4, Ll/ᩳۡۛ;

    invoke-virtual {v4, p1}, Ll/ᩳۡۛ;->᩷(I)I

    move-result p1

    if-gtz p1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return p1
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ᩳۡۛ;->ۤ:Ljava/lang/String;

    return-object v0
.end method
