.class public final Ll/֨ۢۗ;
.super Ll/ۡۢۗ;
.source "RBDA"


# instance fields
.field public ۖ:I

.field public ۙۙ:Ll/ۢۢۗ;

.field public ۜ:[Ljava/lang/Object;

.field public ۠:Ll/᩷ۡۗ;

.field public final ۡ:I

.field public final ۬:Z

.field public ᩷ۙ:[Ll/᩷ۡۗ;


# direct methods
.method public constructor <init>(Ll/ܺ֨ۗ;IZ)V
    .locals 2

    .line 29
    sget-object v0, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x1

    .line 9
    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 30
    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 31
    iput p2, p0, Ll/֨ۢۗ;->ۡ:I

    .line 32
    iput-boolean p3, p0, Ll/֨ۢۗ;->۬:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 10

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    iget-object v1, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    if-nez v1, :cond_0

    const-string v1, "no payload"

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 109
    :cond_0
    invoke-virtual {v1}, Ll/ۢۢۗ;->ۛۙ()I

    move-result v1

    .line 110
    iget-object v2, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    invoke-virtual {v2}, Ll/ۢۢۗ;->᩵ۙ()[I

    move-result-object v2

    .line 111
    iget-object v3, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    const-string v4, "\n default: goto "

    const/4 v5, -0x1

    const-string v6, ": goto "

    const-string v7, "\n case "

    const/4 v8, 0x0

    if-eqz v3, :cond_2

    :goto_0
    if-ge v8, v1, :cond_1

    .line 113
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    aget v3, v2, v8

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    aget-object v3, v3, v8

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 116
    :cond_1
    iget v1, p0, Ll/֨ۢۗ;->ۖ:I

    if-eq v1, v5, :cond_4

    .line 117
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۢۗ;->۠:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 120
    :cond_2
    iget-object v3, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    invoke-virtual {v3}, Ll/ۢۢۗ;->᩺ۙ()[I

    move-result-object v3

    :goto_1
    if-ge v8, v1, :cond_3

    .line 122
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    aget v9, v2, v8

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v9, v3, v8

    invoke-static {v9}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 125
    :cond_3
    iget v1, p0, Ll/֨ۢۗ;->ۖ:I

    if-eq v1, v5, :cond_4

    .line 126
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    iget v1, p0, Ll/֨ۢۗ;->ۖ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ljava/lang/StringBuilder;)V

    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡ۙ()Z
    .locals 1

    .line 36
    iget-object v0, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(ILjava/lang/Object;)V
    .locals 5

    .line 171
    iget-object v0, p0, Ll/֨ۢۗ;->ۜ:[Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 172
    invoke-virtual {p0}, Ll/֨ۢۗ;->ܰۙ()[I

    move-result-object v0

    .line 173
    array-length v1, v0

    .line 174
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 176
    aget v4, v0, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 178
    :cond_0
    iput-object v2, p0, Ll/֨ۢۗ;->ۜ:[Ljava/lang/Object;

    .line 180
    :cond_1
    iget-object v0, p0, Ll/֨ۢۗ;->ۜ:[Ljava/lang/Object;

    aput-object p2, v0, p1

    return-void
.end method

.method public final ۙ(Ll/ۢۢۗ;I)V
    .locals 0

    .line 40
    iput-object p1, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    .line 41
    iput p2, p0, Ll/֨ۢۗ;->ۖ:I

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 5

    .line 46
    iget-object v0, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p1

    .line 50
    iget-object v0, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    invoke-virtual {v0}, Ll/ۢۢۗ;->᩺ۙ()[I

    move-result-object v0

    .line 51
    array-length v1, v0

    .line 52
    new-array v2, v1, [Ll/᩷ۡۗ;

    iput-object v2, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 54
    iget-object v3, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    aget v4, v0, v2

    invoke-static {v4, p1}, Ll/᩹֫᩵;->ۙ(ILjava/util/List;)Ll/᩷ۡۗ;

    move-result-object v4

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    :cond_0
    iget v0, p0, Ll/֨ۢۗ;->ۖ:I

    invoke-static {v0, p1}, Ll/᩹֫᩵;->ۙ(ILjava/util/List;)Ll/᩷ۡۗ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۢۗ;->۠:Ll/᩷ۡۗ;

    return-void

    .line 47
    :cond_1
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Switch data not yet attached"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 47
    throw p1
.end method

.method public final ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 4

    .line 61
    iget-object v0, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    if-nez v0, :cond_0

    goto :goto_1

    .line 65
    :cond_0
    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 67
    iget-object v2, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    aget-object v3, v2, v1

    if-ne v3, p1, :cond_1

    .line 68
    aput-object p2, v2, v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 72
    :cond_2
    iget-object v0, p0, Ll/֨ۢۗ;->۠:Ll/᩷ۡۗ;

    if-ne v0, p1, :cond_3

    .line 73
    iput-object p2, p0, Ll/֨ۢۗ;->۠:Ll/᩷ۡۗ;

    :cond_3
    :goto_1
    return-void
.end method

.method public final ۛۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 188
    iget-object v0, p0, Ll/֨ۢۗ;->۠:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۫(I)Ljava/lang/Object;
    .locals 1

    .line 164
    iget-object v0, p0, Ll/֨ۢۗ;->ۜ:[Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 165
    aget-object p1, v0, p1

    return-object p1

    .line 149
    :cond_0
    iget-object v0, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    if-eqz v0, :cond_1

    .line 167
    invoke-virtual {v0}, Ll/ۢۢۗ;->᩵ۙ()[I

    move-result-object v0

    aget p1, v0, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 150
    :cond_1
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Switch data not yet attached"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 150
    throw p1
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 4

    .line 94
    new-instance v0, Ll/֨ۢۗ;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    iget v2, p0, Ll/֨ۢۗ;->ۡ:I

    iget-boolean v3, p0, Ll/֨ۢۗ;->۬:Z

    invoke-direct {v0, v1, v2, v3}, Ll/֨ۢۗ;-><init>(Ll/ܺ֨ۗ;IZ)V

    .line 95
    iget-object v1, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    iput-object v1, v0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    .line 96
    iget v1, p0, Ll/֨ۢۗ;->ۖ:I

    iput v1, v0, Ll/֨ۢۗ;->ۖ:I

    .line 97
    iget-object v1, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    iput-object v1, v0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    .line 98
    iget-object v1, p0, Ll/֨ۢۗ;->۠:Ll/᩷ۡۗ;

    iput-object v1, v0, Ll/֨ۢۗ;->۠:Ll/᩷ۡۗ;

    .line 99
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ܰۙ()[I
    .locals 2

    .line 149
    iget-object v0, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0}, Ll/ۢۢۗ;->᩵ۙ()[I

    move-result-object v0

    return-object v0

    .line 150
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Switch data not yet attached"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 150
    throw v0
.end method

.method public final ܿۙ()[I
    .locals 2

    .line 149
    iget-object v0, p0, Ll/֨ۢۗ;->ۙۙ:Ll/ۢۢۗ;

    if-eqz v0, :cond_0

    .line 156
    invoke-virtual {v0}, Ll/ۢۢۗ;->᩺ۙ()[I

    move-result-object v0

    return-object v0

    .line 150
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Switch data not yet attached"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 150
    throw v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    instance-of v0, p1, Ll/֨ۢۗ;

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 87
    :cond_1
    check-cast p1, Ll/֨ۢۗ;

    .line 88
    iget v0, p0, Ll/֨ۢۗ;->ۡ:I

    iget v1, p1, Ll/֨ۢۗ;->ۡ:I

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ll/֨ۢۗ;->۬:Z

    iget-boolean p1, p1, Ll/֨ۢۗ;->۬:Z

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩴۤ()Z
    .locals 1

    .line 140
    iget-boolean v0, p0, Ll/֨ۢۗ;->۬:Z

    return v0
.end method

.method public final ᩵ۙ()I
    .locals 1

    .line 136
    iget v0, p0, Ll/֨ۢۗ;->ۡ:I

    return v0
.end method

.method public final ᩶ۙ()[Ll/᩷ۡۗ;
    .locals 1

    .line 184
    iget-object v0, p0, Ll/֨ۢۗ;->᩷ۙ:[Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ᩺ۙ()I
    .locals 1

    .line 144
    iget v0, p0, Ll/֨ۢۗ;->ۖ:I

    return v0
.end method
