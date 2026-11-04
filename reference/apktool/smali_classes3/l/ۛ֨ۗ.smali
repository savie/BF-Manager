.class public final Ll/ۛ֨ۗ;
.super Ll/ܺ֨ۗ;
.source "76F2"

# interfaces
.implements Ll/ۗ֨ۗ;


# instance fields
.field public ֨:Ll/ܿ֨ۗ;

.field public final ۢ:I


# direct methods
.method public constructor <init>(ILl/֫֨ۗ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ll/ܺ֨ۗ;-><init>()V

    .line 22
    iput-object p2, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 23
    iput p1, p0, Ll/ۛ֨ۗ;->ۢ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 210
    :cond_0
    instance-of v1, p1, Ll/ۛ֨ۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 213
    :cond_1
    check-cast p1, Ll/ۛ֨ۗ;

    .line 214
    iget v1, p0, Ll/ۛ֨ۗ;->ۢ:I

    iget v3, p1, Ll/ۛ֨ۗ;->ۢ:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 79
    iget-object p1, p1, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 215
    invoke-static {v1, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 105
    sget-object v0, Ll/֫۟ۗ;->֫᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "super"

    return-object v0

    .line 252
    :cond_0
    sget-object v0, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "this"

    return-object v0

    .line 98
    :cond_1
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return-object v0

    .line 101
    :cond_2
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ll/֫֨ۗ;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v0

    return-object v0

    .line 44
    :cond_0
    sget-object v0, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 202
    iget v0, p0, Ll/ۛ֨ۗ;->ۢ:I

    return v0
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 111
    invoke-virtual {v0, p1}, Ll/ܿ֨ۗ;->ۙ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(r"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    iget v1, p0, Ll/ۛ֨ۗ;->ۢ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v1, :cond_0

    const/16 v1, 0x76

    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ۛ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 235
    :cond_0
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, " \'"

    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    :cond_1
    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x20

    if-eqz v1, :cond_3

    .line 240
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    :cond_3
    iget-object v3, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    if-eqz v1, :cond_4

    .line 243
    invoke-virtual {v1, v3}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v1}, Ll/֫֨ۗ;->᩶()Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    const-string v1, " I:"

    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    :cond_5
    invoke-virtual {p0}, Ll/ܺ۟ۗ;->ۢ()Z

    move-result v1

    if-nez v1, :cond_6

    .line 247
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܺ۟ۗ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    const/16 v1, 0x29

    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 250
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 2

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "r"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    iget v1, p0, Ll/ۛ֨ۗ;->ۢ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v1, :cond_0

    const/16 v1, 0x76

    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    invoke-virtual {v1}, Ll/ܿ֨ۗ;->ۛ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۖ()Z
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v0

    return v0

    .line 75
    :cond_0
    sget-object v0, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    return v0
.end method

.method public final ۗۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 87
    iput-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    return-void
.end method

.method public final ۙ(ILl/֫֨ۗ;Ll/ܿ֨ۗ;)Ll/ۛ֨ۗ;
    .locals 1

    .line 149
    new-instance v0, Ll/ۛ֨ۗ;

    invoke-direct {v0, p1, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    if-eqz p3, :cond_0

    .line 83
    iput-object p3, v0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 323
    :cond_0
    invoke-virtual {v0, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 324
    iget-object p1, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    invoke-virtual {v0, p1}, Ll/ܺ֨ۗ;->ۙ(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ۙ(ILl/ܿ֨ۗ;)Ll/ۛ֨ۗ;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 145
    invoke-virtual {p0, p1, v0, p2}, Ll/ۛ֨ۗ;->ۙ(ILl/֫֨ۗ;Ll/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۖۡۗ;)Ll/ۛ֨ۗ;
    .locals 3

    .line 36
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    const/4 v1, 0x0

    .line 139
    iget v2, p0, Ll/ۛ֨ۗ;->ۢ:I

    invoke-virtual {p0, v2, v0, v1}, Ll/ۛ֨ۗ;->ۙ(ILl/֫֨ۗ;Ll/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v0

    .line 140
    invoke-virtual {p1, v0}, Ll/ۖۡۗ;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 2

    .line 49
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0, p1}, Ll/ܿ֨ۗ;->᩷(Ll/֫֨ۗ;)V

    return-void

    .line 50
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t change type for register without SSA variable: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    throw p1
.end method

.method public final ۙ(Ll/ܿ֨ۗ;)V
    .locals 0

    .line 83
    iput-object p1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    return-void
.end method

.method public final ۙ(Ll/ܺ֨ۗ;)Z
    .locals 2

    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/ۛ֨ۗ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 185
    :cond_0
    check-cast p1, Ll/ۛ֨ۗ;

    .line 27
    iget p1, p1, Ll/ۛ֨ۗ;->ۢ:I

    .line 185
    iget v0, p0, Ll/ۛ֨ۗ;->ۢ:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final ۠()Ll/ۛ֨ۗ;
    .locals 3

    .line 36
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 131
    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    iget v2, p0, Ll/ۛ֨ۗ;->ۢ:I

    invoke-virtual {p0, v2, v0, v1}, Ll/ۛ֨ۗ;->ۙ(ILl/֫֨ۗ;Ll/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ۠()Ll/ܺ֨ۗ;
    .locals 1

    .line 13
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧۙ()Ll/ᩳۡۗ;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 162
    :cond_0
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    .line 92
    iget-object v0, v0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public final ܶۙ()Ll/ܿ֨ۗ;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    return-object v0
.end method

.method public final ܺۙ()Ll/֫֨ۗ;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ܽۙ()I
    .locals 1

    .line 27
    iget v0, p0, Ll/ۛ֨ۗ;->ۢ:I

    return v0
.end method

.method public final ᩷(Ll/֫֨ۗ;)Ll/ۛ֨ۗ;
    .locals 2

    .line 27
    iget v0, p0, Ll/ۛ֨ۗ;->ۢ:I

    .line 135
    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    invoke-virtual {p0, v0, p1, v1}, Ll/ۛ֨ۗ;->ۙ(ILl/֫֨ۗ;Ll/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷(Ll/ۛ֨ۗ;)Z
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 193
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v0

    .line 79
    iget-object p1, p1, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 193
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(Ll/ܺ֨ۗ;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 173
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, p1, Ll/ۛ֨ۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 176
    :cond_1
    check-cast p1, Ll/ۛ֨ۗ;

    .line 177
    iget v1, p0, Ll/ۛ֨ۗ;->ۢ:I

    .line 27
    iget v3, p1, Ll/ۛ֨ۗ;->ۢ:I

    if-ne v1, v3, :cond_2

    .line 177
    iget-object v1, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 79
    iget-object p1, p1, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 178
    invoke-static {v1, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final ᩹ۙ()Z
    .locals 2

    .line 79
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    .line 197
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ֨ۗ;->᩸()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻ۙ()Ll/֫֨ۗ;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۛ֨ۗ;->֨:Ll/ܿ֨ۗ;

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v0

    return-object v0

    .line 64
    :cond_0
    sget-object v0, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
