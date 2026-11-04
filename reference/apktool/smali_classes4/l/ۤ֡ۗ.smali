.class public final Ll/ۤ֡ۗ;
.super Ljava/lang/Object;
.source "Q6BK"

# interfaces
.implements Ll/᩶ۡۗ;
.implements Ljava/lang/Comparable;


# instance fields
.field public final ֡:Ll/֫֨ۗ;

.field public final ۟:Ljava/util/List;

.field public final ܰ:I

.field public final ܿ:Ll/᩷ۢۗ;

.field public final ᩳ:Ljava/util/List;

.field public final ᩶:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/᩷ۢۗ;Ljava/util/List;Ll/֫֨ۗ;Ljava/util/List;Ljava/util/List;I)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    .line 30
    iput-object p2, p0, Ll/ۤ֡ۗ;->᩶:Ljava/util/List;

    .line 31
    iput-object p3, p0, Ll/ۤ֡ۗ;->֡:Ll/֫֨ۗ;

    .line 32
    iput-object p4, p0, Ll/ۤ֡ۗ;->ᩳ:Ljava/util/List;

    .line 33
    iput-object p5, p0, Ll/ۤ֡ۗ;->۟:Ljava/util/List;

    .line 34
    iput p6, p0, Ll/ۤ֡ۗ;->ܰ:I

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 17
    check-cast p1, Ll/ۤ֡ۗ;

    .line 99
    iget-object v0, p0, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    iget-object p1, p1, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    invoke-virtual {v0, p1}, Ll/᩷ۢۗ;->ۙ(Ll/᩷ۢۗ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 85
    :cond_0
    instance-of v0, p1, Ll/ۤ֡ۗ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 88
    :cond_1
    check-cast p1, Ll/ۤ֡ۗ;

    .line 89
    iget-object v0, p0, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    iget-object p1, p1, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    invoke-virtual {v0, p1}, Ll/᩷ۢۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    invoke-virtual {v0}, Ll/᩷ۢۗ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClspMth{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    iget-object v1, p0, Ll/ۤ֡ۗ;->ᩳ:Ljava/util/List;

    invoke-static {v1}, Ll/ۘۧ᩵;->᩷(Ljava/util/Collection;)Z

    move-result v2

    const-string v3, ", "

    if-eqz v2, :cond_0

    const/16 v2, 0x3c

    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    invoke-static {v1, v3}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "> "

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    :cond_0
    iget-object v1, p0, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    .line 116
    invoke-virtual {v1}, Ll/᩷ۢۗ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    iget-object v1, p0, Ll/ۤ֡ۗ;->᩶:Ljava/util/List;

    .line 72
    invoke-static {v1, v3}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "):"

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    iget-object v1, p0, Ll/ۤ֡ۗ;->֡:Ll/֫֨ۗ;

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    invoke-virtual {p0}, Ll/ۤ֡ۗ;->ۛ()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, " VARARG"

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_1
    iget-object v1, p0, Ll/ۤ֡ۗ;->۟:Ljava/util/List;

    invoke-static {v1}, Ll/ۘۧ᩵;->᩷(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, " throws "

    .line 126
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-static {v1, v3}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x7d

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 2

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ܰۡۗ;->ۙ(Ll/᩶ۡۗ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (c)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 11
    sget-object v0, Ll/ۧ۟ۗ;->֡:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۛ()Z
    .locals 1

    .line 72
    iget v0, p0, Ll/ۤ֡ۗ;->ܰ:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۤ()Ll/֫֨ۗ;
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۤ֡ۗ;->֡:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ܺ()Ll/᩷ۢۗ;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۤ֡ۗ;->ܿ:Ll/᩷ۢۗ;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۤ֡ۗ;->᩶:Ljava/util/List;

    return-object v0
.end method

.method public final ᩵()Ljava/util/List;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۤ֡ۗ;->۟:Ljava/util/List;

    return-object v0
.end method

.method public final ᩶()I
    .locals 1

    .line 77
    iget v0, p0, Ll/ۤ֡ۗ;->ܰ:I

    return v0
.end method

.method public final ᩸()Ljava/util/List;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۤ֡ۗ;->ᩳ:Ljava/util/List;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
