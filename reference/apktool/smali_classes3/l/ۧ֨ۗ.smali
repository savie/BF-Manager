.class public final Ll/ۧ֨ۗ;
.super Ljava/lang/Object;
.source "L6DR"


# instance fields
.field public ۙ:Ll/ۗܰۗ;

.field public ۤ:Z

.field public ۫:Ll/֫֨ۗ;

.field public ܳ:Ljava/util/List;

.field public ᩴ:Ljava/lang/String;

.field public ᩷:Z

.field public ᩸:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    return-void
.end method

.method public static ۙ(Ll/ۛ֨ۗ;Z)Ll/ۧ֨ۗ;
    .locals 3

    .line 21
    new-instance v0, Ll/ۧ֨ۗ;

    invoke-direct {v0}, Ll/ۧ֨ۗ;-><init>()V

    .line 36
    iget-object v1, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 46
    iput-object v1, v0, Ll/ۧ֨ۗ;->۫:Ll/֫֨ۗ;

    .line 23
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 38
    iput-object v1, v0, Ll/ۧ֨ۗ;->ᩴ:Ljava/lang/String;

    .line 252
    sget-object v1, Ll/֫۟ۗ;->᩻᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    .line 86
    iput-boolean v2, v0, Ll/ۧ֨ۗ;->᩸:Z

    const/4 v2, 0x1

    .line 94
    iput-boolean v2, v0, Ll/ۧ֨ۗ;->᩷:Z

    .line 252
    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    .line 86
    iput-boolean v1, v0, Ll/ۧ֨ۗ;->᩸:Z

    if-eqz p1, :cond_0

    .line 28
    new-instance p1, Ll/ܿ֨ۗ;

    .line 27
    iget v1, p0, Ll/ۛ֨ۗ;->ۢ:I

    const/4 v2, 0x0

    .line 28
    invoke-direct {p1, v1, v2, p0}, Ll/ܿ֨ۗ;-><init>(IILl/ۛ֨ۗ;)V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 63
    iput-object p0, v0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v1, p0, Ll/ۧ֨ۗ;->ۤ:Z

    if-eqz v1, :cond_0

    const-string v1, "final "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧ֨ۗ;->۫:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۧ֨ۗ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Ll/ۧ֨ۗ;->᩷:Z

    return-void
.end method

.method public final ۙ()Ll/ܿ֨ۗ;
    .locals 3

    .line 67
    iget-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    iget-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ֨ۗ;

    return-object v0

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CodeVar without SSA variables attached: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/ۧ֨ۗ;->ᩴ:Ljava/lang/String;

    return-void
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 0

    .line 63
    iput-object p1, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 0

    .line 46
    iput-object p1, p0, Ll/ۧ֨ۗ;->۫:Ll/֫֨ۗ;

    return-void
.end method

.method public final ۙ(Ll/ۗܰۗ;)V
    .locals 0

    .line 102
    iput-object p1, p0, Ll/ۧ֨ۗ;->ۙ:Ll/ۗܰۗ;

    return-void
.end method

.method public final ۙ(Ll/ۧ֨ۗ;)V
    .locals 2

    .line 90
    iget-boolean v0, p1, Ll/ۧ֨ۗ;->᩷:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 94
    iput-boolean v1, p0, Ll/ۧ֨ۗ;->᩷:Z

    .line 82
    :cond_0
    iget-boolean v0, p1, Ll/ۧ֨ۗ;->᩸:Z

    if-eqz v0, :cond_1

    .line 86
    iput-boolean v1, p0, Ll/ۧ֨ۗ;->᩸:Z

    .line 74
    :cond_1
    iget-boolean p1, p1, Ll/ۧ֨ۗ;->ۤ:Z

    if-eqz p1, :cond_2

    .line 78
    iput-boolean v1, p0, Ll/ۧ֨ۗ;->ۤ:Z

    :cond_2
    return-void
.end method

.method public final ۙ(Ll/ܿ֨ۗ;)V
    .locals 2

    .line 54
    iget-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    .line 57
    :cond_0
    iget-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 58
    iget-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public final ۚ()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Ll/ۧ֨ۗ;->᩸:Z

    return v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۧ֨ۗ;->ᩴ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Ll/ۧ֨ۗ;->ۤ:Z

    return-void
.end method

.method public final ۫()Z
    .locals 1

    .line 74
    iget-boolean v0, p0, Ll/ۧ֨ۗ;->ۤ:Z

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 90
    iget-boolean v0, p0, Ll/ۧ֨ۗ;->᩷:Z

    return v0
.end method

.method public final ᩴ()Ll/֫֨ۗ;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ۧ֨ۗ;->۫:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ۗܰۗ;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۧ֨ۗ;->ۙ:Ll/ۗܰۗ;

    return-object v0
.end method

.method public final ᩸()Ljava/util/List;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۧ֨ۗ;->ܳ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, Ll/ۧ֨ۗ;->᩸:Z

    return-void
.end method
