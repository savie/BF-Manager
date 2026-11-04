.class public final Ll/ܽۡۗ;
.super Ll/ۨᩳۗ;
.source "83GQ"

# interfaces
.implements Ll/ۘۡۗ;


# instance fields
.field public final ֨:Ll/᩻ۡۗ;

.field public ۖ:Ljava/util/List;

.field public ۟:Ll/ۢᩳۗ;

.field public ۡ:Ll/֫֨ۗ;

.field public ۢ:Ll/ۢۘۗ;

.field public final ᩳ:Ll/۬ᩳۗ;


# direct methods
.method public constructor <init>(Ll/᩻ۡۗ;Ll/۬ᩳۗ;I)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ll/ۨᩳۗ;-><init>()V

    .line 23
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܽۡۗ;->ۖ:Ljava/util/List;

    .line 35
    iput-object p1, p0, Ll/ܽۡۗ;->֨:Ll/᩻ۡۗ;

    .line 36
    iput-object p2, p0, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    .line 37
    invoke-virtual {p2}, Ll/۬ᩳۗ;->᩸()Ll/֫֨ۗ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۡۗ;->ۡ:Ll/֫֨ۗ;

    .line 38
    new-instance p1, Ll/ۢᩳۗ;

    sget-object p2, Ll/ᩳᩳۗ;->ܿ:Ll/ᩳᩳۗ;

    invoke-direct {p1, p3, p2}, Ll/ۢᩳۗ;-><init>(ILl/ᩳᩳۗ;)V

    iput-object p1, p0, Ll/ܽۡۗ;->۟:Ll/ۢᩳۗ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 152
    const-class v0, Ll/ܽۡۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 155
    :cond_1
    check-cast p1, Ll/ܽۡۗ;

    .line 156
    iget-object v0, p0, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    iget-object p1, p1, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    invoke-virtual {v0, p1}, Ll/۬ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getDeclaringClass()Ll/᩻ۡۗ;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ܽۡۗ;->֨:Ll/᩻ۡۗ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    invoke-virtual {v0}, Ll/۬ᩳۗ;->ۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ll/֫֨ۗ;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ܽۡۗ;->ۡ:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    invoke-virtual {v0}, Ll/۬ᩳۗ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    invoke-virtual {v1}, Ll/۬ᩳۗ;->᩷()Ll/֨ᩳۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/۬ᩳۗ;->ۤ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽۡۗ;->ۡ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final typeName()Ljava/lang/String;
    .locals 1

    const-string v0, "field"

    return-object v0
.end method

.method public final ۘ()Ll/֫ܰۗ;
    .locals 1

    .line 139
    sget-object v0, Ll/֫ܰۗ;->۟:Ll/֫ܰۗ;

    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 0

    .line 46
    iput-object p1, p0, Ll/ܽۡۗ;->ۡ:Ll/֫֨ۗ;

    return-void
.end method

.method public final declared-synchronized ۙ(Ll/ۖۡۗ;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 111
    :try_start_0
    iget-object v1, p0, Ll/ܽۡۗ;->ۖ:Ljava/util/List;

    invoke-static {v1, p1}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ll/ۨᩳۗ;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۡۗ;->ۖ:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/ۢۘۗ;)V
    .locals 0

    .line 134
    iput-object p1, p0, Ll/ܽۡۗ;->ۢ:Ll/ۢۘۗ;

    return-void
.end method

.method public final ۙ(Ll/ۢᩳۗ;)V
    .locals 0

    .line 61
    iput-object p1, p0, Ll/ܽۡۗ;->۟:Ll/ۢᩳۗ;

    return-void
.end method

.method public final ۙۙ()Ll/ۢۘۗ;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܽۡۗ;->ۢ:Ll/ۢۘۗ;

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    invoke-virtual {v0}, Ll/۬ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۤۙ()Ljava/util/List;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܽۡۗ;->ۖ:Ljava/util/List;

    return-object v0
.end method

.method public final ۫ۙ()Z
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ܽۡۗ;->۟:Ll/ۢᩳۗ;

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v0

    return v0
.end method

.method public final ܰ()Ll/֫ۖۗ;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/ܽۡۗ;->֨:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴۙ()Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܽۡۗ;->۟:Ll/ۢᩳۗ;

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩷()Ll/ۢᩳۗ;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ܽۡۗ;->۟:Ll/ۢᩳۗ;

    return-object v0
.end method

.method public final ᩷(Ljava/util/List;)V
    .locals 0

    .line 107
    iput-object p1, p0, Ll/ܽۡۗ;->ۖ:Ljava/util/List;

    return-void
.end method

.method public final ᩷ۙ()Ll/᩻ۡۗ;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ܽۡۗ;->֨:Ll/᩻ۡۗ;

    return-object v0
.end method

.method public final ᩺()Ll/۬ᩳۗ;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ܽۡۗ;->ᩳ:Ll/۬ᩳۗ;

    return-object v0
.end method
